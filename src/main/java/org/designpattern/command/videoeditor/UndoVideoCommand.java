package org.designpattern.command.videoeditor;

public class UndoVideoCommand implements Command{
    private History history;
    public UndoVideoCommand(History history) {

        this.history = history;
    }
    @Override
    public void execute() {
        if(history.size() > 0){
            history.pop().unExecute();
        }
        else{
            System.out.println("Video Cant be removed you have only 1 video on field");
        }
    }
}
