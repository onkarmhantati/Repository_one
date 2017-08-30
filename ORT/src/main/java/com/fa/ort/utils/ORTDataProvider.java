package com.fa.ort.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Onkar on 7/12/2017.
 */
public class ORTDataProvider {
    public Iterator<Object[]> getData(String fileName){
        String[] data;
        String line;
        BufferedReader br;
        List<Object[]> testData= new ArrayList<>();
        try{
            br=new BufferedReader(new FileReader("src/test/resources/testData/" + fileName + ".csv"));
            while((line=br.readLine())!=null)
            {
                data=line.split("\\s*,\\s*");
                data= Arrays.copyOfRange(data,0,data.length);
                for(int i=0;i<data.length;i++){
                    if(data[i].contains("^")){
                        data[i]=data[i].replace("^",",");
                    }
                }
                testData.add(data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
            return testData.iterator();
    }
}
