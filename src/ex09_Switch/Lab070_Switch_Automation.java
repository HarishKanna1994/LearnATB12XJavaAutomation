package ex09_Switch;

import java.util.Scanner;

public class Lab070_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Chrome browser is started");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Firefox browser is started");
                break;

            case "edge":
                System.out.println("Edge browser is started");
                break;

            case "Opera":
                System.out.println("I don't have any idea");
                break;

            default:
                System.out.println("No Idea");


        }
    }
}
