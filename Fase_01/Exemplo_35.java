import javax.swing.JOptionPane;

public class Exemplo_35 {

	public static void main(String[] args) {
		String ovos, leite, farinha;
		
		ovos = JOptionPane.showInputDialog("Digite o Ingrediente");
		leite = JOptionPane.showInputDialog("Digite o Ingrediente");
		farinha = JOptionPane.showInputDialog("Digite o Ingrediente");
		
		fazerBolo(ovos,leite,farinha);

	}
	
	public static void fazerBolo(String a, String b , String c) {
		String d = "ovos";
		String e = "leite";
		String f  = "farinha"; 
		// 
		if(d.equals(a) && e.equals(b) && f.equals(c)) {
		
			JOptionPane.showMessageDialog(null, "O bolo está pronto!!"); 
			
		} else {
			JOptionPane.showMessageDialog(null, "O bolo está pronto!! Só que não");
		} 
		
	}

}
