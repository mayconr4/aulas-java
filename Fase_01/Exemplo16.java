import javax.swing.JOptionPane;

public class Exemplo16 {

	public static void main(String[] args) {
		String nome;
		String telefone;
		int data,dia,mes,ano ,idade;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		telefone = JOptionPane.showInputDialog("Digite o seu Telefone");
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digie quantos anos você tem"));  		
		data = Integer.parseInt(JOptionPane.showInputDialog("Digie a data no formato ddmmaa:"));
		dia = data/10000;
		mes = data%10000/100;
		ano = data%100; 
		
		JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nidade:"+idade+"\ndata");
		 
	}

}
