import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double salariobase, bonus, total;
        int def;


        System.out.println("Quanto de salário recebe o José?");
        salariobase = ler.nextDouble();
        System.out.println("Determine se José merece bonificação de acordo com o desempenho (20, 40, 60, 80):");
        def = ler.nextInt();
        
        System.out.println();
       
        switch (def) {
            case 20:
                if (def <= 20) {
                    System.out.println("Não haverá bonificação pois o desempenho foi péssimo, o salário será: " + salariobase);
                }
                break;
            case 40:
                if (def <= 40) {
                    bonus = salariobase * 0.05;
                    total = salariobase + bonus;
                    System.out.println("José possuíra um bônus de 5% em seu salário pois o desempenho foi regular, ou seja, receberá: " + total);
                }
            break;
             case 60:
                if (def <= 60) {
                    bonus = salariobase * 0.10;
                    total = salariobase + bonus;
                    System.out.println("José possuíra um bônus de 10% em seu salário pois o desempenho foi bom, ou seja, receberá: " + total);
                }    
            break;
            case 80:
            if (def <= 80) {
                bonus = salariobase * 0.20;
                total = salariobase + bonus;
                System.out.println("José possuíra um bônus de 20% em seu salário pois o desempenho foi ótimo, ou seja, receberá: " + total);
            }
            break;
            default:
                break;
        } // fim switch

    } // fim main
} // fim class
