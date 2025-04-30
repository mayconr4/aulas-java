
import javax.swing.JOptionPane;

public class Algoritimo_06 {

	public static void main(String[] args) { 
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a su idade"));

        switch (idade) {
            case 15:
                System.out.println("É 15");
                JOptionPane.showMessageDialog(null, "É 15");

                break; 
                case 16:
                JOptionPane.showMessageDialog(null, "É 16");

                break;
                case 17:
                JOptionPane.showMessageDialog(null, "É 17");

                break;

                case 18:                 
                JOptionPane.showMessageDialog(null, "É 18");
                break; 

            default:
                JOptionPane.showMessageDialog(null, "Fora do intervalo");
            break;
                
                
        }

    }
    }