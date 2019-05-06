package Zadanie;

import java.io.File;

public class Main {
    public static void main(String args[]){
        File plik;
        plik = new File("D:/Biblioteka/src/Zadanie/Dane.xml");
        Biblioteka b1 = new Biblioteka(plik);
    }
}
