import java.util.Scanner;

public class OIB {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesite prvih 10 znamenki osobnog identifikacijskog broja: ");
        String oib = input.nextLine();

        if (oib.length() != 10) {
            System.out.println("Neispravan unos! OIB mora imati 10 znamenki.");
            return;
        }

        int ostatak = 0;

        ostatak = (Character.getNumericValue(oib.charAt(0)) + 10) % 10;
        if (ostatak == 0) {
            ostatak = 10;
        }
        ostatak = (ostatak * 2) % 11;

        for (int i = 1; i < 10; i++) {
            ostatak = (ostatak * 2) % 11;
            ostatak = (ostatak + Character.getNumericValue(oib.charAt(i))) % 11;
        }

        int kontrolna = 11 - ostatak;
        if (kontrolna == 10) {
            kontrolna = 0;
        }

        System.out.println("Kontrolna znamenka je: " + kontrolna);

        input.close();
    }

}
