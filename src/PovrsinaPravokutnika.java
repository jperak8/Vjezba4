import java.util.Scanner;

public class PovrsinaPravokutnika {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesi duljinu pravokutnika u centimetrima: ");

        double duljinaPravokutnika = input.nextDouble();

        System.out.print("Unesi sirinu pravokutnika u centimetrima: ");

        double sirinaPravokutnika = input.nextDouble();

        double povrsina = duljinaPravokutnika * sirinaPravokutnika;

        System.out.println("Površina pravokutnika je: " + povrsina);

        input.close();
    }

}
