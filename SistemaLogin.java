import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.print("Login: ");
            String login = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();
            if (login.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                tentativas--;
                if (tentativas > 0)
                    System.out.println("Dados incorretos. Tentativas restantes: " + tentativas);
                else
                    System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
            }
        }
        sc.close();
    }
}
