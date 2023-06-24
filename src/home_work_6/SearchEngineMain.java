package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.RegExSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchEngineMain {
    public static void main(String[] args) {
        File book = new File("src/home_work_6/files/Война и мир_книга.txt");
        ISearchEngine easySearch = new EasySearch();
        ISearchEngine regSearch = new RegExSearch();

        String fullBook = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(book))) {
            String read;
            while ((read = reader.readLine()) != null){
                fullBook = fullBook + read;            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("В книге Война и Мир слово -война- повторяется - " + easySearch.search(fullBook,"война") + " раз.");
        System.out.println("В книге Война и Мир слово -и- повторяется - " + easySearch.search(fullBook,"и") + " раз.");
        System.out.println("В книге Война и Мир слово -мир- повторяется - " + easySearch.search(fullBook,"мир") + " раз.");

        System.out.println();

        System.out.println("В книге Война и Мир слово -война- повторяется - " + regSearch.search(fullBook,"война") + " раз.");
        System.out.println("В книге Война и Мир слово -и- повторяется - " + regSearch.search(fullBook,"и") + " раз.");
        System.out.println("В книге Война и Мир слово -мир- повторяется - " + regSearch.search(fullBook,"мир") + " раз.");

    }
}
