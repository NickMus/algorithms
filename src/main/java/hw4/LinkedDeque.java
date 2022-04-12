package hw4;

import hw4.deque.Deque;

public class LinkedDeque<E> implements Deque<E> {

    private final TwoSideLinkedList<E> data;
    protected LinkedList.Node<E> first;
    protected LinkedList.Node<E> last;
    protected LinkedList.Node<E> prev;
    protected int size;

    public LinkedDeque() {
        this.data = new TwoSideLinkedListImpl<>();
    }


    @Override
    public boolean insertLeft(E value) {
        LinkedList.Node<E> curr = last;
        last = new LinkedList.Node<>(value, null);
        last.prev = curr;
        curr.next = last;
        data.insertLast(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isEmpty()) {
            first = new LinkedList.Node<>(value, null);
            last = first;
            first.prev = null;
            data.insertFirst(value);
        } else {
            LinkedList.Node<E> curr = first;
            first = new LinkedList.Node<>(value, curr);
            curr.prev = first;
        }

        return true;
    }

    @Override
    public E removeLeft() {
        LinkedList.Node<E> removedNode = last;
        last = removedNode.prev;
        removedNode.prev = null;
        size--;

        return removedNode.value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        LinkedList.Node<E> removedNode = first;
        first = removedNode.next;
        removedNode.next = null;
        size--;

        return removedNode.value;
    }

    @Override
    public boolean insert(E value) {
        if (isEmpty()) {
            insertRight(value);
        } else {
            insertLeft(value);
        }
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

}
