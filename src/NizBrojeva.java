import java.util.Scanner;

public class NizBrojeva {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Koliko brojeva želite unijeti? ");
            int n = input.nextInt();

            int[] brojevi = new int[n];

            System.out.println("Unesite " + n + " brojeva:");
            for (int i = 0; i < n; i++) {
                brojevi[i] = input.nextInt();
            }

            int najmanji = brojevi[0];
            int najveci = brojevi[0];

            for (int i = 1; i < n; i++) {
                if (brojevi[i] < najmanji) {
                    najmanji = brojevi[i];
                }
                if (brojevi[i] > najveci) {
                    najveci = brojevi[i];
                }
            }

            System.out.println("Najmanji broj u nizu je: " + najmanji);
            System.out.println("Najveći broj u nizu je: " + najveci);

            input.close();
        }
}
