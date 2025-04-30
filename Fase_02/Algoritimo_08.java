
import javax.swing.JOptionPane;

public class Algoritimo_08 {

	public static void main(String[] args) { 
        int idade;
        double altura;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a su idade"));

        switch (idade) {
            case 15:

                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: ")); 
                if(altura>= 1.50 && altura <= 1.65){
                    JOptionPane.showMessageDialog(null, "tudo ok");
                }else {
                    JOptionPane.showMessageDialog(null, "Deu ruim");
                }                               
                break;

            case 16:
                JOptionPane.showMessageDialog(null, "É 16");
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: ")); 
                if(altura>= 1.70 && altura <= 1.80){
                    JOptionPane.showMessageDialog(null, "tudo ok");
                }else {
                    JOptionPane.showMessageDialog(null, "Deu ruim");
                }                               

                break;
            case 17:
                JOptionPane.showMessageDialog(null, "É 17");

                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: ")); 
                if(altura>= 1.80 && altura <= 2.00){
                    JOptionPane.showMessageDialog(null, "tudo ok");
                }else {
                    JOptionPane.showMessageDialog(null, "Deu ruim");
                }                               

                break;

            case 18:                 
                JOptionPane.showMessageDialog(null, "É 18");
                
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: ")); 
                if(altura>= 1.90 && altura <= 2.10){
                    JOptionPane.showMessageDialog(null, "tudo ok");
                }else {
                    JOptionPane.showMessageDialog(null, "Deu ruim");
                }                               
            break;   
            default:
                JOptionPane.showMessageDialog(null, "Fora do intervalo");
                break;
                
                
        }

    }
    }