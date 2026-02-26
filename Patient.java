public class Patient extends Person implements Billable {
    private String sickness;

    public Patient(String id, String name, String sickness) {
        super(id, name);
        this.sickness = sickness;
    }

    @Override
    public void showDetails() {
        System.out.println("Patient: " + getName() + " | Sickness: " + sickness);
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating bill for " + getName() + "... Total: 2500 KES");
    }
}
