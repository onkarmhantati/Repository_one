package Test.utils;

//import javax.swing.text.Document;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

/**
 * Created by onkar.mhantati on 9/11/2017.
 */
public class XmlFileReader {

public static HashMap<String,String> getXmlData(String fileName){
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
                map.put(element.getAttribute("controlName"),element.getAttribute("locaterType")+"_TBD_"+element.getAttribute("locaterValue"));
            }
        }
    }catch (Exception e){
        e.printStackTrace();
    }
   return map;
}
}
