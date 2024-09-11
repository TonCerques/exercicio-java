import java.util.Scanner;

public class Metros {
    public static void main(String[] args) {
        
        double metros;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos metros você percorreu por segundo?");
        metros = ler.nextDouble();

        if (metros <= 5) {
            System.out.println("Você é um idoso? Lento pra porra");
        } else if ( metros <= 15) {
            System.out.println("Calma jogador? Tá mediano ainda.");
        } else if (metros > 15) {
            System.out.println("Usain Bolt? Quer correr mais que bala?");
        }

    }
}
