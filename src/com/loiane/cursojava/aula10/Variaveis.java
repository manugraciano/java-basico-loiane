package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args){
        //convenção Java
        int idade = 20;
        String nome = "Loiane";
        String nomeDoMeuCachorro = "totó";
        String ano2014 =  "2014";

        //aceito, mas nao utilizado
        int _idade;
        int $idade;

        //nao é convencao Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String NomeDoMeucachorro;

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má pratica
        int a =10;
        String b = "Loiane";

    }
}
