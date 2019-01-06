package lesson13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;


public class Task1 implements FileName {
    public static final String WORD_TO_SEARCH = "public";
    public static final String WORD_TO_REPLACE = "private";

    void task1() {
        try {
            Path path = Paths.get(FILE_NAME_TASK1);
            String content = new String(Files.readAllBytes(path));
            content = content.replaceAll(WORD_TO_SEARCH, WORD_TO_REPLACE);
            Files.write(path, Collections.singleton(content));
            System.out.println(content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
