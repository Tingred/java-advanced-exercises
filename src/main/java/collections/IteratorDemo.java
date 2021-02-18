package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Adam","Ola","Ewa"));

        //Iterator ustawiony jest przed pierwszym elementem.
        //Iteratory są jednorazowego użytku - nie można ich cofnąć do początku po użyciu
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            // wewnątrz pętli wywołujemy next tylko raz!!!
            // lub tylko raz po sprawdzeniu hasNext() zwracającym true!!!
            String item = iterator.next();
            System.out.println(item);
        }
        System.out.println("Modyfikacja kolekcji podczas iterowania");
        System.out.println("Usuwamy elementy o długości 3 znaków");
        iterator = names.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if (item.length()==3){
                iterator.remove();
            }

        }
        System.out.println(names);

    }
}/*         Iterator może modyfikować to co jest za nim
*           i   -> i(0)* ->i(1) -> i(2) -> i(3)     -iterator
               0-       1       2       3         -elementy listy
            legenda:
            ->  wywołanie next
            *   wywołanie remove

 */