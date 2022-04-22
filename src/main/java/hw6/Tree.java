package hw6;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.IOException;
import java.util.Stack;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 20.04.2022
 */
@Getter
public class Tree<E extends Comparable<E>> {
    private Node<E> root;
    int size;
    int level;

    @AllArgsConstructor
    private class NodeAndParent {
        private Node<E> current;
        private Node<E> parent;
        private int level;
    }

    public int add(E value) {
        Node<E> node;
        if (root == null) {
            node = new Node<E>(value, null, null, null, null, 1);
            root = node;
        } else {
            Node<E> current = root;
            Node<E> parent = null;
            while (current != null) {
                parent = current;
                if (current.getValue().compareTo(value) > 0) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }

            int var = parent.getLevel();
            if (var != 4) {
                var++;
                Node<E> node1 = new Node<>(value, null, parent, null, null, var);
                    if (parent.getValue().compareTo(value) > 0) {
                        parent.setLeftChild(node1);
                    } else {
                        parent.setRightChild(node1);
                    }
                }
            level = var;
            }
        size++;
        return level;
    }

    public void display() {
        Stack<Node<E>> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 64;

        boolean isRowEmpty = false;
        System.out.println("................................................................");

        while (!isRowEmpty) {
            Stack<Node<E>> localStack = new Stack<>();

            isRowEmpty = true;
            for (int i = 0; i < nBlanks; i++) {
                System.out.print(" ");
            }

            while (!globalStack.isEmpty()) {
                Node<E> tempNode = globalStack.pop();
                if (tempNode != null) {
                    System.out.print(tempNode.getValue());
                    localStack.push(tempNode.getLeftChild());
                    localStack.push(tempNode.getRightChild());
                    if (tempNode.getLeftChild() != null || tempNode.getRightChild() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();

            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }

            nBlanks /= 2;
        }
        System.out.println("................................................................");
    }
    boolean isBalanced() {
        if (root == null) {
            return true;
        } else {
            int leftHeight;
            int rightHeight;

            if (root.getLeftChild() == null) {
                leftHeight = 0;
            } else {
                leftHeight = root.getLeftChild().getLevel();
            }

            if (root.getRightChild() == null) {
                rightHeight = 0;
            } else {
                rightHeight = root.getRightChild().getLevel();
            }
            return Math.abs(leftHeight - rightHeight) <= 1;
        }
    }
}
