import java.util.Scanner;

/*
 * Java Program to multiply two matrices
 */
public class ArrayPracticeJava2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the size of the arrays from the user
        System.out.print("Enter Quantity of Arrays: ");
        int numItems = scan.nextInt();

        // Create the arrays
        double[] price = new double[numItems];
        int[] quantity = new int[numItems];
        double[] revenue = new double[numItems];
        double total = 0;

        // Input values for price array
        System.out.println("Enter the prices of each array:");
        for (int i = 0; i < numItems; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            price[i] = scan.nextDouble();
        }

        // Input values for quantity array
        System.out.println("Enter the quantities of each array:");
        for (int i = 0; i < numItems; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            quantity[i] = scan.nextInt();
        }

        // Calculate revenue and store it in the revenue array
        for (int i = 0; i < numItems; i++) {
            revenue[i] = price[i] * quantity[i];
        }

        // Calculate total and store it in the total array
        for (int i = 0; i < numItems; i++) {
            total = total + revenue[i];  
        }

        // Display the values of all three arrays
        System.out.println("\nItems\tPrice\tQuantity\tRevenue\t\tTotal");
        for (int i = 0; i < numItems; i++) {
            System.out.println((i + 1) + "\t" + price[i] + "\t" + quantity[i] + "\t\t" + revenue[i] + "\t\t" + total);
        }

        scan.close();
    }
}


    