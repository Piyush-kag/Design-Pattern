package org.designpattern.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compressImage(String image) {

        System.out.println("Compressing JPEG image...");
    }
}
