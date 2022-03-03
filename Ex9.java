import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        //declaração de variaveis
        double salario, reajuste, salariof;
        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste:"));
        //processamento
        salariof = salario + (salario * (reajuste/100));
        //saía de dados
        String s = String.format("Salário novo será de %.2f:", salariof);
        JOptionPane.showMessageDialog(null, s);
        
    }
}