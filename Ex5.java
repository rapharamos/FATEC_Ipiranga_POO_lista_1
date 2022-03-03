import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        //declaração de variaveis
        double base, altura, area;
        //entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
        //processamento
        area = base * altura;
        //saía de dados
        String s = String.format("Seu antecessor é: %.2f", area);
        JOptionPane.showMessageDialog(null, s);
        
    }
}