package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;

import java.io.*;
import java.util.Scanner;

public class UniversalFileSearch {
    public static void main(String[] args) {
        String askPath = "Введите адрес каталога книг, для завершения программы введите слово - end: ";
        String askFileName = "Ведите имя файла в котором хотите осуществить поиск, для завершения программы введите слово - end: ";
        String askSearch = "Введите слово которое хотите найти или слово - back ,для выбора другого файла, для завершения программы введите слово - end: ";
        SaveFileData dataSaver = new SaveFileData();

        getCatalog(askPath, dataSaver);

        if (dataSaver.getFilePath() != null) {

            getFileList(dataSaver.getWorkingCatalog(), askPath, dataSaver);

            if (dataSaver.getFilePath() != null) {

                dataSaver = getFileToRead(dataSaver.getFilePath(), askFileName, dataSaver);

                writeDataToFile(askSearch, askFileName, dataSaver);
            }
        }
    }

    /**
     * Метод предназначен поиска файлов в переданном каталоге. Проводится контроль на корректность введенных пользователем данных. Если пользователь ввел корректный путь распечатать список файлов, расположенных в данном каталоге.
     * @param catalog каталог файлов переданный пользователем.
     * @param askPath текст вопроса который необходимо задать в случае если данные не прошли валидацию.
     * @param dataSaver экземпляр хранилища данных.
     */
    private static void getFileList (File catalog, String askPath, SaveFileData dataSaver) {
        if (catalog.isDirectory()) {
            File [] filesList = catalog.listFiles();

            if (filesList.length != 0) {
                for (File nextFile : filesList ) {
                    if (nextFile.isFile()) {
                        System.out.println(nextFile.getName());
                    }
                }
            } else {
                System.out.println("В указанной Вами папке нет файлов");
                getCatalog(askPath, dataSaver);

                if (dataSaver.getFilePath() != null) {
                    getFileList(dataSaver.getWorkingCatalog(), askPath, dataSaver);
                }
            }
        }
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
     * Метод предназначен для проверки файла который указывает пользователь, в случае введения корректных данных пользователем сохранения данных о файле с которым проводится работа.
     * @param catalogPath путь к каталогу в котором осуществияется поиск файла.
     * @param questionText текст вопроса который необходимо задать пользователю.
     * @param dataSaver экземпляр хранилища куда необходимо поместить данные о файле.
     * @return возвращается заполненный экзмпляр хранилища, в который были переданы имя файла с которым проводится работа. А так же строка с данными хранящимися в файле.
     */
    private static SaveFileData getFileToRead (String catalogPath, String questionText, SaveFileData dataSaver) {
        String chosenBook = getClientInput(questionText);
        if (!chosenBook.equals("end")) {
            String readingFile = catalogPath + chosenBook;

            try {
                File book = new File(readingFile);
                if (book.exists()) {
                    if (book.isDirectory()) {
                        System.out.println("Вы указали путь к папке! Укажите путь к файлу или введите слово - end");
                        getFileToRead(catalogPath, questionText, dataSaver);
                    } else if (book.isFile()) {
                        dataSaver.setFileName(chosenBook);
                        dataSaver.setFileToString(createString(book));
                    }
                } else {
                    System.out.println("Указан неверный путь! Такой папки или файла не существует! Укажите путь к файлу или введите слово - end");
                    getCatalog(questionText, dataSaver);
                }
            } catch (NullPointerException e) {
                System.out.println("Вы не указали путь! Укажите путь к файлу или введите слово - end");
                getCatalog(questionText, dataSaver);
            }
        }

        return dataSaver;
    }

    /**
     * Метод предназначен для получения у пользователя пути к каталогу с которым необходимо работать, проверки валидности введенных пользователем данных, сохранению файла с которым необходимо провести дальнейшую работу.
     * @param questionText текст вопроса который необходимо отобразить пользователю.
     * @param dataSaver экземпляр хранилища в которое необходимо сохранить данные о рабочем каталоге.
     * @return возвращает экземляр хранилища с заполненной информацией о пути к каталогу, а также сохраненный каталог.
     */
    private static SaveFileData getCatalog (String questionText, SaveFileData dataSaver) {

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
                        getCatalog(questionText, dataSaver);
                    } else if (catalog.isDirectory()) {
                        dataSaver.setFilePath(catalogPath);
                        dataSaver.setWorkingCatalog(catalog);
                    }
                } else {
                    System.out.println("Указан неверный путь! Такой папки или файла не существует! Укажите путь к папке или введите слово - end");
                    getCatalog(questionText, dataSaver);
                }
            } catch (NullPointerException e) {
                System.out.println("Вы не указали путь! Укажите путь к папке или введите слово - end");
                getCatalog(questionText, dataSaver);
            }
        } else {
            dataSaver.setFilePath(null);
            dataSaver.setWorkingCatalog(null);
        }
        return dataSaver;
    }

    /**
     * Метод предназначен для записи результатов поиска в файл.
     * @param askSearch текст вопроса который необходимо отобразить пользователю для поиска слов.
     * @param askFileName текст вопроса который необходимо отобразить пользователю для перехода в другой файл.
     * @param dataSaver экземпляр хранилища данных по рабочему каталогу.
     */
    private static void writeDataToFile (String askSearch, String askFileName, SaveFileData dataSaver) {
        String searchingWord = "";

        if (dataSaver.getFileName() != null) {

            while (!searchingWord.equals("end")) {

                searchingWord = getClientInput(askSearch);

                if (!searchingWord.equals("back")) {

                    ISearchEngine search = new EasySearch();

                    long wordCounter = search.search(dataSaver.getFileToString(), searchingWord);

                    String file = "src/home_work_6/files/результат.txt";

                    String toFile = "";

                    if (!searchingWord.equals("end")) {
                        toFile = "В книге - " + dataSaver.getFileName() + " слово - " + searchingWord + " повторятеся " + wordCounter + " раз \n";

                        FileWriter fr = null;
                        try {
                            fr = new FileWriter(file, true);
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
                } else {
                    dataSaver = getFileToRead(dataSaver.getFilePath(), askFileName, dataSaver);
                    searchingWord = "";
                }
            }
        }
    }

    /**
     * Класс предназначен для хранения данных о пути к каталогу, имени файла с которым ведется работа, строки с текстом из файла, а также каталог с которым проводится работа.
     */
    public static class SaveFileData {
        private String fileName;
        private String filePath;
        private String fileToString;
        private File catalog;

        public String getFilePath() {
            return filePath;
        }
        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }
        public File getWorkingCatalog() {
            return catalog;
        }
        public void setWorkingCatalog(File catalog) {
            this.catalog = catalog;
        }
        public String getFileName() {
            return fileName;
        }
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
        public String getFileToString() {
            return fileToString;
        }
        public void setFileToString(String fileToString) {
            this.fileToString = fileToString;
        }
    }
}