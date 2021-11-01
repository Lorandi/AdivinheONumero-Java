package entities;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void guessGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Integer number = 0;
        Integer turns = 1;
        Boolean hit = false;
        Integer bet = 0;
        Boolean exit = false;
        Integer attempts = 0;

        System.out.println("\n *** Bem vindo ao jodo de advinhação ***");

        Boolean check1 = false;
        while (!check1) {
            try {
                Integer biggestNumber;
                System.out.print("\nEscolha o maior número que pode ser sorteado: ");
                biggestNumber = sc.nextInt();
                number = random.nextInt(biggestNumber);
                System.out.println("\nO intervalo dos números é de 0 até " + biggestNumber);
                check1 = true;

            } catch (InputMismatchException msn) {
                System.out.println("Necessário digitar apenas números inteiros positivo");
                check1 = false;
                sc.nextLine();
            } catch (IllegalArgumentException msn){
                System.out.println("Necessário digitar apenas números inteiros positivo");
                check1 = false;
                sc.nextLine();
            }
        }

        Boolean check2 = false;
        while (!check2) {
            try {
                System.out.print("\nEscolha o número de tentativas: ");
                attempts = sc.nextInt();
                System.out.println(String.format("\nVocê tem %s tentativas", attempts));
                if(attempts< 0){
                    System.out.println("Necessário digitar apenas números inteiros");
                    check2 = false;
                } else{
                    check2 = true;
                }
            } catch (InputMismatchException msn) {
                System.out.println("Necessário digitar apenas números inteiros");
                check2 = false;
                sc.nextLine();
            }
            catch (IllegalArgumentException msn){
                System.out.println("Necessário digitar apenas números inteiros positivo");
                check2 = false;
                sc.nextLine();
            }
        }
        do {
            System.out.print(String.format("\nTentativa %d:  ", turns));
            bet = sc.nextInt();

            if (bet > number) {
                System.out.println("\nERROU. O número correto é menor que " + bet + ".");
            } else if (bet < number) {
                System.out.println("\nERROU. O número correto é maior que " + bet + ".");
            } else {
                System.out.println("\nParabéns, você acertou");
                hit = true;
            }
            turns++;
        } while (!hit && turns <= attempts);

        if (!hit) {
            System.out.println("\n Você PERDEUUUU!!!!!");
            System.out.println("\nO número correto era " + number);
        }

        System.out.print("\nAperte 1 para jogar novamente ou qualquer outra tecla para sair: ");
        String playAgain = sc.next().toLowerCase(Locale.ROOT);
        if (playAgain.equals("1")) {
            guessGame();
        } else {
            System.out.println("\nAté logo");
        }
        sc.close();
    }
}
