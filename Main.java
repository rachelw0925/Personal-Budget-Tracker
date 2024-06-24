import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			// Print user interface
			System.out.println("==================================");
            System.out.println("Personal Budget Tracker");
            System.out.println("==================================");
			System.out.println("1. Add Income");
			System.out.println("2. Edit Income");
			System.out.println("3. Delete Income");
			System.out.println("4. Add Expense");
			System.out.println("5. Edit Expense");
			System.out.println("6. Delete Expense");
			System.out.println("7. Generate Report");
			System.out.println("8. Exit");
            System.out.println("==================================");
            System.out.println("Please select an option (1-8)");
            
            // Look for user input
            int opt = scan.nextInt();
            
            // Check for valid input
            if (opt < 1 || opt > 8) {
                System.out.println("Invalid option. Please select a valid option (1-9).");
                continue;
            }
            
            // Exit condition
            if (opt == 8) {
                System.out.println("Exiting the application.");
                break;
            }
            
            // Handle other options
            switch (opt) {
                case 1:
                    System.out.println("Add Income selected.");
                    Income.addIncome();
                    break;
                case 2:
                    System.out.println("Edit Income selected.");
                    Income.displayIncomes();
                    System.out.print("Enter the ID of the income entry to edit: ");
                    int incomeId = scan.nextInt();
                    Income.editIncome(incomeId);
                    break;
                case 3:
                    System.out.println("Delete Income selected.");
                    Income.displayIncomes();
                    System.out.print("Enter the ID of the income entry to delete: ");
                    int incomeId1 = scan.nextInt();
                    Income.deleteIncome(incomeId1);
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
                    System.out.println("Generate Report selected.");
                    // Handle generating  report
                    break;
            }
		}
		scan.close();
	}
}
