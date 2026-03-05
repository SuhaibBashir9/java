package Patterns;

public class InvertedTriangle {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle(){
        for (int i = 10; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
