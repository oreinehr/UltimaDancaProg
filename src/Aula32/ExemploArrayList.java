package Aula32;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();

        l1.add("A");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.add("F");
        l1.add("G");

        System.out.println("ArrayList inicial: " + l1);

        // Adiciona um elemento na posição 1
        l1.add(1, "B");
        System.out.println("Após adicionar 'B' na posição 1: " + l1);

        // Remove o elemento na posição 3
        System.out.println("Removendo o elemento da posição 3: " + l1.remove(3));
        System.out.println("Após remoção: " + l1);

        // Verifica se a lista contém um elemento
        System.out.println("ArrayList contém 'E': " + l1.contains("E"));
        System.out.println("ArrayList contém 'X': " + l1.contains("X"));

        // Remove um elemento específico
        System.out.println("Removendo 'F': " + l1.remove("F"));
        System.out.println("Após remoção de 'F': " + l1);

        // Limpa a lista
        l1.clear();
        System.out.println("Após limpar a lista: " + l1);

        // Adiciona alguns elementos novamente para novos testes
        l1.add("H");
        l1.add("I");
        l1.add("J");
        l1.add("K");
        l1.add("L");
        System.out.println("ArrayList com novos elementos: " + l1);

        // Verifica o tamanho da lista
        System.out.println("Tamanho do ArrayList: " + l1.size());

        // Verifica se a lista está vazia
        System.out.println("A ArrayList está vazia? " + l1.isEmpty());

        // Adiciona um elemento repetido e encontra a última posição
        l1.add("M");
        l1.add("N");
        l1.add("H"); // Adiciona um elemento repetido
        System.out.println("Última posição de 'H': " + l1.lastIndexOf("H"));
        System.out.println("Última posição de 'M': " + l1.lastIndexOf("M"));
    }
}
