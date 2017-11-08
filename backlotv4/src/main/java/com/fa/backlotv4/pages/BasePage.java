package com.fa.backlotv4.pages;

import com.fa.backlotv4.utils.XmlFileReader;

import java.util.Map;

/**
 * Created by onkar.mhantati on 9/19/2017.
 */
public class BasePage {
    public static Map<String,String> elementMap=null;
    public  static Map<String,String> getElementMap(){
        String fileName=Thread.currentThread().getStackTrace()[2].getFileName().split("\\.")[0];
        String oldName=null;
        if (elementMap!=null && oldName==fileName)
            return elementMap;
        oldName=fileName;
        return elementMap=new XmlFileReader().getXmlData(fileName);
    }
}


