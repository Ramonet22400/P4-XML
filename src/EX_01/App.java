package EX_01;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class App {
        private static final String XATACA_URL = "https://www.xataka.com/sitemap_index.xml";

        public static void main(String[] args) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {

                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(XATACA_URL);

                // La normalización es opcional, pero recomendado para XML mal formateados
                // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
                doc.getDocumentElement().normalize();

                System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
                System.out.println("------");
                NodeList list = doc.getElementsByTagName("sitemap");

                for (int temp = 0; temp < list.getLength(); temp++) {
                    Node node = list.item(temp);

                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String url_loc = element.getElementsByTagName("loc").item(0).getTextContent();
                        System.out.println(url_loc);
                    }
                }

            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }