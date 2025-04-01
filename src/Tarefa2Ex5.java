import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarefa2Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdCd;
        float precoCd;
        System.out.println("Digite a quantidade de CD's");
        qtdCd = sc.nextInt();
        System.out.println("Digite o preço de cada.");
        precoCd = sc.nextFloat();
        float fatAnual = ((qtdCd/3)*precoCd)*12;
        System.out.println("faturamento anual é de R$" + fatAnual);
        DecimalFormat df = new DecimalFormat("0,00");

        float lucroMultas = ((qtdCd/3)*0.1f*precoCd*0.1f);
        System.out.println("Lucro multas é de R$" + df.format(lucroMultas) );
        sc.close();
    }   
}
