import java.util.Scanner;

public class Cpf {
    public static void main(String[] args) {
        
        String cpf;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o CPF:");
        cpf = ler.next();
        if (cpf.length() <= 11) {
            System.out.println("CPF VÁLIDO");
        } else {
            System.out.println("CPF INVÁLIDO");
        }
    }
}
