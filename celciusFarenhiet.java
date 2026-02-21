import java.util.Scanner;
public class celciusFarenhiet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in degree C: ");
        int degree=scanner.nextInt();
        scanner.close();

        System.out.println("The temp in farenhiet is "+ (degree*9/5+32));
    }
}
