import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI:"));
        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double imposto = baseCalculo * (percentual / 100);
        JOptionPane.showMessageDialog(null, String.format("Valor do ITBI: R$ %.2f", imposto));
    }
}
