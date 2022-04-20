package hw4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


//        linkedDeque.removeRight();
//        linkedDeque.display();
//        System.out.println(linkedDeque.last.prev);
        iterFromFirst();
    }

    public static void iterFromFirst() {

        LinkedDeque<Integer> linkedDeque = new LinkedDeque<>();
        linkedDeque.insert(1);
        linkedDeque.insert(2);
        linkedDeque.insert(3);
        linkedDeque.insert(4);
        linkedDeque.insert(5);
        linkedDeque.insertRight(0);
        linkedDeque.insertLeft(6);

        linkedDeque.display();

        ListIterator<Integer> iterator = linkedDeque.iterator();

//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
//            System.out.println(integer);
//            if (!iterator.hasNext()) {
//                break;
//            }
//        }

        while (iterator.hasPrevious()) {
            Integer integer = iterator.previous();
            System.out.println(integer);
        }

    }

}
