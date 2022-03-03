import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        //declaração de variaveis
        double custo, distribuidor = 28, imposto = 45, preco;
        //entrada de dados
        custo = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do veículo em reais:"));
        //processamento
        preco = custo + (custo * (distribuidor/100)) + (custo * (imposto/100));
        //saía de dados
        String s = String.format("O preço final do veículo será R$ %.2f:", preco);
        JOptionPane.showMessageDialog(null, s);
        
    }
}
