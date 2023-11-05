package main;

import java.util.Scanner;

import modelos.Pessoa;
import vetores.Vetor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Gerenciamento de memória");
        System.out.println("2 - Vetores");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
            fazerGerenciamentoDeMemoria();
                break;
            case 2:
            fazerVetores();
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

    private static void fazerVetores() {

        // arrays são um tipo de refêrencia e não de valor
        Vetor<Pessoa> vetor = new Vetor<Pessoa>(10);
        vetor.inserirEm(2, new Pessoa(1, "João"));
        System.out.println(vetor.recuperarEm(2));

        Vetor<Integer> vetorInt = new Vetor<Integer>(10);
        vetorInt.inserirEm(2, 1);
        System.out.println(vetorInt.recuperarEm(2));
    }
}