package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("\n=========== Doctor Management ==========");
            System.out.println("""
                        1. Add doctor
                        2. View list doctor
                        3. Exit""");
            System.out.print("Enter your choice: ");
            int choice = Validation.inputInt();
            switch (choice) {
                case 1 -> DoctorList.AddDoctor();
                case 2 -> DoctorList.PrintDoctors();
                case 3 -> System.exit(0);
            }
        }
    }
}
