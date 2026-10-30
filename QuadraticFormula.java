import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double sol1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double sol2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println("Root 1 = " + sol1);
            System.out.println("Root 2 = " + sol2);
        } else if (discriminant == 0) {
            double sol1 = (-b / (2 * a));
            System.out.println("Root = " + sol1);
        } else {
            System.out.println("No real solution");
        }
    }
}
