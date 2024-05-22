package org.designpattern.memento;

import java.util.Stack;

public class GameKeeper {
    private Stack<GameMemento> gameMementoStack = new Stack<>();

    private Game game;

    public GameKeeper(Game game) {

        this.game = game;
    }
    public void saveGame() {

        gameMementoStack.push(game.save());
    }

    public void restoreGame() {

        if (!gameMementoStack.isEmpty()) {
            game.restore(gameMementoStack.pop());
        }
    }
    public String getGameState() {

        return game.toString();
    }
}