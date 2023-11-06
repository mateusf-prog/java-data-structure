package vetores;

import java.util.Arrays;

public class Vetor<T> {
/*
 * Vetor é uma estrutura de dados que armazena uma sequência de elementos
 * de um mesmo tipo. A diferença entre um vetor e uma lista é que o vetor
 * tem tamanho fixo, enquanto a lista tem tamanho variável.
 */
    private Object[] elementos;
    private int posicao;

    public Vetor(int tamanho) {
       this.elementos = new Object[tamanho];
    }
    public Vetor() {
        this.elementos = new Object[3];
        this.posicao = 0;
    }

    public void inserir(T elemento) {
        if (this.posicao >= this.elementos.length) {
            this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
        }
        this.elementos[this.posicao] = elemento;
    }

    public void inserirEm(int posicao, T elemento) {
        if (posicao > this.elementos.length) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        if (this.elementos != null) {
            Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
            Object[] arrayInicio = new Object[posicao + 1];
            System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
            arrayInicio[arrayInicio.length - 1] = elemento;
            int novoTamanho = arrayInicio.length + arrayFinal.length;
            this.elementos = new Object[novoTamanho];
            System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
            System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);

        } else {
            this.elementos[posicao] = elementos;
        }
        
    }

    @SuppressWarnings("unchecked") // ignora o warning de cast 
    public T recuperarEm(int posicao) {
        return (T)this.elementos[posicao];
    }
}
