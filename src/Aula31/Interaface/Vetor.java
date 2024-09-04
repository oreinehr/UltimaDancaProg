package Aula31.Interaface;
public class Vetor implements Lista {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public String remove() {
        if (tamanho > 0) {
            return elementos[--tamanho];
        }
        return null;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String resp = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                resp += elementos[i] + ", ";
            }
            resp += elementos[tamanho - 1];
        }
        resp += "]";
        return resp;
    }
}
