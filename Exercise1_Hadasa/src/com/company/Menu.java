package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by hackeru on 2/28/2017.
 */
public class Menu {

    public Menu() {
        mainMenu();
    }

    public static void mainMenu() {

        printMenu();
        String input = readInput();
        if (input.length() != 0) {
            switch (input) {
                case "1":
                    //לקלוט נתיב לקובץ
                    //לבנות מופע למחלקה
                    //להפעיל פונקציה במחלקה Encryption
                    System.out.println(" Input the path to the file ");
                    String input1 = readInput();
                    Encryption encryption = new Encryption(input1);
                    break;
                case "2":
                    //לקלוט נתיב לקובץ
                    //לבנות מופע למחלקה
                    //להפעיל פונקציה במחלקה Decryption
                    System.out.println(" Input the path to the file ");
                    String input2 = readInput();
                    Decryption decryption = new Decryption(input2);
                    break;
                case "0":
                    System.out.println("bye");
                    return;
                default:
                    System.out.println("invalid option. try again.");

            }

        }
        mainMenu();
    }
    public static String readInput(){
        String input = null;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
    public static void printMenu(){
        System.out.println();
        System.out.println("please choose:");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.println("0. exit");
        System.out.println("your choice: ");
    }

}
