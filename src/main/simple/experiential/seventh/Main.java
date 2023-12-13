package org.experiential.seventh;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            // Example usage
            List<String> imagePaths = new ArrayList<>();
            imagePaths.add("/path/to/image1.jpg");
            imagePaths.add("/path/to/image2.png");
            imagePaths.add("/path/to/image3.jpeg");

            ImageProcessing imageProcessor = new ImageProcessing();
            imageProcessor.processImagesConcurrently(imagePaths);
        }
    }


