import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        //declaração de variaveis
        double quantidade, valor, salariofixo, bonusfixo, salariofinal;
        //entrada de dados
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de vendas em reais:"));
        salariofixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário em reais:"));
        bonusfixo = Double.parseDouble(JOptionPane.showInputDialog("Digite a bonificação por carro vendido em reais:"));
        //processamento
        salariofinal = salariofixo + (bonusfixo * quantidade) + (valor * 0.05);
        //saía de dados
        String s = String.format("O salário do vendedor será R$ %.2f:", salariofinal);
        JOptionPane.showMessageDialog(null, s);
        
    }
}
