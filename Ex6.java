import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        //declaração de variaveis
        int anos, dias;
        //entrada de dados
        anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        //processamento
        dias = anos * 365;
        //saía de dados
        String s = String.format("Sua idade em dias é: %d", dias);
        JOptionPane.showMessageDialog(null, s);
        
    }
}
