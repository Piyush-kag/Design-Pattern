package org.designpattern.decorator1;

public class RemoveSpaceStreamDecorator implements Stream{
    private Stream stream;

    public RemoveSpaceStreamDecorator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var removeSpaceData = removeSpacesFromData(data);
        stream.write(removeSpaceData);
    }

    public String removeSpacesFromData(String data){

        System.out.println("Removing spaces from the data");
        return data.replaceAll("\\s","");
    }
}
