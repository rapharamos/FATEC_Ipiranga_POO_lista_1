import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        //declaração de variaveis
        int valor, antecessor;
        //entrada de dados
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        //processamento
        antecessor = valor - 1;
        //saía de dados
        String s = String.format("Seu antecessor é: %d", antecessor);
        JOptionPane.showMessageDialog(null, s);
        
    }
}