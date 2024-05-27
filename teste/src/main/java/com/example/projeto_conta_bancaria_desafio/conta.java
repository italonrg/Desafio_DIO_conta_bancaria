package com.example.projeto_conta_bancaria_desafio;

public class conta {
    int Numero;
    String Agencia;
    String Nome_Cliente;
    Double saldo;
    
    public conta(int numero, String agencia, String nome_Cliente, Double saldo) {
        Numero = numero;
        Agencia = agencia;
        Nome_Cliente = nome_Cliente;
        this.saldo = saldo;
    }


    public int getNumero() {
        return Numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "conta [Numero=" + Numero + ", Agencia=" + Agencia + ", Nome_Cliente=" + Nome_Cliente + ", saldo="
                + saldo + "]";
    }
    
}
