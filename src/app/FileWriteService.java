package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public static void writeToFile(String fileName, String content) throws IOException {
        Path filePath = Paths.get(app.Files.BASE_URL + fileName + ".txt");
        Files.writeString(filePath, content);
    }
}