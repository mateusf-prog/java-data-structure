package vetores;

public class Vetor<T> {
/*
 * Vetor é uma estrutura de dados que armazena uma sequência de elementos
 * de um mesmo tipo. A diferença entre um vetor e uma lista é que o vetor
 * tem tamanho fixo, enquanto a lista tem tamanho variável.
 */
    private Object[] elementos;

    public Vetor(int tamanho) {
       this.elementos = new Object[tamanho];
    }

    public void inserirEm(int posicao, T elementos) {
        this.elementos[posicao] = elementos;
    }

    @SuppressWarnings("unchecked") // ignora o warning de cast 
    public T recuperarEm(int posicao) {
        return (T)this.elementos[posicao];
    }
}
