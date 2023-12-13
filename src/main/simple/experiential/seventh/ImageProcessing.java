package org.experiential.seventh;
//7. Design a class named ImageProcessor with methods for processing
//images. Implement methods for resizing, rotating, and converting images
//to different formats. Use multithreading to process multiple images
//concurrently.
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageProcessing {



        public void resizeImage(String imagePath, int newWidth, int newHeight) {
            // Implementation for resizing image
            System.out.println("Resizing image: " + imagePath + " to " + newWidth + "x" + newHeight);
            // Your logic for resizing goes here
        }

        public void rotateImage(String imagePath, int degrees) {
            // Implementation for rotating image
            System.out.println("Rotating image: " + imagePath + " by " + degrees + " degrees");
            // Your logic for rotating goes here
        }

        public void convertToFormat(String imagePath, String newFormat) {
            // Implementation for converting image to a different format
            System.out.println("Converting image: " + imagePath + " to format: " + newFormat);
            // Your logic for conversion goes here
        }

        public void processImagesConcurrently(List<String> imagePaths) {
            ExecutorService executorService = Executors.newFixedThreadPool(imagePaths.size());

            for (String imagePath : imagePaths) {
                executorService.submit(() -> {
                    // Perform image processing tasks concurrently
                    resizeImage(imagePath, 800, 600);
                    rotateImage(imagePath, 90);
                    convertToFormat(imagePath, "PNG");
                });
            }

            executorService.shutdown();
        }




}
