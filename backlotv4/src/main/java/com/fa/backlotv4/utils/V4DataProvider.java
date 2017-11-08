package com.fa.backlotv4.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by onkar.mhantati on 9/18/2017.
 */
public class V4DataProvider {
    public Iterator<Object[]> getTestData(String fileName) {
        String[] data;
        String line;
        BufferedReader br;
        List<Object[]> testData = new ArrayList<Object[]>();
        try {
            br = new BufferedReader(new FileReader("src/test/resources/testData/" + fileName + ".csv"));
            while ((line = br.readLine()) != null) {
                data = line.split("\\s*,\\s*");
                data = Arrays.copyOfRange(data, 0, data.length);
                for (int i = 0; i < data.length; i++) {
                    if (data[i].contains("^")) {
                        data[i] = data[i].replace("^", ",");
                    }
                }
                testData.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return testData.iterator();
    }
}
