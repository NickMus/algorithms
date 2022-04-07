package hw3;

public class StackImpl<E> implements Stack<E> {

    private Object[] arr;
    private int size;

    public StackImpl(int maxSize) {
        this.arr = new Object[maxSize];
    }

    @Override
    public boolean push(E value) {
        if (isFull()) {
            return false;
        }
        arr[size++] = value;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E value = peek();
        arr[--size] = null;
        return value;
    }

    @Override
    public E peek() {
        return (E) arr[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    public int findElement() {
        if (isEmpty()) {
            System.out.println("Пропущено: 1");
        }
        int value = (int) peek();
        int var = value;
        for (int i = value; i >= 0; --i) {
            pop();
            if (isEmpty() && i != 0) {
                System.out.println("Пропущено: " + (i - 1));
                break;
            }
            int value2 = (int) peek();
            --var;
            if (var != value2) {
                System.out.println("Пропущено: " + var);
                break;
            }
        }
        return var;
    }
}
