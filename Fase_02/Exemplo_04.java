
import javax.swing.JOptionPane;



public class Exemplo_04 {

	public static void main(String[] args) { 
        int idade;

       idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

       if(idade >=15 && idade <=18) {
            JOptionPane.showMessageDialog(null, "Está no intervalo de idade"); 
       }else{
            JOptionPane.showMessageDialog(null, "Esrá fora");
       }


    }} 

    // slario /100 multiplicar pela porcentagem