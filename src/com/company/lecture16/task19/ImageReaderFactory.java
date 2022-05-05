package com.company.lecture16.task19;

import com.company.lecture16.task19.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType){
        ImageReader imageReader;

        if (imageType == null) throw new IllegalArgumentException("Неизвестный тип картинки");

        switch (imageType){
            case JPG:
                imageReader = new JpgReader();
                break;
            case BMP:
                imageReader = new BmpReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}
