import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioBruto;
        float salarioLiquido;
        float descontoInss;
        float descontoImpostoRenda;
        float totalLiquido = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nInforme o Salário Bruto do Funcionario " + i + " :");
            salarioBruto = input.nextFloat();

            if (salarioBruto <= 1212.00) {
                descontoInss = salarioBruto * 0.075f;
            } else if (salarioBruto <= 2427.35) {
                descontoInss = salarioBruto * 0.09f;
            } else if (salarioBruto >= 3641.03) {
                descontoInss = salarioBruto * 0.14f;
            } else {
                descontoInss = salarioBruto * 0.14f;
            }

            if (salarioBruto <= 1903.98) {
                descontoImpostoRenda = 0;
            } else if (salarioBruto <= 2826.65) {
                descontoImpostoRenda = salarioBruto * 0.075f;
            } else if (salarioBruto <= 3751.05) {
                descontoImpostoRenda = salarioBruto * 0.15f;
            } else if (salarioBruto <= 4664.68) {
                descontoImpostoRenda = salarioBruto * 0.225f;
            } else {
                descontoImpostoRenda = salarioBruto * 0.225f;
            }

            salarioLiquido = salarioBruto - descontoInss - descontoImpostoRenda;

            totalLiquido += salarioLiquido;

            System.out.println("\nFuncionario " + i + " :");
            System.out.println("Salario Bruto: " + salarioBruto);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto Imposto de Renda:" + descontoImpostoRenda);
            System.out.println("Salário Liquido: " + salarioLiquido);

        }

        System.out.println("\nTotal do Salário Liquido no Mês: " + totalLiquido);


        input.close();
    }
}
