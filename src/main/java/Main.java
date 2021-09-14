import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the state?");
        String state = scanner.nextLine();

        // if statement for WI
        if(state.equals("WI")){
            double tax = amount*.055;
            double total = tax + amount;
            System.out.println("The subtotal is $"+(String.format("%.2f", amount))+
                    "\nThe tax is $"+(String.format("%.2f", tax))+"\nThe total is $"
                    +(String.format("%.2f", total)));
        }
        else{
            System.out.println("The total is $"+(String.format("%.2f", amount)));
        }

    }
}
