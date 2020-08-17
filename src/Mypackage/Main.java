package Mypackage;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.lang.String;



public class Main {

    public static void main(String[] args) {
        // Few questiones from my computer

        LocalDateTime localDateTime = LocalDateTime.now();

        Scanner scanner = new Scanner(System.in);
        String name;
        String lastName;
        String dateOfBirth;
        SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
        System.out.print("Welcome to my first program, please advise Your first name: ");
        name = scanner.nextLine();
        System.out.print("Second name ");
        lastName = scanner.nextLine();
        System.out.print("Welcome " + name + " " + lastName + "!.");
        System.out.print("What is Your Birth date ?");
        System.out.println("Write date in following format : dd-mm-yyyy");
        dateOfBirth = scanner.nextLine();
        // Checking if today is user holiday.

        // Checking Warining messages :
        for (int i = 1; i <= 5; i++) {
            i = i +1;
            System.out.println("#Waring" + 1);
        }
        // Checking Warining with X to not make infinite loop.
        for (int i = 1; i <=3; i++ ) {
            int x = i -1;
            System.out.println(x );
        }
        // Checking i*2
        for (int i = 1; i<=3 ; i++) {
            System.out.println(i*2);
        }
    }
}