package br.com.andretecnologia.app.exceptions;

public class Excecoes {

    int a = 10;
    int b = 0;

    public void Somar(){
        int soma;
        soma = a+b;
        System.out.println(soma);
    }

    public void Dividir() throws Exception{
        int divisao;
        divisao = a / b;
        System.out.println(divisao);
    }

    public void Texto(){
        System.out.println("Chegou nesse texto");
    }
}
