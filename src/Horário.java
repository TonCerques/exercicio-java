import java.util.Scanner;

public class Horário {
    public static void main(String[] args) {
        
        int horario;
        Scanner ler = new Scanner(System.in);

        System.out.println("Que horas é o jogo do Vasco?");
        horario = ler.nextInt();
        
        if (horario >= 9 && horario <=18){
            System.out.println("TO NO TRAMPO MAS QUE DISGRAÇA");
         } else {
            System.out.println("TO EM CASA PORRA, PEGA 3 CAIXA DE AMSTEL");
         }
            





    } // fim main
} // fim class
