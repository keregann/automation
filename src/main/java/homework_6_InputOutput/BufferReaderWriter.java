package homework_6_InputOutput;

import java.io.*;

class BufferReaderWriter {
    static void modify(File inputFile, String oldString, String newString) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String originalString = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line = bufferedReader.readLine();

            while (line != null){
                originalString = originalString + line + System.lineSeparator();
                line = bufferedReader.readLine();
            }
            String modifiedString = originalString.replaceAll(oldString, newString);
            bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
            bufferedWriter.write(modifiedString);
        }finally {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }
}
