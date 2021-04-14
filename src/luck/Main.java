package luck;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {

    private static int zeroOrOne;
    private static int value = 0;
    private static int x = 100;

    private static int zeroOrOneCheck1;
    private static int zeroOrOneCheck2;
    private static int zeroOrOneCheck3;
    private static int zeroOrOneCheck4;
    private static int zeroOrOneCheck5;
    private static int zeroOrOneCheck6;
    private static int zeroOrOneCheck7;
    private static int zeroOrOneCheck8;
    private static int zeroOrOneCheck9;
    private static int zeroOrOneCheck10;

    private static int zeroCount;
    private static int oneCount;

    static void fiftyPercentChanceMethod() {
        int random = (int) Math.round(Math.random() * 10);
        if (random <= 5) {
            zeroOrOne = 0;
        } else {
            zeroOrOne = 1;
        }
        value = 1;
    }

    static void callingTheFiftyPercentChanceMethodMethod() {
        fiftyPercentChanceMethod();
        if (value == 1) {
            zeroOrOneCheck1 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck2 = 0;
        if (value == 1) {
            zeroOrOneCheck2 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck3 = 0;
        if (value == 1) {
            zeroOrOneCheck3 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck4 = 0;
        if (value == 1) {
            zeroOrOneCheck4 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck5 = 0;
        if (value == 1) {
            zeroOrOneCheck5 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck6 = 0;
        if (value == 1) {
            zeroOrOneCheck6 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck7 = 0;
        if (value == 1) {
            zeroOrOneCheck7 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck8 = 0;
        if (value == 1) {
            zeroOrOneCheck8 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck9 = 0;
        if (value == 1) {
            zeroOrOneCheck9 = zeroOrOne;
        }
        fiftyPercentChanceMethod();
        zeroOrOneCheck10 = 0;
        if (value == 1) {
            zeroOrOneCheck10 = zeroOrOne;
        }
    }

    static void soutzeroOrOneChecks() {
        System.out.println("Rolling...");
        System.out.println(zeroOrOneCheck1+", "+zeroOrOneCheck2+", "+zeroOrOneCheck3+", "+zeroOrOneCheck4+", "+zeroOrOneCheck5+", "+zeroOrOneCheck6+", "+zeroOrOneCheck7+", "+zeroOrOneCheck8+", "+zeroOrOneCheck9+", "+zeroOrOneCheck10);
    }

    static void checkAmountOfZeroesAndOnes() {
        if (zeroOrOneCheck1 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck2 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck3 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck4 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck5 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck6 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck7 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck8 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck9 == 0)
            zeroCount++;
        else
            oneCount++;
        if (zeroOrOneCheck10 == 0)
            zeroCount++;
        else
            oneCount++;
    }

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create an account (A) || Log into an existing account (B) : ");
        String createOrLogin = sc.nextLine();
        while (true) {
            if (createOrLogin.equalsIgnoreCase("A"))
                break;
            if (createOrLogin.equalsIgnoreCase("B"))
                break;
            System.out.println("Enter either A or B!");
            System.out.print("Create an account (A) || Log into an existing account (B) : ");
            createOrLogin = sc.nextLine();
        }

        String dir = System.getProperty("user.dir")+"\\src\\luck\\Users";
        //String dir = System.getProperty("user.dir")+"\\Users";

        if (createOrLogin.equalsIgnoreCase("A")) {
            System.out.print("What should we keep your username as: ");
            String newUsername = sc.nextLine();
            File newUsernameFile = new File(dir + newUsername);
            while (newUsernameFile.exists()) {
                System.out.print("This username is taken. Please choose another username: ");
                newUsername = sc.nextLine();
                newUsernameFile = new File(dir + newUsername);
            }
            boolean couldCreateNewUser = newUsernameFile.mkdir();
            if (couldCreateNewUser = true) {
                System.out.print("Create a password for your account. (if you want a free and open-source password generator goto https://github.com/airemons/passwordGenerator (Upcoming)): ");
                String newPassword = sc.nextLine();
                FileWriter passwordStorage = new FileWriter(dir + "\\" + newUsername + "\\" + "password.txt");
                passwordStorage.write(newPassword);
                passwordStorage.close();
                System.out.println("Your account has been successfully created.");
            }
            else
                System.out.println("The user could not be created.");
        }

        String loginUsername = "";
        File loginUsernameCheck;
        boolean isDirectory;
        boolean realIsDirectory = false;

        if (createOrLogin.equalsIgnoreCase("B")) {
            System.out.print("Username: ");
            loginUsername = sc.nextLine();
            loginUsernameCheck = new File(dir + "\\" + loginUsername);
            if (loginUsernameCheck.exists()) {
                System.out.println("Password: ");
            }
            File isDirectoryCheck = new File(dir + "\\" + loginUsername);
            isDirectory = isDirectoryCheck.isDirectory();
            System.out.println(isDirectory);
            while (isDirectory = false) {
                System.out.println("kjahsd");
            }
                realIsDirectory = true;
            while (realIsDirectory) {
                System.out.print("The username specified is invalid. Try \"Creating an account\" or try again: ");
                loginUsername = sc.nextLine();
                loginUsernameCheck = new File(dir + "\\" + loginUsername);
                if (loginUsernameCheck.exists()) {
                    System.out.println("Password: ");
                }
            }
        }
    }
}