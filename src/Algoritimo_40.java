
import javax.swing.JOptionPane;

public class Algoritimo_40 { 

    public static void main(String[] args) { 
        Double dividendo, divisor, quociente, resto ; 

            dividendo = Double.parseDouble(JOptionPane.showInputDialog("Digite o dividendo: "));
            divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor: "));

        quociente = dividendo/divisor;

        resto = dividendo%divisor ;

        JOptionPane.showMessageDialog(null,"Dividendo: "+dividendo+"\ndivisor: "+divisor+"\nQuociente: "+quociente+"\nResto: "+resto);



    }

}