import java.util.Scanner;

public class Banco {
 
   public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    int emprestimo;
    int parcelas;
    int salario;
    int valor;


    System.out.println("Você deseja realizar um empréstimo no Serasa? Diga o valor de empréstimo que deseja:");
    emprestimo = ler.nextInt();

    System.out.println("Número de parcelas que deseja está pagando o empréstimo:");
    parcelas = ler.nextInt();

    System.out.println();
    System.out.println("Sua renda salarial:");
    salario = ler.nextInt();

    if (parcelas >= 12){
        System.out.println("O limite de parcelas é de 12 vezes sem juros!");
    } else if (parcelas <= 12) {
        System.out.println("Está dentro do limite desejado!");
    }

    if (salario <= 1200){
        System.out.println("A gente não faz empréstimo pra liso, se saia mizera");
    } else if (salario >= 1200) {
        System.out.println("Está dentro das nossas regulamentações lhe oferecer o empréstimo.");
    }



    }



        
    }
}
