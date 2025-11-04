import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 1:"));
        double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 2:"));
        double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Nota do Trabalho:"));
        double media = (prova1 + prova2 + trabalho) / 3;
        String situacao = media >= 6 ? "Aprovado!" : "Reprovado!";
        JOptionPane.showMessageDialog(null, String.format("Média: %.2f\nSituação: %s", media, situacao));
    }
}
