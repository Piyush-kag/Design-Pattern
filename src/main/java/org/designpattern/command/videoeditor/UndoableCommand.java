package org.designpattern.command.videoeditor;

public interface UndoableCommand extends Command{
    void unExecute();
}
