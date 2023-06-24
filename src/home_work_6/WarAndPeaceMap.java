package home_work_6;

import home_work_6.compatarors.CompareMapByValue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class WarAndPeaceMap {
    public static void main(String[] args) {
        File book = new File("src/home_work_6/files/Война и мир_книга.txt");

        StringBuilder fullBook = new StringBuilder();

        Scanner topN = new Scanner(System.in);
        System.out.print("Введите топ N слов встречающихся в тексте: ");
        int n = topN.nextInt();

        try (BufferedReader reader = new BufferedReader(new FileReader(book))) {
            String read;
            while ((read = reader.readLine()) != null){
                fullBook.append(read);            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9aа-яА-Я-]+|-{2,}");
        String[] wordsList = pattern.split(fullBook.toString());

        Map<String, Integer> wordCounter = new HashMap<>();
        for (String nextWord : wordsList) {
            if (nextWord != "") {
                if (!wordCounter.containsKey(nextWord)) {
                    wordCounter.put(nextWord, 1);
                } else {
                    wordCounter.put(nextWord, wordCounter.get(nextWord) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> wordsMap = new ArrayList<>(wordCounter.entrySet());

        wordsMap.sort(new CompareMapByValue());


        for (int i = 0; i < n && n >= 0 && n < wordsMap.size(); i++) {
            System.out.println(wordsMap.get(i));
        }
    }
}
