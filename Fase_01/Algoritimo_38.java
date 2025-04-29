import javax.swing.*;
import java.util.Scanner;

public class Algoritimo_38 {
    public static void main(String[] args){
    double numeroReal, tercaParte;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        numeroReal = ler.nextDouble();

        tercaParte = numeroReal/3;

        JOptionPane.showMessageDialog(null,"a terca parte de "+numeroReal+"\né "+tercaParte);

    }
}
