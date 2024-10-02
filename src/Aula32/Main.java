package Aula32;

public class Main {
    public static void main(String[] args) {
        Lista<String> l1 = new Lista<>();

        l1.adiciona("A");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        l1.adiciona("G");

        System.out.println("Lista inicial: " + l1);


        l1.adiciona(1, "B");
        System.out.println("Após adicionar 'B' na posição 1: " + l1);


        System.out.println("Removendo o elemento da posição 3: " + l1.remove(3));
        System.out.println("Após remoção: " + l1);


        System.out.println("Lista contém 'E': " + l1.contem("E"));
        System.out.println("Lista contém 'X': " + l1.contem("X"));


        System.out.println("Removendo 'F': " + l1.remove("F"));
        System.out.println("Após remoção de 'F': " + l1);

        // Limpa a lista
        l1.limpar();
        System.out.println("Após limpar a lista: " + l1);

        // Adiciona alguns elementos novamente para novos testes
        l1.adiciona("H");
        l1.adiciona("I");
        l1.adiciona("J");
        l1.adiciona("K");
        l1.adiciona("L");
        System.out.println("Lista com novos elementos: " + l1);

        // Verifica o tamanho da lista
        System.out.println("Tamanho da lista: " + l1.tamanho());

        // Verifica se a lista está vazia
        System.out.println("A lista está vazia? " + l1.estaVazia());

        // Encontra a última posição de um elemento
        l1.adiciona("M");
        l1.adiciona("N");
        l1.adiciona("H"); // Adiciona um elemento repetido
        System.out.println("Última posição de 'H': " + l1.ultimaPosicaoElemento("H"));
        System.out.println("Última posição de 'M': " + l1.ultimaPosicaoElemento("M"));
    }
}
