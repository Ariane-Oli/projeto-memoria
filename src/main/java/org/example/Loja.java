package org.example;

public class Loja {
    public static void main(String[] args) {
        Produto p1, p2;

        p1 = new Produto(1, "Computador", 1000);

        System.out.println("Antes da correção.....");
        System.out.println("pq = " +p1.exibirInfo());
        Atualizador a = new Atualizador(7.5);
        a.atualizarPreco(p1);

        System.out.println("Após a correção de preços...");
        System.out.println("pq = " +p1.exibirInfo());
    }
}