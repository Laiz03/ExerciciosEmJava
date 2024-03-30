package com.example;

public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;

    //construtor:

    public Conta() { //CONSTRUTOR VAZIO
    
    }

    public Conta(String dono, int numero) {  //CONSTRUTOR RECEBENDO "PARAMETRO"
        this.dono = dono;  //THIS REFERENCIA QUE O ATRIBUTO THIS.CONTA VEM DA CLASSE CONTA E O OUTRO VEM DO CONSTRUTOR, NESSE CASO
        this.numero = numero;
    }



    public void sacar (double qtd) {
        double novoSaldo = saldo + qtd;
        saldo = novoSaldo;
    }



    public void depositar(double qtd) {
        double novoSaldo = saldo + qtd;
        saldo = novoSaldo;
    }
}
