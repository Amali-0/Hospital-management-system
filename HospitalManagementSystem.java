import java.util.*;
import java.io.*;

// --- THE BLUEPRINTS (Put these at the top) ---
class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Doctor extends Person {
    String specialty;
    Doctor(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    void displayDetails() {
        System.out.println("Dr. " + name + " | ID: " + id + " | Specialty: " + specialty);
    }
}

class Patient extends Person {
    String ailment;
    Patient(String name, int id, String ailment) {
        super(name, id);
        this.ailment = ailment;
    }
    void displayDetails() {
        System.out.println("Patient: " + name + " | ID: " + id + " | Ailment: " + ailment);
    }
}

// --- THE MAIN SYSTEM ---
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Doctor> doctorList = new ArrayList<>();
        ArrayList<Patient> patientList = new ArrayList<>();

        // --- LOADING DATA ---
        try {
            File f = new File("hospital_data.txt");
            if (f.exists()) {
                Scanner fr = new Scanner(f);
                while (fr.hasNextLine()) {
                    String[] d = fr.nextLine().split(",");
                    if (d[0].equals("D")) doctorList.add(new Doctor(d[1], Integer.parseInt(d[2]), d[3]));
                    else if (d[0].equals("P")) patientList.add(new Patient(d[1], Integer.parseInt(d[2]), d[3]));
                }
                fr.close();
            }
        } catch (Exception e) { }

        System.out.println("--- Hospital Management System ---");

        try {
            boolean running = true;
            while (running) {
                System.out.println("\n1. Add Doctor | 2. Add Patient | 3. View All | 4. Save & Exit");
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                if (choice == 1) {
                    System.out.print("Doctor Name: "); String dName = scanner.nextLine();
                    System.out.print("Doctor ID: "); int dId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Specialty: "); String dSpec = scanner.nextLine();
                    doctorList.add(new Doctor(dName, dId, dSpec));
                } else if (choice == 2) {
                    System.out.print("Patient Name: "); String pName = scanner.nextLine();
                    System.out.print("Patient ID: "); int pId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Ailment: "); String pAil = scanner.nextLine();
                    patientList.add(new Patient(pName, pId, pAil));
                } else if (choice == 3) {
                    System.out.println("\n--- Records ---");
                    for (Doctor d : doctorList) d.displayDetails();
                    for (Patient p : patientList) p.displayDetails();
                } else if (choice == 4) {
                    PrintWriter pw = new PrintWriter(new FileWriter("hospital_data.txt"));
                    for (Doctor d : doctorList) pw.println("D," + d.name + "," + d.id + "," + d.specialty);
                    for (Patient p : patientList) pw.println("P," + p.name + "," + p.id + "," + p.ailment);
                    pw.close();
                    running = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}// This closes the class
