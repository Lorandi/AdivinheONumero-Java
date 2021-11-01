package entities;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void guessGame(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Integer number = 0;

        System.out.println("\n *** Bem vindo ao jodo de advinhação ***");
        System.out.print("\nEscolha o maior número que pode ser sorteado: ");
        Integer biggestNumber = sc.nextInt();

        System.out.println("\nO intervalo dos números é de 0 até "+biggestNumber);

        System.out.print("\nEscolha o número de tentativas: ");
        Integer attempts = sc.nextInt();
        System.out.println(String.format("\nVocê tem %s tentativas",attempts));

        Integer turns = 1;
        Boolean hit = false;
        Integer bet = 0;

        number = random.nextInt(biggestNumber);

        System.out.println(number);

        do{
            System.out.print(String.format("\nTentativa %d:  ", turns));
            bet = sc.nextInt();

            if(bet > number){
                System.out.println("\nERROU. O número correto é menor que " + bet + ".");
            }else if(bet < number){
                System.out.println("\nERROU. O número correto é maior que " + bet + ".");
            }else{
                System.out.println("\nParabéns, você acertou");
                hit=true;
            }
            turns++;
        }while(!hit && turns <= attempts);

        if(!hit){
            System.out.println("\nO número correto é " + number);
        }

        System.out.print("\nAperte 1 para jogar novamente ou qualquer outra tecla para sair: ");
        String playAgain = sc.next().toLowerCase(Locale.ROOT);
        if(playAgain.equals("1")){
            guessGame();
        } else{
            System.out.println("\nAté logo");
        }

        sc.close();
    }
}
