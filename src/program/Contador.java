package program;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo");
        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
    
        try{
            contar(parametroUm,parametroDois);
        }
        catch(ParametrosInvalidosException e){
                System.out.println(e.getMessage());
        }
        terminal.close();
    }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
           if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro ");
           }
           int contagem = parametroDois - parametroUm;
           for(int i = 1; i <= contagem; i++){
            System.out.println("O resultado é: " + i );
           }
        }
          
}