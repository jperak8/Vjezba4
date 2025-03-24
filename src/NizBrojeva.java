import java.util.Scanner;

public class NizBrojeva {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesi broj koji označava broj prirodnih brojeva kojih želite ispisati: ");

        int brojPrirodnihBrojeva = input.nextInt();
        int[] polje = new int[brojPrirodnihBrojeva];

        int najmanjiBroj = polje[0] + 1;
        int najveciBroj = polje.length;

        System.out.println("Najmanji broj polja je: " + najmanjiBroj);
        System.out.println("Najveći broj polja je: " + najveciBroj);

        input.close();

    }

}
