package day09_scanner;
import java.util.Scanner;

public class ScannerIntro { // used for reading files and keyboard entry
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = input.nextByte();
        System.out.println("You entered: " + age);

        input.close(); // scanner is closed, can not read user inputs again


    }
}

// regular import: import package.classNAme - imports one single class from the package
// wild import: importing everything from the package
// import package.*;