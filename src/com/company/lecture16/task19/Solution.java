package com.company.lecture16.task19;

import com.company.lecture16.task19.common.ImageReader;
import com.company.lecture16.task19.common.ImageTypes;

/*
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}

