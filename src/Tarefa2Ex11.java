import java.util.Scanner;

public class Tarefa2Ex11 {
    public static void main(String[] args) {
        double salario;
        int pessoasGerenciadas;
        int depGerenciados;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o salário: ");
        salario = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer após nextDouble

        System.out.println("Qual sua função atual? \n1 - Diretor\n2 - Gerente\n3 - Analista\n4 - Programador\n5 - Auxiliar de Limpeza");
        String cargo = sc.nextLine();

        boolean cargoValido = false;
        while (!cargoValido) {
            if (cargo.equals("1")) {
                System.out.println("Cargo: Diretor");
                System.out.print("Quantos departamentos? ");
                depGerenciados = sc.nextInt();
                salario = salario * 4 + 3000 * depGerenciados;
                cargoValido = true;
            } else if (cargo.equals("2")) {
                System.out.println("Cargo: Gerente");
                System.out.print("Quantas pessoas gerenciadas? ");
                pessoasGerenciadas = sc.nextInt();
                salario = salario * 2 + 100 * pessoasGerenciadas;
                cargoValido = true;
            } else if (cargo.equals("3")) {
                System.out.println("Cargo: Analista");
                salario = salario * 1;
                cargoValido = true;
            } else if (cargo.equals("4")) {
                System.out.println("Cargo: Programador");
                salario = salario * 0.8;
                cargoValido = true;
            } else if (cargo.equals("5")) {
                System.out.println("Cargo: Auxiliar de Limpeza");
                salario = salario * 0.5;
                cargoValido = true;
            } else {
                System.out.println("Cargo Inválido, digite um cargo válido: ");
                cargo = sc.nextLine();
            }
        }

        System.out.println("O bônus anual é: R$" + salario);
    }
}
