package home_work_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Pattern;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        File book = new File("src/home_work_6/files/Война и мир_книга.txt");

        String fullBook = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(book))) {
            String read;
            while ((read = reader.readLine()) != null){
                fullBook = fullBook + read;            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9aа-яА-Я-]+|-{2,}");
        String[] wordsList = pattern.split(fullBook);

        HashSet <String> uniqWords = new HashSet<>();

        for (String nextWord : wordsList) {
            uniqWords.add(nextWord);
        }
        uniqWords.remove("");

        System.out.println("количество использованных слов: " + uniqWords.size());

    }
}
