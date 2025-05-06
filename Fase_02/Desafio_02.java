import java.util.Scanner;

public class Desafio_02 {

    public static void main(String[] args){
        String escolher_gasolina, escolha_pagamento;
        double receberGasolina, desconto;
        int dia;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma gasolina: ");
        System.out.println("gasolina comun ");
        System.out.println("alcool: ");
        System.out.println("diesel: ");
        System.out.println("gasolina aditivada: ");
        System.out.println("Digite a opcçao desejada: ");
        escolher_gasolina = ler.nextLine();

        receberGasolina = descobrirGasolina(escolher_gasolina);
        System.out.println("custa"+receberGasolina+"R$"); 
        
        System.out.println("Digite o metodo de pagamento: ");
        escolha_pagamento = ler.nextLine() ; 
        
        System.out.println("Digite o  dia que você deseja pagar ");
        dia = ler.nextInt() ;
        
        desconto = descobirDesconto(escolha_pagamento,dia,receberGasolina); 
        		
        



    }

    public static double descobrirGasolina(String nomeGasolina ){
        double acumuladora ; // iniciando acumuladora por conta do return

        switch (nomeGasolina){

            case"gasolina comum":

                acumuladora = 2.992;
                //System.out.println(acumuladora+"R$");
            break;
            case"álcool":

                acumuladora = 2.1095;
            break;
            case"diesel":

                acumuladora = 2.283;
            break;
            case"gasolina aditivada: ":

                acumuladora = 3.054;
            break;
            default:
               acumuladora = 0;
               System.out.println("Digite novamente: ");
        }
        return acumuladora;
    }

    public static double descobirDesconto(String metodoDepagamento,int dia, double gasolina){
        double recebeValor  = gasolina;//exemplo de nome qualquer

        switch (metodoDepagamento){

            case "a vista":

             recebeValor = gasolina*(1 - 5.3/100);
            case "cheque pré-datado":

                if (dia >21  &&  dia<=32){

                    recebeValor = gasolina*(1 + 15.0/100);
                } else {
                    double receberValor = gasolina;
                }
            break;
            case "Pagamento normal: ":

                recebeValor = gasolina;
            break;

            default:
                System.out.println("Digite novamente: ");
                recebeValor = gasolina;
        }
        return recebeValor;
    }
}
