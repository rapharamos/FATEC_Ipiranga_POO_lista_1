import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        //declaração de variaveis
        double precopeca, unidades, comissao;
        //entrada de dados
        precopeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da peça em reais:"));
        unidades = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
        //processamento
        comissao = (precopeca * unidades) * 0.05;
        //saía de dados
        String s = String.format("A comissão será de %.2f reais", comissao);
        JOptionPane.showMessageDialog(null, s);
        
    }    
}
