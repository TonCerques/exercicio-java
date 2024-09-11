import java.util.Scanner;

public class Banco {
 
   public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    double emprestimo = 0, salario = 0, valorparcela = 0, valorlimite = 0;
    int parcelas = 0;
    boolean aprovadoParcelas=false;
    boolean aprovadoSalario =false;

    
    System.out.println("Você deseja realizar um empréstimo no Serasa? Diga o valor de empréstimo que deseja:");
    emprestimo = ler.nextInt();
    
    while (aprovadoParcelas == false){

    System.out.println();    
    System.out.println("Número de parcelas que deseja está pagando o empréstimo:");
    parcelas = ler.nextInt();
        if (parcelas > 12){
            System.out.println();
            System.out.println("O limite de parcelas é de 12 vezes com 30% de juros!");
        } else if (parcelas <= 12) {
            System.out.println();
            System.out.println("Está dentro do limite desejado!");
            aprovadoParcelas = true;
        }
    } // FIM WHILE

    while (aprovadoSalario == false) {

    System.out.println();
    System.out.println("Sua renda salarial:");
    salario = ler.nextInt();
        if (salario <  1200){
            System.out.println();
            System.out.println("A gente não faz empréstimo pra liso, se saia mizera");
        } else {
            System.out.println();
            System.out.println("Está dentro das nossas regulamentações lhe oferecer o empréstimo.");
            aprovadoSalario = true;
        }
    } // FIM WHILE

     System.out.println();
        valorparcela = emprestimo / parcelas;
        valorlimite = salario * 0.30;
        if (valorlimite <= salario) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo reprovado!");
        }


    }// fim main
    }//fim class

