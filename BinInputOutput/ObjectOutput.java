import java.io.*;
public class ObjectOutput {
    public static void main(String[] args) throws IOException {
    try (
          ObjectOutputStream output =
                  new ObjectOutputStream(new FileOutputStream("temp.dat"));
    ) {
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeObject(new java.util.Date());
    }
}
}