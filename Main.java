import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== TASK 4: Fines for 8 days late ===");
        LibraryItem[] shelf = new LibraryItem[4];
        shelf[0] = new Book("Java Basics", "B-001", 5.00, 320);
        shelf[1] = new Magazine("Tech Today", "M-014", 4.00, "March");
        shelf[2] = new Book("Data Structures", "B-002", 6.00, 540 );
        shelf[3] = new Magazine("Nature Weekly", "M-020", 3.50, "June");

        
        double totalFines = 0;
        double highestFine = 0;
        String highestTitle = "";

        for (LibraryItem item : shelf) {
        double fine = item.computeFine(8);
        
        System.out.printf("%s: %.2f%n", item.getTitle(), fine);

        totalFines += fine;

        if (fine > highestFine) {
        highestFine = fine;
        highestTitle = item.getTitle();
    }
}
        System.out.printf("Total fines: %.2f%n", totalFines);
        System.out.printf("Highest fine: %s (%.2f)%n",
        highestTitle, highestFine);
        System.out.println("Item Count: " + LibraryItem.getItemCount());


        Scanner input = new Scanner(System.in);


        System.out.println();
        System.out.println("=== TASK 5: Search ===");
        System.out.print("Enter title: ");
        String searchTitle = input.nextLine();

        System.out.print("Days late: ");
        int days = input.nextInt();
        input.nextLine();

        System.out.print("Is member? (Y/N): ");
        String answer = input.nextLine();

    
        if (days <= 0) {
            System.out.println("Invalid number of days");
        } else {
            boolean isMember = answer.equalsIgnoreCase("Y");
            boolean found = false;

        for (LibraryItem item : shelf) {
            if (item.getTitle().equalsIgnoreCase(searchTitle)) {
                double fine = item.computeFine(days, isMember);
                System.out.printf("Fine: %.2f%n", fine);
                found = true;
                break;
            }
    }

            if (!found) {
                System.out.println("Item not found");
    }

        input.close(); 
}
    }
}


