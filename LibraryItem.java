public class LibraryItem {
    // Attributes
    private String title;
    private String itemCode;
    private double dailyFine;

    public LibraryItem (String title, String itemCode, double dailyFine) {
    
        // Constructor
        this.title = title;
        this.itemCode = itemCode;
        this.dailyFine = dailyFine;
        itemCount++;
    }

        // Getters
    public String getTitle() {
        return title;
    }
    public String getItemCode() {
        return itemCode;
    }
    public double getDailyFine() {
        return dailyFine;
    }


    // Setters
    public void setDailyFine (double dailyFine) {
        if (dailyFine > 0) {
            this.dailyFine = dailyFine;
        } 
        else {
            System.out.println("Invalid Fine.");
        }
    }

    // Display Info
    public void displayInfo () {
        System.out.println("Title: " + title);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Daily Fine: " + dailyFine);
    }

    // TASK 2
    public static final double MEMBER_DISCOUNT = 0.50;
    private static int itemCount = 0;
    public static int getItemCount() {
        return itemCount;
    }

    public double computeFine(int daysLate) {
        return daysLate * dailyFine;
    }

    public double computeFine(int daysLate, boolean isMember) {
        double fine = computeFine(daysLate);

    if (isMember) {
        fine *= (1 - MEMBER_DISCOUNT);
    }

        return fine;
    }
}



