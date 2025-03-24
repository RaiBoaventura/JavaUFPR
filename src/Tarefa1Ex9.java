import java.util.Scanner;
public class Tarefa1Ex9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        float n1 = sc.nextFloat(); 
        System.out.println("Digite o segundo número:");
        float n2 = sc.nextFloat();

        System.out.println("Digite o operador: (+, -, *, /)");
        char op = sc.next().charAt(0);

        if (op=='+'){
            System.out.println("Resultado: "+(n1+n2));
        }else if (op=='-'){
                System.out.println("Resultado: "+(n1-n2));
        }else if (op=='*'){
                    System.out.println("Resultado: "+(n1*n2));
         } else if (op=='/'){
            if (n2==0){
                System.out.println("Não é possível dividir por zero");
            }else
                        System.out.println("Resultado: "+(n1/n2));          
                }
                    else{
                            System.out.println("Operador inválido");}
         sc.close();
                        }
}
    