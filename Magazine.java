public class Magazine extends LibraryItem {
    private String issueMonth;
    public Magazine(String title, String itemCode, double dailyFine, String issueMonth) {
        super(title, itemCode, dailyFine);
        this.issueMonth = issueMonth;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Month: " + issueMonth);
}

    @Override 
    public double computeFine(int daysLate) {
        return super.computeFine(daysLate) * 0.50;
    }
}
