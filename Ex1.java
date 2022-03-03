import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        //declaracao de variaveis
        double cotacao, dolar, real;
        //entrada de dados
        cotacao = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite a cotação do dólar em reais:"));
        dolar = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite a quantidade em dólares:"));
        //processamento
        real = dolar * cotacao;
        //saída
        String s = String.format("%.2f dólares equivalem a %.2f reais!", dolar, real);
        JOptionPane.showMessageDialog(null, s);

    }
}