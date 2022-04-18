package hw4;

public class Main {
    public static void main(String[] args) {
        LinkedDeque linkedDeque = new LinkedDeque();
        linkedDeque.insert(1);
        linkedDeque.insert(2);
        linkedDeque.insert(3);
        linkedDeque.insert(4);
        linkedDeque.insert(5);
        linkedDeque.insertRight(0);
        linkedDeque.insertLeft(6);

        iterFromStart(linkedDeque);

//        linkedDeque.removeRight();
        linkedDeque.display();
//        System.out.println(linkedDeque.last.prev);
    }

    public static void iterFromStart(LinkedDeque data) {
        for (int i = 0; i < data.size; i++) {
            System.out.println(data);
        }
    }
}
