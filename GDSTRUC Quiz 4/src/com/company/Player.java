package com.company;

import java.util.Objects;

public class Player {

    private int id;
    private String userName;
    private int level;

    public Player(int id, String userName, int level) {
        this.id = id;
        this.userName = userName;
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
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
                Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, level);
    }

}