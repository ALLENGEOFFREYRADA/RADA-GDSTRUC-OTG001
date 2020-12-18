package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(9);
        tree.insert(26);
        tree.insert(12);

        tree.traverseInOrder();
        tree.traverseInOrderReverse();

        System.out.println(tree.getMin());
        System.out.println(tree.getMax());

    }
}
