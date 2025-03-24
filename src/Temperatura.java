import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesi temperaturu u stupnjevima celzijusa: ");

        double temperaturaCelzijus = input.nextDouble();

        double temperaturaKelvin = temperaturaCelzijus + 273.15;

        System.out.println("Temperatura u Kelvinima je: " + temperaturaKelvin);

        double temperaturaFahrenheit = (temperaturaCelzijus * ((double) 9 / 5)) + 32;

        System.out.println("Temperatura u Fahrenheitima je: " + temperaturaFahrenheit);

        input.close();

    }

}
