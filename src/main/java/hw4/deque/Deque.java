package hw4.deque;



public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);
    void insertFirst(E value);

    E removeLeft();
    E removeRight();
}