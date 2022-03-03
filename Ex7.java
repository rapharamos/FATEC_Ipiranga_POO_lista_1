import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        //declaração de variaveis
        int anos, meses, dias, dias2;
        //entrada de dados
        anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos completos você tem?"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("E quantos meses?"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("E quantos dias?"));
        //processamento
        dias2 = (anos * 365) + (meses * 30) + dias;
        //saía de dados
        String s = String.format("Sua idade em dias é: %d", dias2);
        JOptionPane.showMessageDialog(null, s);
        
    }
}