import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.print("Digite seus anos de contribuição: ");
        int contribuicao = sc.nextInt();
        boolean podeAposentar = false;
        int falta = 0;
        if (sexo == 'M') {
            podeAposentar = (idade >= 65 || contribuicao >= 35);
            falta = Math.max(0, Math.min(65 - idade, 35 - contribuicao));
        } else if (sexo == 'F') {
            podeAposentar = (idade >= 62 || contribuicao >= 30);
            falta = Math.max(0, Math.min(62 - idade, 30 - contribuicao));
        }
        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            System.out.println("Faltam aproximadamente " + falta + " anos para se aposentar.");
        }
        sc.close();
    }
}
