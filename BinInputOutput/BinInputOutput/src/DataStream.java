package BinInputOutput.src;

import java.io.*;

public class DataStream {
public static void main(String[] args) throws IOException {
try (
      DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
) {
    output.writeUTF("PESHO");
    output.writeDouble(1.2);
    output.writeUTF("PESHO2");
    output.writeDouble(11.2);
    output.close();
}
try (
      DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
) {
    System.out.println(input.readUTF() + " " + input.readDouble());
    System.out.println(input.readUTF() + " " + input.readDouble());
    System.out.println(input.readUTF() + " " + input.readDouble());
}
}
}
