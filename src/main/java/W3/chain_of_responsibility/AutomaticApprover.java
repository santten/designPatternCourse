package W3.chain_of_responsibility;

public class AutomaticApprover extends Approver{
    private Approver nextApprover;

    public AutomaticApprover() {}

    public void setNextApprover(Approver approver){
        this.nextApprover = approver;
    }

    public Approver getNextApprover(){
        return this.nextApprover;
    }

    @Override
    public void process(ExpenseReport report) {
        if (report.getAmount() <= 100){
            report.setApproved(true);
            System.out.println((report.isPlanned() ? "Planned" : "Unplanned") +
                    " report of " + report.getAmount() +
                    " euros, approved by Automatic Approver");
        } else {
            if (this.nextApprover != null) {
                this.nextApprover.process(report);
            } else {
                System.out.println("ERROR: No next approver in chain!");
            }
        }
    }
}
