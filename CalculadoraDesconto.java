import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = sc.nextDouble();
        double valorDesconto = valor * (desconto / 100);
        double precoFinal = valor - valorDesconto;
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final com desconto: R$ %.2f%n", precoFinal);
        sc.close();
    }
}
