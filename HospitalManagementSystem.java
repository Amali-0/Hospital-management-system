import java.util.Scanner;
import java.util.InputMismatchException;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // 1. Initialize the Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Hospital Management System --- \n");

        // 2. Wrap everything in a 'try' block for safety
        try {
            // --- DOCTOR SECTION ---
            System.out.print("Enter Doctor Name: ");
            String dName = scanner.nextLine();

            System.out.print("Enter Doctor ID: ");
            int dId = scanner.nextInt();
            scanner.nextLine(); // CLEANUP: This "eats" the Enter key press

            System.out.print("Enter Specialty: ");
            String dSpec = scanner.nextLine();

            Doctor doc = new Doctor(dName, dId, dSpec);
            doc.displayDetails();
            doc.provideTreatment();

            System.out.println();

            // --- PATIENT SECTION ---
            System.out.print("Enter Patient Name: ");
            String pName = scanner.nextLine();

            System.out.print("Enter Patient ID: ");
            int pId = scanner.nextInt();
            scanner.nextLine(); // CLEANUP

            System.out.print("Enter Ailment: ");
            String pAilment = scanner.nextLine();

            Patient pat = new Patient(pName, pId, pAilment);
            pat.displayDetails();
            System.out.println("Total Bill: $" + pat.calculateBill());

        } 
        // 3. Catch errors if the user types letters instead of numbers for ID
        catch (InputMismatchException e) {
            System.out.println("\n[ERROR]: Invalid input type. IDs must be whole numbers!");
        } 
        // 4. Final cleanup
        finally {
            scanner.close(); // Professional touch
            System.out.println("\n--- System session finished ---");
        }
    } // This closes the main method
} // This closes the class