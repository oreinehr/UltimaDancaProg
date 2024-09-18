package Aula32;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista(5);
        l1.adiciona("A");
        l1.adiciona("B");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
//        l1.adiciona("F");
//        l1.adiciona("G");
//        l1.adiciona("H");

        System.out.println(l1);
        System.out.println("Elemento da posição 1 "+l1.obter(1));
        System.out.println("Elemento da posição 11 "+l1.obter(11));

    }
}