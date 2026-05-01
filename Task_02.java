package FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_02{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();

        File file = new File("Student.txt");

        System.out.print("Enter PF Lab marks: ");
        int pfLab = sc.nextInt();

        System.out.print("Enter PF Theory marks: ");
        int pfTheory = sc.nextInt();

        ArrayList<String> courses = new ArrayList<>();

        courses.add("PF Lab");
        courses.add("PF Theory");
        courses.add("Multivariable Calculus");
        // Check condition for OOP registration
        if (pfLab >= 50 && pfTheory >= 50) {
            if (courses.size() < 5) {
                courses.add("OOP Lab");
                courses.add("OOP Theory");
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write("Student Name: " + name);
        writer.newLine();
        writer.write("Student ID:   " + id);
        writer.newLine();
        writer.newLine();
        writer.write("Registered Courses (3 credit hours each):");
        writer.newLine();
        writer.write("------------------------------------------");
        writer.newLine();

        int i = 1;
        for (String course : courses) {
            writer.write(i + ". " + course);
            writer.newLine();
            i++;
        }

        writer.newLine();
        writer.write("Total Courses     : " + courses.size());
        writer.newLine();
        writer.write("Total Credit Hours: " + (courses.size() * 3) + " / 15");
        writer.newLine();

        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        System.out.println("\n--- File Content ---");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
