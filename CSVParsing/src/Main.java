import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("resources/numbers.csv");
            Scanner myReader = new Scanner(myObj);
            String[] values;

            List<Person> arr = new ArrayList<Person>();
            int count = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                count++;
                values = data.split(",");
                for (int i = 0 ;i < 3 ;i++) {
                    values[i] = values[i].replaceAll("\"","");
                }
                arr.add(new Person(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2])));
            }
            myReader.close();

            while(count != 0) {
                arr.get(count - 1).Print();
                count--;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Eroor");
            e.printStackTrace();
        }
    }
}