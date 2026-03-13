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