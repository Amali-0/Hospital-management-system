public class Main {
    public static void main(String[] args) {
        // 1. Create the objects (Demonstrates Constructors)
        Doctor doc = new Doctor("D100", "Dr. Amal", "Surgery");
        Patient pat = new Patient("P505", "Jane Smith", "Fever");
        Ward ward = new Ward("Emergency Block", 12);

        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");

        // 2. Demonstrate Inheritance and Overriding
        doc.showDetails();
        doc.performDuties();

        System.out.println("---------------------------------");

        // 3. Demonstrate Interface Implementation
        pat.showDetails();
        pat.generateInvoice();

        System.out.println("---------------------------------");

        // 4. Demonstrate Facility/Ward relationship
        ward.showWardDetails();
    }
}
