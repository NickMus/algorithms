package hw6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 20.04.2022
 */
@AllArgsConstructor
@Getter
@Setter
public class Node<E> {
    private E value;
    private Node<E> current;
    private Node<E> parent;
    private Node<E> leftChild;
    private Node<E> rightChild;
    int level;
}
