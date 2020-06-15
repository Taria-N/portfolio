import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class IMT {
    public static void main(String[] args) throws IOException {
        BufferedReader imt = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите свой вес в кг: ");
        double weight = Double.parseDouble(imt.readLine());
        System.out.print("Введите свой рост в м: ");
        double height = Double.parseDouble(imt.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            if ((weight/(height*height)) < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            }
            else if (((weight/(height*height)) >= 18.5) && ((weight/(height*height)) < 25)) {
                System.out.println("Нормальный вес: между 18.5 и 25");
            }
            else if (((weight/(height*height)) >= 25) && ((weight/(height*height)) < 30)) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            else {
                System.out.println("Ожирение: 30 или больше" );
            }
        }
    }
}