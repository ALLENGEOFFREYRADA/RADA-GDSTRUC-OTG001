package com.company;

public class Main {

    public static void main(String[] args) {

        Player greg = new Player(1, "Greg", 100);
        Player jon = new Player(2, "Jon", 23);
        Player john = new Player(3, "John", 45);
        Player quack = new Player(4, "Quack", 64);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(greg);
        playerLinkedList.addToFront(jon);
        playerLinkedList.addToFront(john);
        playerLinkedList.addToFront(quack);

        playerLinkedList.printList();

        System.out.println("Size: " + playerLinkedList.getSize());

        System.out.println("Greg's index: " + playerLinkedList.indexOf(greg));
        System.out.println("Jon's index: " + playerLinkedList.indexOf(jon));
        System.out.println("John's index: " + playerLinkedList.indexOf(john));
        System.out.println("Quack's index: " + playerLinkedList.indexOf(quack));

        System.out.println("List contains Quack: " + playerLinkedList.contains(quack));

        System.out.println("Removing node at the front.");

        playerLinkedList.removeFromFront();

        playerLinkedList.printList();

        System.out.println("Size: " + playerLinkedList.getSize());

        System.out.println("Greg's index: " + playerLinkedList.indexOf(greg));
        System.out.println("Jon's index: " + playerLinkedList.indexOf(jon));
        System.out.println("John's index: " + playerLinkedList.indexOf(john));
        System.out.println("Quack's index: " + playerLinkedList.indexOf(quack));

        System.out.println("List contains Quack: " + playerLinkedList.contains(quack));

    }
}
