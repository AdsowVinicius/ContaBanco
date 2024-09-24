import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boa tarde, bem vindo ao cadastro do banco lalaBan, primeiramente em diga o sue nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite o numero da sua conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor digite o numero da sua agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o saldo que sera disponibilizado nesta conta:");
        float saldo = scanner.nextFloat();

        System.out.println("Ola " +nome+ ", obrigado por criar conta no nosso banco, sua agencia é "+agencia+", conta " +numero+ "e seu saldo " +saldo+ " ja esta disponivel !!");

        scanner.close();


    }
}