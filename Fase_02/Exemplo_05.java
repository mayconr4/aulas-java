
import javax.swing.JOptionPane;

public class Exemplo_05 {

	public static void main(String[] args) {
        double salario, menor, maior, total;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sálario")); 
    
    

        if (salario <= 1412){
        menor = (salario/100)*40;
        total = menor+salario;
        JOptionPane.showMessageDialog(null, "Agora o seu sálario vai ser"+total+"\nFoi adicionado mais: "+menor);
        } else if (salario > 1412) {
            maior = (salario/100)*30;
            total = maior+ salario;
            JOptionPane.showMessageDialog(null, "Agora o seu sálario vai ser"+total+"\nFoi adicionado mais "+maior);
        }  
        
           
    }
    }