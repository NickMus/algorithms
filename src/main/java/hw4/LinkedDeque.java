package hw4;

import hw4.deque.Deque;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedDeque<E> implements Deque<E>, Iterable<E> {

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
        } else {
            LinkedList.Node<E> curr = first;
            first = new LinkedList.Node<>(value, curr);
            curr.prev = first;
        }
        data.insertFirst(value);

        return true;
    }

    @Override
    public void insertFirst(E value) {
        LinkedList.Node<E> curr = first;
        first.value = value;

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
    public ListIterator<E> iterator() {
        ListIterator<E> iterator = new ListIterator<E>() {

            LinkedList.Node<E> curr = first;
            LinkedList.Node<E> curr1 = last;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public E next() {
                first = curr.next;
                LinkedList.Node<E> a = curr;
                curr = first;
                return a.value;
            }

            @Override
            public boolean hasPrevious() {
                return curr1 != null;
            }

            @Override
            public E previous() {
                last = curr1.prev;
                LinkedList.Node<E> b = curr1;
                curr1 = last;
                return b.value;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
//            LinkedList.Node<E> curr = first;
//            LinkedList.Node<E> curr1 = last;
//
//            @Override
//            public boolean hasNext() {
//                return curr != null;
//            }
//
//            @Override
//            public E next() {
//                first = curr.next;
//                LinkedList.Node<E> a = curr;
//                curr = first;
//                return a.value;
//            }
//
//            public boolean hasPrev() {
//                return curr != null;
//            }
//            public E prev() {
//                prev = curr.prev;
//                LinkedList.Node<E> b = curr1;
//                curr1 = prev;
//                return b.value;
//            }
//        };
//
        };
        return iterator;
    }


        @Override
        public void display () {
            data.display();


        }
    }
