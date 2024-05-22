package org.designpattern.memento;

public class Game {
    private int playerPosition;
    private int playerScore;
    public int getPlayerPosition() {

        return playerPosition;
    }
    public void setPlayerPosition(int playerPosition) {

        this.playerPosition = playerPosition;
    }
    public int getPlayerScore() {

        return playerScore;
    }
    public void setPlayerScore(int playerScore) {

        this.playerScore = playerScore;
    }
    public GameMemento save(){
        return new GameMemento(playerPosition, playerScore);
    }
    public void restore(GameMemento memento) {
        this.playerPosition = memento.getPlayerPosition();
        this.playerScore = memento.getPlayerScore();
    }
    @Override
    public String toString() {
        return "Game [playerPosition=" + playerPosition + ", playerScore=" + playerScore + "]";
    }
}
