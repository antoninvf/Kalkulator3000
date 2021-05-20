package presentation;

import logic.Math;

import java.util.Scanner;

public class CalculatorCLI {

    private Math logic;
    private Scanner sc;

    public void init() {
        logic = new Math();
        sc = new Scanner(System.in);
    }

    public void titleScreen() {
        System.out.println("   ___   _   _    ___ _   _ _      _ _____ ___  ___   ____ __   __   __  \n" +
                "  / __| /_\\ | |  / __| | | | |    /_\\_   _/ _ \\| _ \\ |__ //  \\ /  \\ /  \\ \n" +
                " | (__ / _ \\| |_| (__| |_| | |__ / _ \\| || (_) |   /  |_ \\ () | () | () |\n" +
                "  \\___/_/ \\_\\____\\___|\\___/|____/_/ \\_\\_| \\___/|_|_\\ |___/\\__/ \\__/ \\__/ \n" +
                "                                                                          ");
        System.out.println("> Welcome to the Calculator 3000!");
        System.out.println();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("> What kind of operation do you want to do?");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Power");
        System.out.println("6) Factorial");
        System.out.println("0) Exit");
        String input = sc.nextLine();

        switch (input) {
            case "1" -> {
                System.out.println("> You picked 1) Addition");
                System.out.println();
                additionMenu();
            }
            case "2" -> {
                System.out.println("> You picked 2) Subtraction");
                System.out.println();
                subtractionMenu();
            }
            case "3" -> {
                System.out.println("> You picked 3) Multiplication");
                System.out.println();
                multiplicationMenu();
            }
            case "4" -> {
                System.out.println("> You picked 4) Division");
                System.out.println();
                divisionMenu();
            }
            case "5" -> {
                System.out.println("> You picked 5) Power");
                System.out.println();
                powerMenu();
            }
            case "6" -> {
                System.out.println("> You picked 6) Factorial");
                System.out.println();
                factorialMenu();
            }
            case "0" -> {
                System.out.println("> Goodbye!");
                System.exit(0);
            }
            default -> {
                System.out.println("! Invalid Input ! - Please try again.");
                mainMenu();
            }
        }

    }

    public void additionMenu() {
        System.out.println("What is your first number?");
        String astr = sc.nextLine();
        System.out.println("What is your second number?");
        String bstr = sc.nextLine();
        float result = logic.add(Float.parseFloat(astr), Float.parseFloat(bstr));
        System.out.println("> Result: " + astr + " + " + bstr + " = " + result);
        mainMenu();
    }

    public void subtractionMenu() {
        System.out.println("What is your first number?");
        String astr = sc.nextLine();
        System.out.println("What is your second number?");
        String bstr = sc.nextLine();
        float result = logic.subtract(Float.parseFloat(astr), Float.parseFloat(bstr));
        System.out.println("> Result: " + astr + " - " + bstr + " = " + result);
        mainMenu();
    }

    public void multiplicationMenu() {
        System.out.println("What is your first number?");
        String astr = sc.nextLine();
        System.out.println("What is your second number?");
        String bstr = sc.nextLine();
        float result = logic.multiply(Float.parseFloat(astr), Float.parseFloat(bstr));
        System.out.println("> Result: " + astr + " * " + bstr + " = " + result);
        mainMenu();
    }

    public void divisionMenu() {
        System.out.println("What is your first number?");
        String astr = sc.nextLine();
        System.out.println("What is your second number?");
        String bstr = sc.nextLine();
        float result = logic.divide(Float.parseFloat(astr), Float.parseFloat(bstr));
        if(Float.parseFloat(bstr) == 0.0) {
            System.out.println("> You cannot divide by zero. Let's try again.");
            divisionMenu();
        }
        else {
            System.out.println("> Result: " + astr + " / " + bstr + " = " + result);
            mainMenu();
        }
    }

    public void powerMenu() {
        System.out.println("What is the number?");
        String astr = sc.nextLine();
        System.out.println("What is the exponent? (How many power of)");
        String bstr = sc.nextLine();
        float result = logic.power(Float.parseFloat(astr), Float.parseFloat(bstr));
        System.out.println("> Result: " + astr + "^" + bstr + " = " + result);
        mainMenu();
    }

    public void factorialMenu() {
        System.out.println("What is the number that you want the Factorial of?");
        String num = sc.nextLine();
        float result = logic.factorial(Float.parseFloat(num));
        System.out.println("> Result: Factorial of " + num + " is " + result);
        mainMenu();
    }


}
