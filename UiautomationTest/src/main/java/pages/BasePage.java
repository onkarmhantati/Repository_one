package pages;

import utils.XmlReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by onkar.mhantati on 9/14/2017.
 */
public class BasePage {
    Map<String,String> elementsMap=new XmlReader().getXmlData(this.getClass().getSimpleName());

}
