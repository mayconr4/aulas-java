import javax.swing.*;
import java.util.Scanner;

public class Desafio_01 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double nivel_escolhido,desconto;
        int nivel, diaDePagar ;

        System.out.println("digite o seu nivel de mensalidade: ");
        nivel = ler.nextInt();

        nivel_escolhido = descobrirNivel(nivel);
        //System.out.println(nivel_escolhido);

        System.out.println("digite o dia que voce planeja pagar: ");
        diaDePagar = ler.nextInt();

        desconto = descobrirPagamento_desconto(diaDePagar,nivel_escolhido);



    }//Classe para  solictar estes métodos

        public static double descobrirNivel(int opcao){ //METODO
        double teste;
       // int nivel_de_mensalidade;

        Scanner ler = new Scanner(System.in);
        /*System.out.println("Digite o seu nivel de mensalidade: ");
        nivel_de_mensalidade = ler.nextInt();*/


        switch (opcao) {
            case 1:

                teste = 51.50;
                System.out.println(teste);
                break;
            case 2:

                teste = 65.00;
                System.out.println(teste);
                break;
            case 3:

                teste = 80.00;
                System.out.println(teste);
                break;
            case 4:

                teste = 100.00;
                System.out.println(teste);
                break;
            default:
                teste = 0.00;
               System.out.println("tente noamente Nivel inválido: ");
        }
    return teste;
    } //metodo descobrirnivel

        public  static double descobrirPagamento_desconto(int diaDepagamento, double nivelEscolhido){
            double   conta = nivelEscolhido;


        switch (diaDepagamento){

            case 1,2,3,4:

            conta = nivelEscolhido*(1- 15.0/100);
                System.out.println("voce teve 15% de desconto: "+conta);


            break;
            case 5,6,7,8,9:

            conta =  nivelEscolhido*(1- 10.0/100);
                System.out.println("voce teve 10% de desconto: "+conta);

            break;
            case 10:

            conta = nivelEscolhido*(1- 3.89/100);
                System.out.println("Voce teve 3,89% de desconto: "+conta); //R$%.2f%n arredondar numero e usar printf

            break;
            default:
                System.out.println("Sem desconto: "+conta);

        }
            return conta;
        }//Metodo DescobrirPpagamento_deconto


}//CLASE CENTRAL


