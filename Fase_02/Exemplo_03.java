
import javax.swing.JOptionPane;

public class Exemplo_03 {

	public static void main(String[] args) {

        int idade;
        

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digte a mensagem"));
        

        if (idade == 15){ 
           JOptionPane.showMessageDialog(null, "Tem 15"+idade);

        }  else if (idade == 17){
            JOptionPane.showMessageDialog(null, "Tem 17"+idade);
        }  else {
            JOptionPane.showMessageDialog(null, "não tem idade");
        } 

        
    }
    
    }