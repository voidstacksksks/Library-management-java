public class Book extends LibraryItem {
    private int pages;
    public Book(String title, String itemCode, double dailyFine, int pages) {
        super(title, itemCode, dailyFine);
        this.pages = pages;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pages);
}

    @Override
    public double computeFine(int daysLate) {
        if (daysLate > 0) {
        return super.computeFine(daysLate) + 20;
    }
    else {
        return 0;
    }
    }
}

