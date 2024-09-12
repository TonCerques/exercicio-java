import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random num = new Random();
        int rand;
        int def = 0;
        boolean vdd = false;
        rand = num.nextInt(100)+1;


        while (vdd == false) {
            System.out.println("Digite um número de 0 a 100 para acertar a adivinhação!");
            def = ler.nextInt();
            if (rand == def) {
            System.out.println("Parabéns, você acertou!");
            vdd = true;
            } else if (rand > def) {
            System.out.println("Menor que o número gerado, tente mais uma vez.");
            } else if (rand < def) {
                System.out.println("Maior que o número gerado, tente mais uma vez.");
            }
        }// fim while
    } // fim main
} // fim class
