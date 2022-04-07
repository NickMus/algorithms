package hw3;

public class Main {
    public static void main(String[] args) {
//        [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16]

        StackImpl<Integer> stack = new StackImpl<>(11);

//        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//        stack.push(16);

        stack.display();

        stack.findElement();
    }
}
