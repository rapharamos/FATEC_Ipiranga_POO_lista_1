import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        //declaração de variaváveis
        double eleitores, brancos, nulos, validos, pbrancos, pnulos, pvalidos;
        //entrada de dados
        eleitores = Double.parseDouble(JOptionPane.showInputDialog("Quantos são os eleitores?"));
        brancos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram brancos?"));
        nulos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram nulos?"));
        validos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram válidos?"));
        //processamento
        pbrancos = (brancos/eleitores)*100;
        pnulos = (nulos/eleitores)*100;
        pvalidos = (validos/eleitores*100);
        //saía de dados
        String s = String.format("Nesta eleição houve %.2f brancos, %.2f nulos e %.2f validos", pbrancos, pnulos, pvalidos);
        JOptionPane.showMessageDialog(null, s);    
    }
}