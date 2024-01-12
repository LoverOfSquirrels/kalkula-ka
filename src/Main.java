import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej první číslo: ");
        int x = sc.nextInt();

        System.out.print("Zadej druhé číslo: ");
        int y = sc.nextInt();

        System.out.print("Zadej operaci (+, -, *, /): ");
        char op = sc.next().charAt(0);

        vypocet(x, y, op);
    }

    public static void vypocet(int x, int y, char op) {
        switch (op) {
            case '+':
                System.out.println(x + " + " + y + " = " + (x+y));
                return;
            case '-':
                System.out.println(x + " - " + y + " = " + (x-y));
                return;
            case '*':
                System.out.println(x + " * " + y + " = " + (x*y));
                return;
            case '/':
                if (y == 0) {
                    System.out.println("Nulou nelze dělit!");
                    return;
                }
                System.out.println(x + " / " + y + " = " + (x/y));
        }
    }
}