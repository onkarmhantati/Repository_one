import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by onkar.mhantati on 9/13/2017.
 */
public class XmlReader {

    public static void main(String[] args) {

        String fileN="LogInPage";
        Map<String,String> map =new HashMap<String, String>();
        map=readXmlFile(fileN);
        System.out.println(map.get("controlName"));


    }

    public static Map<String, String> readXmlFile(String fileName){
        String key,vlaue;
        HashMap<String ,String> map =new HashMap<String,String>() ;
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try{
            builder=factory.newDocumentBuilder();
            File f=new File("src/main/resources/" +fileName+ ".xml");
            Document doc=builder.parse(f);
            NodeList nodeList = doc.getElementsByTagName("Element");
            for (int i=0;i<nodeList.getLength();i++){
                Node node = nodeList.item(i);
                if (node.getNodeType()==Node.ELEMENT_NODE){
                    Element element = (Element)node;
                    key=element.getAttribute("controlName");
                    vlaue=element.getAttribute("locaterType")+"_TBD_"+element.getAttribute("locaterValue");
                    //System.out.println(element.getAttribute("controlName")+" "+element.getAttribute("locaterType")+" "+element.getAttribute("locaterValue"));
                    //System.out.println(key+" "+vlaue);
                    map.put(key,vlaue);
                }

            }



        }catch (Exception e){
            e.printStackTrace();
        }

        //return map;
        return map;
    }

}