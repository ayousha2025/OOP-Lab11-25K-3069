package FileHandling;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Task_01{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }

        File file = new File("file.txt");
        //Writing to file

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for (String item : list) {
                bw.write(item);
                bw.newLine();
            }
            bw.close();
            System.out.println("\nFile written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\nReading from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (file.delete()) {
            System.out.println("\nFile deleted successfully.");
        } else {
            System.out.println("\nFailed to delete the file.");
        }

        sc.close();
    }
}