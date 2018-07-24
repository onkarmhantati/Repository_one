
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by onkar.mhantati on 4/17/2018.
 */
public class CreateAndWriteXmlFile {
    public static void main(String[] args) {
        try {

            List<String> fileTestCases=new ArrayList();
            Element childOfClasses=null;
            Attr attr=null;
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document=documentBuilder.newDocument();
            Element rootElement =document.createElement("suite");
            attr=document.createAttribute("name");
            attr.setValue("HarmonyAutomation");
            rootElement.setAttributeNode(attr);
            document.appendChild(rootElement);

            Element listener=document.createElement("listener");
            rootElement.appendChild(listener);

            Element test=document.createElement("test");
            attr=document.createAttribute("name");
            attr.setValue("FailTestSuite");
            test.setAttributeNode(attr);
            rootElement.appendChild(test);

            Element classes =document.createElement("classes");
            test.appendChild(classes);


            fileTestCases.add("abc.pqr");
            fileTestCases.add("xyz.lmn");

            for(int i=0;i<fileTestCases.size();i++){
                childOfClasses=document.createElement("class");
                attr=document.createAttribute("name");
                attr.setValue(fileTestCases.get(i));
                childOfClasses.setAttributeNode(attr);
                classes.appendChild(childOfClasses);
            }


            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource source=new DOMSource(document);
            String path= System.getProperty("user.dir")+"/"+"fileXml.xml";
            StreamResult streamResult = new StreamResult(new File(path));




            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source,streamResult);

        }catch (ParserConfigurationException pce){
            pce.printStackTrace();
        }catch (TransformerException tfe){
            tfe.printStackTrace();
        }
    }
}
