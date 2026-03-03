import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                Scanner skaner = new Scanner(System.in);


                System.out.println(" Podaj  przedramię, ramię, odległość nadgarstek-bark:");
                double lokiecA = skaner.nextDouble();
                double lokiecB = skaner.nextDouble();
                double lokiecC = skaner.nextDouble();

                double cosLokcia = ((lokiecA * lokiecA) + (lokiecB * lokiecB) - (lokiecC * lokiecC)) / (2 * lokiecA * lokiecB);
                double katLokcia = Math.toDegrees(Math.acos(cosLokcia));

                System.out.println( Math.round(katLokcia));
                if (katLokcia >= 90 && katLokcia <= 120) {
                    System.out.println(" w normie");
                } else {
                    System.out.println("Poza normą");
                }


                System.out.println("Podaj tułów, udo, odległość bark-kolano:");
                double biodroA = skaner.nextDouble();
                double biodroB = skaner.nextDouble();
                double biodroC = skaner.nextDouble();

                double cosBiodra = ((biodroA * biodroA) + (biodroB * biodroB) - (biodroC * biodroC)) / (2 * biodroA * biodroB);
                double katBiodra = Math.toDegrees(Math.acos(cosBiodra));

                System.out.println(Math.round(katBiodra));
                if (katBiodra >= 90 && katBiodra <= 120) {
                    System.out.println("w normie");
                } else {
                    System.out.println("Poza normą");
                }

                System.out.println(" Podaj udo, łydka, odległość biodro-kostka:");
                double kolanoA = skaner.nextDouble();
                double kolanoB = skaner.nextDouble();
                double kolanoC = skaner.nextDouble();

                double cosKolana = ((kolanoA * kolanoA) + (kolanoB * kolanoB) - (kolanoC * kolanoC)) / (2 * kolanoA * kolanoB);
                double katKolana = Math.toDegrees(Math.acos(cosKolana));

                System.out.println(Math.round(katKolana));
                if (katKolana >= 90 && katKolana <= 110) {
                    System.out.println("-> Wynik w normie");
                } else {
                    System.out.println("-> Poza normą");
                }

                skaner.close();






    }
}