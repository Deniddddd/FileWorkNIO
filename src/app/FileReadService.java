package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public static String readFromFile(String fileName) throws IOException {
        Path filePath = Paths.get(app.Files.BASE_URL + fileName + ".txt");
        return Files.readString(filePath);
    }
}