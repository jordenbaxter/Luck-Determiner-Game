package luck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.NumberFormat;
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

    private static int checkZeroCount;
    private static int checkOneCount;

    private static String loginUsername = "";
    private static File loginUsernameCheck;
    private static boolean isDirectory;
    private static boolean realIsDirectory = false;
    private static String password;
    private static boolean loggedIn = false;

    private static File pointsTxt;
    private static File moneyTxt;
    private static Scanner scPointsTxt;
    private static Scanner scMoneyTxt;
    private static FileWriter pointsTxtWrite;
    private static FileWriter moneyTxtWrite;

    private static double i = 0;
    private static double guessedZero = 0;
    private static double guessedOne = 0;

    private static String luck;
    private static double toFormat;

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

    static void checkAmountOfZeroesAndOnes() {
        if (zeroOrOneCheck1 == 0) {
            zeroCount++;  checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck2 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck3 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck4 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck5 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck6 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck7 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck8 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck9 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
        if (zeroOrOneCheck10 == 0) {
            zeroCount++; checkZeroCount++;}
        else {
            oneCount++; checkOneCount++;}
    }

    static void soutzeroOrOneChecks() {
        System.out.println("Rolling...");
        System.out.println(zeroOrOneCheck1+", "+zeroOrOneCheck2+", "+zeroOrOneCheck3+", "+zeroOrOneCheck4+", "+zeroOrOneCheck5+", "+zeroOrOneCheck6+", "+zeroOrOneCheck7+", "+zeroOrOneCheck8+", "+zeroOrOneCheck9+", "+zeroOrOneCheck10);
        System.out.println("Zeroes: " + zeroCount + ", Ones: " + oneCount);
    }

    static void logInSystem() throws IOException {
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
            File newUsernameFile = new File(dir + "\\" + newUsername);
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
                File gameDataFolder = new File(dir + "\\" + newUsername + "\\" + "gamedata");
                gameDataFolder.mkdir();
//Stuck - have to write down this info to text file but not working
                pointsTxt = new File(dir + "\\" + newUsername + "\\" + "gamedata\\points.txt");
                pointsTxt.createNewFile();
                pointsTxtWrite = new FileWriter(dir + "\\" + newUsername + "\\" + "gamedata\\points.txt", true);
                BufferedWriter pointsTxtBw = new BufferedWriter(pointsTxtWrite);
                pointsTxtBw.write("{Points: 0}");

                moneyTxt = new File(dir + "\\" + newUsername + "\\" + "gamedata\\money.txt");
                moneyTxt.createNewFile();
                moneyTxtWrite = new FileWriter(dir + "\\" + newUsername + "\\" + "gamedata\\money.txt", true);
                BufferedWriter moneyTxtBw = new BufferedWriter(moneyTxtWrite);
                moneyTxtBw.write("{Money: 0}");
//Stuck text file coming out as 0kb
                System.out.println("Your account has been successfully created.");
            }
            else
                System.out.println("The user could not be created.");
        }

        if (createOrLogin.equalsIgnoreCase("B")) {
            System.out.print("Username: ");
            loginUsername = sc.nextLine();
            loginUsernameCheck = new File(dir + "\\" + loginUsername);
            if (loginUsernameCheck.exists()) {
                System.out.print("Password: ");
                password = sc.nextLine();
                File passwordTxt = new File(dir + "\\" + loginUsername + "\\password.txt");
                Scanner fileSc = new Scanner(passwordTxt);
                String shouldBePassword = fileSc.nextLine();
                if (shouldBePassword.equals(password)) {
                    loggedIn = true;
                    System.out.println("You're logged in!");
                }
                while (!loggedIn) {
                    System.out.print("The password you have entered is invalid. Please try again: ");
                    password = sc.nextLine();
                    if (shouldBePassword.equals(password)) {
                        loggedIn = true;
                        System.out.println("You're logged in!");
                        break;
                    }
                }
            }
            File isDirectoryCheck = new File(dir + "\\" + loginUsername);
            isDirectory = isDirectoryCheck.isDirectory();
            if (!isDirectory) {
                System.out.print("");
                realIsDirectory = true;
            }
            while (realIsDirectory) {
                System.out.print("The username specified is invalid. Try \"Creating an account\" or try again: ");
                loginUsername = sc.nextLine();
                loginUsernameCheck = new File(dir + "\\" + loginUsername);
                if (loginUsernameCheck.exists()) {
                    System.out.print("Password: ");
                    password = sc.nextLine();
                    File passwordTxt = new File(dir + "\\" + loginUsername + "\\password.txt");
                    Scanner fileSc = new Scanner(passwordTxt);
                    String shouldBePassword = fileSc.nextLine();
                    if (shouldBePassword.equals(password)) {
                        loggedIn = true;
                        System.out.println("You're logged in!");
                    }
                    while (!loggedIn) {
                        System.out.print("The password you have entered is invalid. Please try again: ");
                        password = sc.nextLine();
                        if (shouldBePassword.equals(password)) {
                            loggedIn = true;
                            System.out.println("You're logged in!");
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public static void main (String[] args) throws IOException {

        String bet = "69";

        logInSystem();
        Scanner sc = new Scanner(System.in);
        if (loggedIn) {
            System.out.print("What would you like to do: ");
            String whatLikeToDo = sc.nextLine();
            while (true) {
                if (whatLikeToDo.equalsIgnoreCase("play")) {
                    System.out.print("Which do you think you will get more of (0's or 1's): ");
                    bet = sc.nextLine();
                    while (!bet.equals("0") && !bet.equals("1") && !bet.equalsIgnoreCase("cashout")) {
                        System.out.print("Type either 1 or 0: ");
                        bet = sc.nextLine();
                    }
                    if (!bet.equalsIgnoreCase("cashout")) {
                        callingTheFiftyPercentChanceMethodMethod();
                        checkAmountOfZeroesAndOnes();
                        soutzeroOrOneChecks();
                    }
                    if (zeroCount > oneCount && !bet.equalsIgnoreCase("cashout")) {
                        System.out.println("You rolled more zeroes than ones.");
                        if (bet.equals("0")) {
                            System.out.println("Congratulations! You win!"); guessedZero++; }
                        else {
                            System.out.println("Oopsie! You guessed it wrong.");}
                    }
                    if (zeroCount < oneCount && !bet.equalsIgnoreCase("cashout")) {
                        System.out.println("You rolled more ones than zeroes.");
                        if (bet.equals("1")) {
                            System.out.println("Congratulations! You win!"); guessedOne++; }
                        else {
                            System.out.println("Oopsie! You guessed it wrong.");}
                    }
                    if (zeroCount == oneCount && !bet.equalsIgnoreCase("cashout")) {
                        System.out.println("Draw! Please try again.");
                    }
                    i++;
                }
                zeroCount = 0;
                oneCount = 0;

                if (bet.equalsIgnoreCase("cashout")) {
                    System.out.println("Cashing out..");
                    System.out.println("You rolled " + checkZeroCount + " zeroes and " + checkOneCount + " ones in total.");
                    System.out.println("You played the game " + i + " times, guessed zero correctly " + guessedZero + " time(s), and guessed one correctly " + guessedOne + " time(s).");
                    NumberFormat format = NumberFormat.getPercentInstance();
                    format.setMinimumFractionDigits(1);
                    toFormat = (guessedOne+guessedZero)/i;
                    luck = format.format(toFormat);
                    System.out.println("Your luck percentage is: " + luck);
                    System.out.println("Points: " + (Math.round(toFormat)/2));
                    scPointsTxt = new Scanner(pointsTxt);
                    String prevTotalPoints = scPointsTxt.nextLine();
                    prevTotalPoints = prevTotalPoints.substring(prevTotalPoints.indexOf(":"), prevTotalPoints.indexOf("}"));
                    System.out.println(prevTotalPoints);
                    break;
                }
            }
        }
    }
}