package json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        send();
    }

    public static void send() throws Exception {
        BufferedReader br = null;
        try {
            String targetUrl = "http://api.harmonytoc.forgeahead.io/api/conflicts/conflictResources";
            URL url = new URL(targetUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept-Encoding", "gzip");
            System.out.println("Length: " + connection.getContentLength());

            InputStream inputStream = null;
            if (connection.getContentEncoding().equals("GZip"))
                inputStream = new BufferedInputStream(new GZIPInputStream(connection.getInputStream()));
            else
                inputStream = new BufferedInputStream(connection.getInputStream());

            String jsonText = readAll(inputStream);
            Gson gson = new Gson();
            br = new BufferedReader(new InputStreamReader(inputStream));
            ConflictResources result;
            result = gson.fromJson(jsonText, ConflictResources.class);
            if (result != null) {
                System.out.println(result.getData().getBestPracticeStrategy());

                JsonObject object = gson.fromJson(jsonText, JsonObject.class);
                System.out.println("JsonObject : " + object);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readAll(InputStream rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}



