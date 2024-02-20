import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pearKg, appleKg, tomatoesKg, bananaKg, eggplantKg;
        double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11;
        double bananaPrice = 0.95, eggplantPrice = 5.00, totalPrice;

        System.out.println("Please enter how many kilograms of pears you have bought: ");
        pearKg = input.nextDouble();
        System.out.println("Please enter how many kilograms of apples you have bought: ");
        appleKg = input.nextDouble();
        System.out.println("Please enter how many kilograms of tomatoes you have bought: " );
        tomatoesKg = input.nextDouble();
        System.out.println("Please enter how many kilograms of bananas you have bought: " );
        bananaKg = input.nextDouble();
        System.out.println("Please enter how many kilograms of eggplants you have bought: ");
        eggplantKg = input.nextDouble();

        totalPrice = (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoesKg * tomatoesPrice)
                + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);
        System.out.println("Total Price: " + totalPrice + "TL");
    }
}