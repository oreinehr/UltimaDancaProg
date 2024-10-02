package Aula32;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    // Construtor padrão com capacidade inicial de 10 elementos
    public Lista() {
        this(10);  // Chama o construtor com capacidade especificada
    }

    // Construtor com capacidade especificada
    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] aux = (T[]) new Object[tamanho * 2];
            for (int i = 0; i < elementos.length; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    public void adiciona(T elemento) {
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posicao " + posicao + " é inválida");
        aumentaCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public T remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        T copia = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return copia;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return true;
        }
        return false;
    }

    public boolean remove(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int ultimaPosicaoElemento(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        return elementos[posicao];
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("[");
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++)
                retorno.append(elementos[i]).append(", ");
            retorno.append(elementos[tamanho - 1]);
        }
        retorno.append("]");
        return retorno.toString();
    }
}
