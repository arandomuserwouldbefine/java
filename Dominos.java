import java.util.Scanner;

class Dominos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // quantities for pizza
        int smPizza = 0;
        int medPizza = 0;
        int lgPizza = 0;
        int monstPizza = 0;

        // Min quantities for offer 

        int minSmPizza = 4;
        int minMedPizza = 3;
        int minLgPizza = 2;
        int minMonstPizza = 1;

        // Scanner Object
        Scanner inputStream = new Scanner(System.in);

        // Print the menu
        System.out.println("Pizza Menu: ");
        System.out.println("\t1) Small size pizza - 150Rs.");
        System.out.println("\t2) Medium size pizza - 350Rs.");
        System.out.println("\t3) Large size pizza - 500Rs.");
        System.out.println("\t4) Monster size pizza - 850Rs.");

        // generate the bill if the input is no 
        String yesOrNo = "yes";

        while (!yesOrNo.toLowerCase().equals("no")) {
            // Ask for the choice
            System.out.print("Enter choice: ");
            String pizza = inputStream.nextLine();
            int quantity = 0;


            // convert selection to lowercase 
            if (pizza.toLowerCase().equals("small size pizza")) {
                System.out.print("Enter quantity: ");
                quantity = inputStream.nextInt();
                if (quantity < 1) {
                    System.out.println("Invalid quantity :(");
                } else {
                    smPizza += quantity;
                }
                inputStream.nextLine();
            } else if (pizza.toLowerCase().equals("medium size pizza")) {
                System.out.print("Enter quantity: ");
                quantity = inputStream.nextInt();
                if (quantity < 1) {
                    System.out.println("Invalid quantity :(");
                } else {
                    medPizza += quantity;
                }
                inputStream.nextLine();
            } else if (pizza.toLowerCase().equals("large size pizza")) {
                System.out.print("Enter quantity: ");
                quantity = inputStream.nextInt();
                if (quantity < 1) {
                    System.out.println("Invalid quantity :(");
                } else {
                    lgPizza += quantity;
                }
                inputStream.nextLine();
            } else if (pizza.toLowerCase().equals("monster size pizza")) {
                System.out.print("Enter quantity: ");
                quantity = inputStream.nextInt();
                if (quantity < 1) {
                    System.out.println("Invalid quantity :(");
                } else {
                    monstPizza += quantity;
                }
                inputStream.nextLine();
            } else {
                System.out.println("Invalid choice :(");
            }

            // Ask if user wants to continue
            System.out.print("Do you want anything else? (yes/no): ");
            yesOrNo = inputStream.nextLine();
        }

        // Calculate total bill
        int totalBill = smPizza * 150 + medPizza * 350 + lgPizza * 500 + monstPizza * 850;

        // Print the bill and offers if applicable
        System.out.println("Bill is Rs." + totalBill);
        int offerQuantity = 0 ;
        
        // Find quantity of coke

        if (smPizza > 0) {
            if(smPizza / minSmPizza > 0){
                offerQuantity =  smPizza / minSmPizza;
                System.out.println(smPizza + " X Small Pizza + "+offerQuantity + " X Coke \t Price: " + (smPizza * 150));
            }
            else{
                System.out.println(smPizza + " X Small Pizza \t\t Price: " + (smPizza * 150));
            }
        }
        if (medPizza > 0) {
            if(medPizza / minMedPizza > 0){
                offerQuantity = medPizza / minMedPizza;
                System.out.println(medPizza + " X Medium Pizza + "+offerQuantity + " X Coke \t Price: " + (medPizza * 350));
            }
            else{
                System.out.println(medPizza + " X Medium Pizza\t\t Price: " + (medPizza * 350));
            }
        }
        if (lgPizza > 0) {
            if(lgPizza / minLgPizza > 0){
                offerQuantity = lgPizza / minLgPizza;
                System.out.println(lgPizza + " X Large Pizza + "+offerQuantity + " X Coke \t Price: " + (lgPizza * 500));
            }
            else{
                System.out.println(lgPizza + " X Large Pizza\t\t Price: " + (lgPizza * 500));
            }
        }
        if (monstPizza > 0) {
            if(monstPizza / minMonstPizza > 0){
                offerQuantity = monstPizza / minMonstPizza;
                System.out.println(monstPizza + " X Monster Pizza + "+offerQuantity + " X Coke \t Price: " + (monstPizza * 500));
            }
            else{
                System.out.println(monstPizza + " X Monster Pizza\t\t Price: " + (monstPizza * 850));
            }
        }
    }
}
