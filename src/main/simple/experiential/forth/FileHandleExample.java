package org.experiential.forth;
//4. Define an interface named FileHandler with abstract methods for reading
//and writing files. Implement the interface for different types of files, such
//as TextFile and ImageFile.
import java.io.IOException;

// Define the FileHandler interface
interface FileHandler {
    String readFile(String fileName) throws IOException;
    void writeFile(String fileName, String content) throws IOException;
}

// Implement the FileHandler interface for TextFile
class TextFile implements FileHandler {
    @Override
    public String readFile(String fileName) throws IOException {
        // Implement logic to read text file
        // Example: Use FileReader, BufferedReader, etc.
        return "Content read from text file: " + fileName;
    }

    @Override
    public void writeFile(String fileName, String content) throws IOException {
        // Implement logic to write to a text file
        // Example: Use FileWriter, BufferedWriter, etc.
        System.out.println("Content written to text file: " + fileName + "\n" + content);
    }
}

// Implement the FileHandler interface for ImageFile
class ImageFile implements FileHandler {
    @Override
    public String readFile(String fileName) throws IOException {
        // Implement logic to read image file
        // Example: Use FileInputStream, BufferedImage, etc.
        return "Content read from image file: " + fileName;
    }

    @Override
    public void writeFile(String fileName, String content) throws IOException {
        // Implement logic to write to an image file
        // Example: Use ImageIO, FileOutputStream, etc.
        System.out.println("Content written to image file: " + fileName + "\n" + content);
    }
}

public class FileHandleExample {
    public static void main(String[] args) {
        // Example usage
        FileHandler textFileHandler = new TextFile();
        try {
            String textContent = textFileHandler.readFile("example.txt");
            System.out.println(textContent);

            textFileHandler.writeFile("newTextFile.txt", "New text content");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileHandler imageFileHandler = new ImageFile();
        try {
            String imageContent = imageFileHandler.readFile("example.jpg");
            System.out.println(imageContent);

            imageFileHandler.writeFile("newImageFile.jpg", "New image content");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

