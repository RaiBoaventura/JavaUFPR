import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarefa2Ex4 {

    public static void main(String[] args) {
        System.out.println("Digite a distância percorrida em quilômetros: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println("Digite o tempo em horas: ");
        int t = sc.nextInt();

        float v = (d/t);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A velocidade média é: " + df.format(v) + "Km/H");
    }
};