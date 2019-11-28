package homework_6_InputOutput;

import java.io.*;

class CharReaderWriter {

    static void copy(File inputFile, File outputFile) throws IOException {

        try (FileReader fileReader = new FileReader(inputFile); FileWriter fileWriter = new FileWriter(outputFile)) {
            int c;
            while ((c = fileReader.read()) >= 0) {
                fileWriter.write(c);
            }
        }
    }
}


