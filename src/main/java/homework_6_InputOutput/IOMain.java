package homework_6_InputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IOMain {

   private static File personal_data = new File("C:\\Users\\ighincolov\\IdeaProjects\\Internship_Java_Tasks_Ion_Ghincolov\\Tasks_Files\\personal_data.txt");
   private static File backUp_personal_data = new File("C:\\Users\\ighincolov\\IdeaProjects\\Internship_Java_Tasks_Ion_Ghincolov\\Tasks_Files\\backup_personal_data.txt");
   private static Target ion_ghincolov = new Target("Ion", "Ghincolov", 30,85,170);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CharReaderWriter.copy(personal_data, backUp_personal_data);

        BufferReaderWriter.modify(personal_data, "33", "35");

        File newFile = new File("C:\\Users\\ighincolov\\IdeaProjects\\Internship_Java_Tasks_Ion_Ghincolov\\Tasks_Files\\ion_ghincolov.txt");
        newFile.createNewFile();
        ObjectReadWrite.store(ion_ghincolov, newFile);
        Target target = (Target) ObjectReadWrite.getObject(newFile);
        System.out.println(target.toString());

        String[] strings = {"Ion", "Vasile", "Gigi", "Jora"};
        List<String> stringList = Arrays.asList(strings);
        NIO_ListReaderWriter.listToFile(stringList, "ion_ghincolov_2");
        List<String> stringList2 = NIO_ListReaderWriter.listFromFile("ion_ghincolov_2");
    }
}

