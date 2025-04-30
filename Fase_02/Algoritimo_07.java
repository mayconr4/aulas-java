
import javax.swing.JOptionPane;

public class Algoritimo_07 {

	public static void main(String[] args) {

    double num_01, num_02 ,total;
    String operacao;
    num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
    num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
    operacao = JOptionPane.showInputDialog("Digite a operação ");

    switch (operacao) {
        case "+": 
            total = num_01+num_02;
            JOptionPane.showMessageDialog(null, "O total da soma é : "+total);
            break;
        case"-":
            total = num_01-num_02;
            JOptionPane.showMessageDialog(null, "O total da subtração é : "+total);
            break;
        case"*":
            total = num_01*num_02;
            JOptionPane.showMessageDialog(null, "O total da Multiplicação é : "+total);
            break;
        case"/":
            total = num_01/num_02;
            JOptionPane.showMessageDialog(null, "O total da divisao é: "+total);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Tente novamente; ");
            break;
    }

}} 