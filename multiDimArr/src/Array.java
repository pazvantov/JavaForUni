import java.io.*;
public class Array {
    public static void main(String[] args)  throws java.io.IOException {

        File file = new File("res.txt");
        File file1 = new File("res1.txt");
        int i = 0;
        int[][][] arr = {
                {{14, 21, 1}, {15, 17, 20}, {98, 17, 54}},
                {{11, 15, 17}, {38, 24, 81}, {5, 14, 21}},
                {{30, 18, 24}, {66, 70, 99}, {0, 11, 15}}
        };

        if (file.exists() && file1.exists()) {
            System.out.println("Files already exists");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        for (int[][] num : arr) {
            for (int[] num1 : num) {
                for (int num2 : num1) {
                    output.print(" " + num2);
                    i++;
                    if (i % 9 == 0) {
                        output.println();
                    }
                }
            }
        }
        output.close();
    }
}

