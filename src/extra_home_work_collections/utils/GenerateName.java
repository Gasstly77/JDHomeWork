package extra_home_work_collections.utils;

import extra_home_work_collections.api.NameGenerator;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class GenerateName implements NameGenerator {
    public  String randomNameSymbols () {
        String randomName = "";

        int startNumber = 5;
        int maxNumber = 10;
        int randomLength = startNumber + (int) (Math.random() * maxNumber);

        for (int i = 0; i <= randomLength; i++) {
            randomName = randomName + (char) (65 + (int) (Math.random() * 100));
        }

        return randomName;
    }

    public String randomNameLatter () {
        String randomName = "";

        int startNumber = 3;
        int maxNumber = 10;
        int randomLength = startNumber + (int) (Math.random() * maxNumber);

        for (int i = 0; i <= randomLength; i++) {
            if (i == 0) {
                randomName = randomName + (char) (1040 + (int) (Math.random() * 31));

            } else {
                randomName = randomName + (char) (1072 + (int) (Math.random() * 31)); }
        }

        return randomName;
    }

    public String randomName () {
        String [] nameList= {"Артём","Олег","Виктор","Сергей","Иван","Герман","Энвер","Александр","Игорь","Антон","Джон","Эдвард","Николай","Василий","Валерий","Эдгар"};
        return nameList[(int) (Math.random()*nameList.length-1)];
    }

    public String randomNameFormFile () throws Exception {
        FileReader reader = new FileReader("src/extra_home_work_collections/workfiles/NamesList.txt");
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
