package ListasLigadas;

public class ListaLigada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public ListaLigada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    // método para inserir um elemento na lista
    public void inserir(T elemento) {
        No<T> novoNo = new No<T>(elemento);    // iniciando a lista
        if (estaVazia()) {                     // se a lista estiver vazia
            this.primeiroNo = novoNo;          // o primeiro nó será o novo nó
            this.ultimoNo = novoNo;            // o último nó será o novo nó
        } else {
            this.ultimoNo.setProximo(novoNo);  // inserindo no final da lista
        }
        this.tamanho++;
    } 

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }
}
