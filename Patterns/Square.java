package Patterns;
public class Square {
    public static void main(String[] args) {
        squareStar();
    }

    public static void squareStar(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}