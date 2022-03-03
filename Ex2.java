import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        //declaração de variaveis
        double n1, n2, n3, n4, resultado;
        //entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));
        //processamento
        resultado = Math.pow(n1,2) + Math.pow(n2,2) + Math.pow(n3,2) + Math.pow(n4,2);
        //saía de dados
        String s = String.format("A soma dos quadrados é: %.2f", resultado);
        JOptionPane.showMessageDialog(null, s);
        
    }
}
