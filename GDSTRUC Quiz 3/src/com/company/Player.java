package com.company;

import java.util.Objects;

public class Player {
    public static String[] PLAYERNAMES = { // random player names
            "Hotdog", "Fries", "Burger", "Fried Chicken", "Spaghetti", "Lechon", "Rice", "Banana",
            "Beef Teriyaki", "Ramen", "Sushi", "Tempura"
    };

    private int id;
    private String name;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                level == player.level &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

}