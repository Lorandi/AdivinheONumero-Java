package aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class Program {
        public static void main(String[] args) {
            SpringApplication.run(Program.class, args);

            Integer number = -1;
            Integer vezes = 0;

            while(number != 43 ){
                Random random = new Random();

                number = random.nextInt(20000);
                vezes++;

                System.out.println(String.format("na vez %d o valor foi %d", vezes, number));
            }

        }

}
