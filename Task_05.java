package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Task_05 {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            File file = new File("Confidential.txt");
            file.createNewFile();

            System.out.print("Enter designation (Faculty/Student): ");
            String designation = sc.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            String permission = " ";

            // Assigning permissions
            if (designation.equalsIgnoreCase("Faculty")) {
                permission = "RWX (Read, Write, Execute)";
            }
            else if (designation.equalsIgnoreCase("Student")) {
                permission = "R (Read Only)";
            }
            else {
                permission = "No Access";
            }

            // Writting to file
            writer.write("Designation: " + designation);
            writer.newLine();
            writer.write("Permissions: " + permission);

            writer.close();

            System.out.println("\n--- Access Rights ---");
            System.out.println("Designation: " + designation);
            System.out.println("Permissions: " + permission);
        }
    }

