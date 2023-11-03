package main;

import java.util.Scanner;

import modelos.Pessoa;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Gerenciamento de memória");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
            fazerGerenciamentoDeMemoria();
                break;
        }

        sc.close();
    }

    private static void fazerGerenciamentoDeMemoria() {
        int a = 3;
        System.err.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println("------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println("------------------");
        Pessoa p1 = new Pessoa(1, "João");
        System.out.println(p1);
        Pessoa p2 = p1;
        System.out.println(p2);
        System.out.println("------------------");
        p2.setNome("Mateus");
        System.out.println(p1);
        System.out.println(p2);
    }
}