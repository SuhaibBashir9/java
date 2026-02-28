package Patterns;


public class RightTraingle {
    public static void main(String[] args) {
        traingle();
    }

public static void traingle(){
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j <= i; j++ ) {
            System.out.print(" * ");
        }
        System.out.println();

    }

}

}

