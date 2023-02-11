import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the redius: ");
        double redius = sc.nextDouble();
        System.out.printf("%.2f", (Math.PI * redius * redius), "\n");
        sc.close();
    }
}
