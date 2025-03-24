import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarefa2Ex4 {

    public static void main(String[] args) {
        System.out.println("Digite a distância percorrida em quilômetros: ");
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        System.out.println("Digite o tempo em horas: ");
        float t = sc.nextFloat();

        float v = (d/t);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A velocidade média é: " + df.format(v) + "Km/H");
    }
};