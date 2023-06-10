package extra_home_work_collections.utils;

import extra_home_work_collections.api.NameGenerator;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class GenerateNick implements NameGenerator {
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
                randomName = randomName + (char) (65 + (int) (Math.random() * 25));

            } else {
                randomName = randomName + (char) (97 + (int) (Math.random() * 122)); }
        }

        return randomName;
    }

    @Override
    public String randomName() {
        return null;
    }

    @Override
    public String randomNameFormFile() throws Exception {
        FileReader reader = new FileReader("src/extra_home_work_collections/workfiles/NickList.txt");
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
