import java.util.*;

public class Income {
	private static List<Income> incomes = new ArrayList<>();
	private double amount;
	private String source;
	private int id;
	
    private static int idCounter = 1;

	// Constructor
	public Income(double amount, String source) {
		this.amount = amount;
		this.source = source;
		this.id = idCounter++;
	}
	
	// Add income to list
	public static void addIncome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================");
        System.out.println("Add Income");
        System.out.println("==================================");
        System.out.println("Enter amount: ");
        double amount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter source: ");
        String source = scan.nextLine();
        incomes.add(new Income(amount, source));
        System.out.println("----------------------------------");
        System.out.println("Income entry added successfully!");
        System.out.println("==================================");
	}
	
	// Display income list to users
	public static void displayIncomes() {
	    System.out.println("==================================");
	    System.out.println("          Income List");
	    System.out.println("==================================");
	    for (Income income : incomes) {
	        System.out.println("ID: " + income.id + " | Amount: $" + income.amount + " | Source: " + income.source);
	    }
	    System.out.println("==================================");    
	}

	// Edit existing income in lsit
	public static void editIncome(int id) {
        Scanner scan = new Scanner(System.in);

        for (Income income : incomes) {
            if (income.id == id) {
                System.out.println("Editing Income ID: " + id);
                System.out.print("Enter new amount: ");
                double newAmount = scan.nextDouble();
                scan.nextLine();
                System.out.print("Enter new source: ");
                String newSource = scan.nextLine();
                // Update income entry
                income.amount = newAmount;
                income.source = newSource;

                System.out.println("Income entry with ID " + id + " has been updated.");
                return;
            }
        }
        System.out.println("No income entry found with ID " + id);
	}
	
	// Delete income in list
	public static void deleteIncome(int id) {
		Iterator<Income> iterator = incomes.iterator();
	    while (iterator.hasNext()) {
	        Income income = iterator.next();
	        if (income.id == id) {
	            iterator.remove();
	            System.out.println("Income entry with ID " + id + " has been deleted.");
	            return;
	        }
	    }
	    System.out.println("No income entry found with ID " + id);
	}	 
	
}
