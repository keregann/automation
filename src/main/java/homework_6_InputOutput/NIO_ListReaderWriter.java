package homework_6_InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class NIO_ListReaderWriter {
    static void listToFile(List<String> list, String filename) throws IOException {
        Path path = Paths.get("C:\\Users\\ighincolov\\IdeaProjects\\Internship_Java_Tasks_Ion_Ghincolov\\Tasks_Files\\"+filename+".txt");
        for (String s : list) {
            Files.write(path, s.getBytes());
        }
    }

    static List<String> listFromFile(String filename) throws IOException {
        Path path = Paths.get("C:\\Users\\ighincolov\\IdeaProjects\\Internship_Java_Tasks_Ion_Ghincolov\\Tasks_Files\\"+filename+".txt");
        return Files.readAllLines(path);
    }



    static void copyFile(Path oldFile, Path newFile) throws IOException {
        OutputStream outputStream = new FileOutputStream(newFile.toFile());
            Files.copy(oldFile, outputStream);
    }
}

