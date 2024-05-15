package org.designpattern.strategy;

public class ImageStorage {
    private Compressor compressor;
    private ImageFilter  imageFilter;

    public ImageStorage(ImageFilter imageFilter, Compressor compressor) {
        this.imageFilter = imageFilter;
        this.compressor = compressor;
    }
    public void store(String image){
       compressor.compressImage(image);
       imageFilter.applyFilter(image);
    }
}
