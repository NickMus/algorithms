package hw6;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 20.04.2022
 */
public class Main {
    public static void main(String[] args) {

        int countOfTrees = 20;
        int balanced = 0;
        for (int i = 0; i < countOfTrees; i++) {
            Tree<Integer> tree = new Tree();
            while (tree.getLevel() != 4) {
                tree.add((int) (Math.random() * 50) - 25);
            }
            if (tree.isBalanced()) {
                balanced++;
            }
            tree.display();

        System.out.println("Из " + countOfTrees + " MyTreeMap сбалансированы " + balanced + "\r\nнесбалансированы " + (countOfTrees - balanced) + " деревьев");
        System.out.println("Несбалансированы " + ((((float) (countOfTrees - balanced)) * 100) / (float) countOfTrees) + " %");
//            Tree<Integer> tree = new Tree<>();
//            tree.add(60);
//            tree.add(50);
//            tree.add(66);
//            tree.add(40);
//            tree.add(55);
//            tree.add(70);
//            tree.add(31);
//            tree.add(45);
//            tree.add(42);
//            tree.add(43);
//            tree.add(69);
//            tree.add(67);
//            tree.add(68);
//            tree.add(81);
//
//            tree.display();

        }
    }
}
