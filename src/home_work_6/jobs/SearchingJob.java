package home_work_6.jobs;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;

import java.io.*;
import java.util.concurrent.Callable;

public class SearchingJob implements Callable<String> {
    private File file;
    private String toSearch;
    private File toWrite;

    public SearchingJob(File file, String toSearch, File toWright) {
        this.toSearch = toSearch;
        this.file = file;
        this.toWrite = toWright;
    }

    /**
     * Метод чтения файла, поиска слова и записи результата в файл.
     * @return Возвращает строку "Поток закончил работу", по окончанию записи найденного слова в файл.
     */
    @Override
    public String call() {
        String stringFromFile = createString(file);
        writeDataToFile(toSearch, stringFromFile, toWrite, file);

        return "Поток закончил работу";
    }

    /**
     * Метод предназначен для создания строки из текста размещенного в переданном файле.
     * @param file файл в котором размещен текст, который необходимо обработать.
     * @return возвращает строку в которую передан весь текст из файла.
     */
    private static String createString (File file) {
        StringBuilder fullBook = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String read;
            while ((read = reader.readLine()) != null){
                fullBook.append(read);            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fullBook.toString();
    }

    /**
     * Метод предназначен для записи результатов поиска в файл.
     */
    private static void writeDataToFile (String toSearch, String stringFromFile, File toWrite, File file) {
        String searchingWord = toSearch;

        ISearchEngine search = new EasySearch();

        long wordCounter = search.search(stringFromFile, toSearch);

        String toFile = "";

        if (!searchingWord.equals("end")) {
            toFile = "В книге - " + file.getName() + " слово " + "\'" + toSearch + "\'" + " повторяется " + wordCounter + " раз \n";

            FileWriter fr = null;
            try {
                fr = new FileWriter(toWrite, true);
                fr.write(toFile);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
