package Zadanie;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Date;

public class Biblioteka {
    private String bookTitle;
    private int ISBN,
            bookLimit;
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder builder;
    private Document doc;
    private File inputFile;
    Biblioteka(File inputFile){
        try{
            this.inputFile = inputFile;
            dbFactory = DocumentBuilderFactory.newInstance();
            builder = dbFactory.newDocumentBuilder();
            doc = builder.parse(this.inputFile);
        }catch (Exception e){
            System.out.println("Cannot find a file");
        }
    }
    public void returnBook(int ISBN) {

    }

    public void borrowBook(int ISBN) {

    }

    public void addBook(String bookTitle, int ISBN) {

    }

    public void removeBook(int ISBN) {

    }
    public void showBooks(){
        NodeList nList = doc.getElementsByTagName("book");
        System.out.println("---------------------------");

        for(int temp = 0; temp <nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("Aktualny element: "+nNode.getNodeName());
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Book title: "+eElement.getElementsByTagName("title").item(0).getTextContent());
                }
        }
    }
}

