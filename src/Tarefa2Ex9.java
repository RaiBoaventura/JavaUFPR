import java.util.Scanner;
import java.math.*;

public class Tarefa2Ex9 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();


        double delta = b * b - 4 * a * c;
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);        

        System.out.println("VAlor das raizes são: " + r1 + " e " + r2);
    }

}