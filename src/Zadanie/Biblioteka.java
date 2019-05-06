package Zadanie;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Date;

public class Biblioteka {
    private String bookTitle,
            userName,
            userSurname;
    private int ISBN,
            bookLimit,
            userId,
            borrowId;
    private Date borrowDate,
            returnDate;
    private boolean bookAvailability;
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
    public void returnBook(int borrowId) {

    }

    public void borrowBook(int userId, int ISBN) {

    }

    public void addBook(String bookTitle, int ISBN) {

    }

    public void removeBook(int ISBN) {

    }

    public void checkUser(int userId){

    }

}

