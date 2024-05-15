package org.designpattern.command.videoeditor;

public class AddVideoOnField implements UndoableCommand{
    private String prevVideo;
    private VideoEditor videoEditor;
    private History history;
    public AddVideoOnField(VideoEditor videoEditor, History history) {

        this.videoEditor = videoEditor;
        this.history = history;
    }
    @Override
    public void unExecute() {

    }
    @Override
    public void execute() {
        prevVideo = videoEditor.getVideo();
        videoEditor.setVideo(prevVideo);
        history.push(this);
    }
}
