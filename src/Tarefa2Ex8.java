import java.util.Scanner;
public class Tarefa2Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        System.out.println("Digite o valor de X do ponto 1: ");
        x1 = sc.nextDouble();
        System.out.println("Digite o valor de Y ponto 1: ");
        y1 = sc.nextDouble();
        System.out.println("Digite o valor de X do ponto 2: ");
        x2 = sc.nextDouble();
        System.out.println("Digite o valor de Y ponto 2: ");
        y2 = sc.nextDouble();

        double dx = (x2-x1);
        double dy = (y2-y1);
        dx = Math.pow(dx, 2);
        dy = Math.pow(dy, 2);
        double r = Math.sqrt(dx+dy);

        System.out.printf("A distância entre os dois pontos é: %.2f\n", r);
    }   
}