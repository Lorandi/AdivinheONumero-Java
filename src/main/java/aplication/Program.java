package aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class Program {
    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);

        Integer number = 0;
        Integer attempts = 10;
        Integer turns = 1;
        Boolean hit = false;
        Integer bet = 0;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        number = (random.nextInt(50)+1);

        System.out.println("Digite um tente adivinhar um número de 1 a 50");
        System.out.println(String.format("Você tem %s tentativas",attempts));
        System.out.println(number);

        do{
            System.out.print(String.format("Tentativa %d:  ", turns));
            bet = sc.nextInt();

            if(bet > number){
                System.out.println("ERROU. O número correto é menor que " + bet + ".");
            }else if(bet < number){
                System.out.println("ERROU. O número correto é maior que " + bet + ".");
            }else{
                System.out.println("Parabéns, você acertou");
                hit=true;
            }
                turns++;
        }while(!hit && turns <= 10);

        System.out.println(number);
    }

}
