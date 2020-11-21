package com.company;

public class Main {

    public static void main(String[] args) {
	    Player bords = new Player(1, "Bords", 21);
        Player gandalf = new Player(2, "Gandalf", 40);
        Player lumiere = new Player(3, "Lumiere", 12);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(bords.getUserName(), bords);
        hashTable.put(gandalf.getUserName(), gandalf);
        hashTable.put(lumiere.getUserName(), lumiere);

        hashTable.printHashTable();
        hashTable.remove("Lumiere");
        hashTable.printHashTable();

    }
}
