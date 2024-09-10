import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner ler = new Scanner (System.in);

        int definição;
        
        System.out.println();
        System.out.println("Defina a avaliação do funcionário de acordo com a numeração de escala (30, 50, 80, 100):");
        definição = ler.nextInt();

        if (definição <= 30) {
            System.out.println("O funcionário tem desempenho insatisfatório");
        } 
        else if (definição <= 60) {
            System.out.println("O funcionário tem desempenho regular");
        } else if (definição <= 80) {
            System.out.println("O funcionário tem desempenho bom");
        }
        else if (definição <= 60) {
            System.out.println("O funcionário tem desempenho ótimo");  
        }
    }
}
