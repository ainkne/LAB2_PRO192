package lab2;

import java.util.Scanner;

public class Validation {
    private final String nameRegex = "^//d"
    static Scanner sc = new Scanner(System.in);
    public static int inputInt(){
        while (true){
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again!");
                System.out.print(">> ");
            }
        }
    }
    public static String inputString(){
        while (true){
            while (true) {
                String result = sc.nextLine().trim();
                if (result.isEmpty()) {
                    System.out.println("Not empty, try again!");
                    System.out.print(">> ");
                } else {
                    return result;
                }
            }
        }
    }
}
