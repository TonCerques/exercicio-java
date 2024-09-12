public class Array {
    public static void main(String[] args) {
        
        int[] num = {2, 5, 601, 2, 4};
        int soma = 0;

        for (int i = 0; i < num.length; i++) {
            soma += num[i];
            System.out.println(soma);
        }
        System.out.println("A soma dos números foi: "+ soma);
}//fim main
}//fim class
