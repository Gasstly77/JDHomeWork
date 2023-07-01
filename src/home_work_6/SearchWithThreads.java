package home_work_6;

import home_work_6.jobs.SearchingJob;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SearchWithThreads {
    public static void main(String[] args) {
        String askPath = "Введите адрес каталога книг, для завершения программы введите слово - end: ";
        String askSearch = "Введите слово которое хотите найти, для завершения программы введите слово - end: ";

        String workingCatalog = getCatalog(askPath);
        File files [] = getFileList(workingCatalog, askPath);

        String fileName = "src/home_work_6/files/результат потоков.txt";
        File fileToWrite = new File(fileName);
        String toSearch = "";
        int threadAmount = 1;

        if (files.length > 1) {
            threadAmount = files.length/2;
        } else if (files.length > 5) {
            threadAmount = files.length/3;
        } else if (files.length > 9) {
            threadAmount = files.length/5;
        }

        List<Future<String>> futures = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(threadAmount);

        do {
            toSearch = getClientInput(askSearch);

            for (File file : files) {
                if (file.getName().endsWith(".txt")) {
                    futures.add(executor.submit(new SearchingJob(file, toSearch, fileToWrite)));
                }
            }
        } while (!toSearch.equals("end"));

        executor.shutdownNow();
    }

    /**
     * Метод предназначен для формирования списка файлов в выбранном каталоге.
     * @param askPath текст вопроса который необходимо задать в случае если данные не прошли валидацию.
     */
    private static File[] getFileList (String workingCatalog, String askPath) {
        File catalog = new File (workingCatalog);
        File [] filesList = catalog.listFiles();

        if (filesList.length == 0) {
            System.out.println("В указанной Вами папке нет файлов");
            getCatalog(askPath);

            if (workingCatalog != null) {
                getFileList(workingCatalog, askPath);
            }
        }
        return filesList;
    }

    /**
     * Метод предназначен для получения введенных пользоватлем данных.
     * @param question текст вопроса который необходимо задать пользоватлею.
     * @return возвращает строку с информацией введенной пользоватлем в консоль.
     */
    private static String getClientInput (String question) {
        Scanner console = new Scanner(System.in);
        System.out.print(question);
        return console.nextLine();
    }

    /**
     * Метод предназначен для получения у пользователя пути к каталогу с которым необходимо работать, проверки валидности введенных пользователем данных, сохранению файла с которым необходимо провести дальнейшую работу.
     * @param questionText текст вопроса который необходимо отобразить пользователю.
     * @return путь к рабочему каталогу с которым в дальнейшем будет проводиться работа.
     */
    private static String getCatalog (String questionText) {

        String catalogPath = getClientInput(questionText);

        if (!catalogPath.equals("end")) {
            if (!catalogPath.isBlank()) {
                if (!catalogPath.endsWith("/") && !catalogPath.endsWith("\\")) {
                    catalogPath += "/";
                }
            }

            try {
                File catalog = new File(catalogPath);
                if (catalog.exists()) {
                    if (catalog.isFile()) {
                        System.out.println("Вы указали путь к файлу! Укажите путь к папке или введите слово - end");
                        getCatalog(questionText);
                    } else if (catalog.isDirectory()) {
                        return catalogPath;
                    }
                } else {
                    System.out.println("Указан неверный путь! Такой папки или файла не существует! Укажите путь к папке или введите слово - end");
                    getCatalog(questionText);
                }
            } catch (NullPointerException e) {
                System.out.println("Вы не указали путь! Укажите путь к папке или введите слово - end");
                getCatalog(questionText);
            }
        }

        return catalogPath;
    }
}
