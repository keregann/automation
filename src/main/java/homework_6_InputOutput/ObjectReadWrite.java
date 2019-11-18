package homework_6_InputOutput;

import java.io.*;

class ObjectReadWrite {
static void store(Object object, File file) throws IOException {
    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
    outputStream.writeObject(object);
    outputStream.close();
}

static Object getObject(File file) throws IOException, ClassNotFoundException {
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
    return inputStream.readObject();
}

}
