package com.example.projeto_conta_bancaria_desafio;

import java.util.Scanner;

public class Conta_Terminal 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entre com o numero da sua agencia : ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome : ");
        String Nome_Cliente = scanner.nextLine();

        System.out.println(" Digite seu saldo :");
        double saldo = scanner.nextDouble();


        conta conta_00 = new conta(numero,agencia,Nome_Cliente,saldo);


        System.out.println("Olá "+conta_00.getNome_Cliente()+" obrigado por criar uma conta conosco, sua agencia e a :"+conta_00.getAgencia()+" e sua conta e :"+conta_00.getNumero()+"e seu saldo e :"+conta_00.getSaldo());
        System.out.println(conta_00);
        scanner.close();
    }
}
