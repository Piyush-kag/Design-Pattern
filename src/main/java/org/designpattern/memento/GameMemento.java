package org.designpattern.memento;

public class GameMemento {
    private final int playerPosition;

    private final int playerScore;

    public GameMemento(int playerPosition, int playerScore) {

        this.playerPosition = playerPosition;
        this.playerScore = playerScore;
    }
    public int getPlayerPosition() {

        return playerPosition;
    }
    public int getPlayerScore() {

        return playerScore;
    }
}