import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			// Print user interface
			System.out.println("==================================");
            System.out.println("Personal Budget Tracker");
            System.out.println("===================================");
			System.out.println("1. Add Income");
			System.out.println("2. Edit Income");
			System.out.println("3. Delete Income");
			System.out.println("4. Add Expense");
			System.out.println("5. Edit Expense");
			System.out.println("6. Delete Expense");
			System.out.println("7. Generate Monthly Report");
			System.out.println("8. Generate Yearly Report ");
			System.out.println("9. Exit");
            System.out.println("===================================");
            System.out.println("Please select an option (1-9)");
            
            // Look for user input
            int opt = scan.nextInt();
            
            // Check for valid input
            if (opt < 1 || opt > 9) {
                System.out.println("Invalid option. Please select a valid option (1-9).");
                continue;
            }
            
            // Exit condition
            if (opt == 9) {
                System.out.println("Exiting the application.");
                break;
            }
            
            // Handle other options
            switch (opt) {
                case 1:
                    System.out.println("Add Income selected.");
                    // Handle adding income
                    break;
                case 2:
                    System.out.println("Edit Income selected.");
                    // Handle editing income
                    break;
                case 3:
                    System.out.println("Delete Income selected.");
                    // Handle deleting income
                    break;
                case 4:
                    System.out.println("Add Expense selected.");
                    // Handle adding expense
                    break;
                case 5:
                    System.out.println("Edit Expense selected.");
                    // Handle editing expense
                    break;
                case 6:
                    System.out.println("Delete Expense selected.");
                    // Handle deleting expense
                    break;
                case 7:
                    System.out.println("Generate Monthly Report selected.");
                    // Handle generating monthly report
                    break;
                case 8:
                    System.out.println("Generate Yearly Report selected.");
                    // Handle generating yearly report
                    break;
            }
		}
		scan.close();
	}
}
