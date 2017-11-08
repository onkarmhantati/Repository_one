package Test.pageControllers;

import Test.utils.XmlFileReader;

import java.util.Map;

/**
 * Created by onkar.mhantati on 9/13/2017.
 */
public class BasePage {

    Map<String,String> elementMap=new XmlFileReader().getXmlData(this.getClass().getSimpleName());



}
