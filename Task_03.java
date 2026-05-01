package Generics;

import java.util.Scanner;

// Generic Class with two parameters
class Login<T, U> {
    private T username;
    private U password;

    public Login(T username, U password) {
        this.username = username;
        this.password = password;
    }

    public void checkLogin(T inputUser, U inputPass) {
        if (username.equals(inputUser) && password.equals(inputPass)) {
            System.out.println("You have logged in successfully.");
        } else {
            System.out.println("Invalid Username or Password.");
            System.exit(0); // terminate program
        }
    }
}

class Generic_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login<String, String> obj = new Login<>("admin", "1234");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        obj.checkLogin(user, pass);

        sc.close();
    }
}
