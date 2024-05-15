package org.designpattern.command.videoeditor;

public class AddContrastOnVideo implements UndoableCommand{
    private VideoEditor editor;
    private History history;
    public AddContrastOnVideo(VideoEditor editor, History history) {

        this.editor = editor;
        this.history = history;
    }
    @Override
    public void execute() {
        editor.addContrast(editor.getVideo());
        history.push(this);
    }
    @Override
    public void unExecute() {

    }
}
