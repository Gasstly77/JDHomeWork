package extra_home_work_collections.utils;

import extra_home_work_collections.api.NameGenerator;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class GenerateAlias implements NameGenerator {

    @Override
    public String randomNameSymbols() {
        String randomName = "";

        int startNumber = 2;
        int maxNumber = 12;
        int randomLength = startNumber + (int) (Math.random() * maxNumber);

        for (int i = 0; i <= randomLength; i++) {
            randomName = randomName + (char) (1 + (int) (Math.random() * 2000));
        }

        return randomName;
    }

    @Override
    public String randomNameLatter() {
        String randomName = "";

        int startNumber = 2;
        int maxNumber = 13;
        int randomLength = startNumber + (int) (Math.random() * maxNumber);

        for (int i = 0; i <= randomLength; i++) {
            if (i == 0) {
                randomName = randomName + (char) (1040 + (int) (Math.random() * 31));

            } else {
                randomName = randomName + (char) (1072 + (int) (Math.random() * 31)); }
        }

        return randomName;
    }

    @Override
    public String randomName() {
        String [] nameList= {"Мерфи","Оливер","Бакстер","Мисси","Рози","Джоуи","Зевс","Сэм","Биар","Джек","Бэнтли","Холли","Лулу","Макс","Люк","Ханни"};
        return nameList[(int) (Math.random()*nameList.length-1)];
    }

    @Override
    public String randomNameFormFile() throws Exception {
        FileReader reader = new FileReader("src/extra_home_work_collections/workfiles/AliasList.txt");
        Scanner nextName = new Scanner(reader);
        List<String> nameList = new ArrayList<>();
        while (nextName.hasNext()) {
            nameList.add(nextName.nextLine());
        }
        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * nameList.size());
            return nameList.get(value);
        };
        return randomName.get();
    }
}
