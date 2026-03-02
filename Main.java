// 1. MedicalStaff.java
interface MedicalStaff {
    void provideTreatment();
}

// 2. Billable.java
interface Billable {
    double calculateBill();
}

// 3. Person.java
abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    public abstract void displayDetails();
}

// 4. Facility.java
abstract class Facility {
    private String facilityName;

    public Facility(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityName() { return facilityName; }
    public abstract void showFacilityInfo();
}

// 5. Doctor.java
class Doctor extends Person implements MedicalStaff {
    private String specialty;

    public Doctor(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void provideTreatment() {
        System.out.println("Doctor " + getName() + " is providing specialized treatment in " + specialty + ".");
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId() + " | Name: " + getName() + " | Specialty: " + specialty);
    }
}

// 6. Patient.java
class Patient extends Person implements Billable {
    private String ailment;
    private double baseFee = 500.0;

    public Patient(String name, int id, String ailment) {
        super(name, id);
        this.ailment = ailment;
    }

    @Override
    public double calculateBill() {
        return baseFee + 150.0; 
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + getId() + " | Name: " + getName() + " | Ailment: " + ailment);
    }
}

// 7. Ward.java
class Ward extends Facility {
    private int capacity;

    public Ward(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void showFacilityInfo() {
        System.out.println("Ward Name: " + getFacilityName() + " | Capacity: " + capacity + " beds.");
    }
}

// 8. Main.java (Renamed to HospitalManagementSystem to match the file)
public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("--- Hospital Management System --- \n");

        // Doctor Instance
        Doctor doc = new Doctor("Dr. Smith", 101, "Cardiology");
        doc.displayDetails();
        doc.provideTreatment();

        System.out.println();

        // Patient Instance
        Patient pat = new Patient("John Doe", 505, "Fever");
        pat.displayDetails();
        System.out.println("Total Bill: $" + pat.calculateBill());

        System.out.println();

        // Ward Instance
        Ward ward = new Ward("Emergency Hall", 20);
        ward.showFacilityInfo();

        System.out.println("\n--- System running successfully ---");
    }
}
