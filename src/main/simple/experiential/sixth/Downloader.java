package org.experiential.sixth;
//6. Create a class named Downloader with a method for downloading files
//from a URL. Use multithreading to download multiple files simultaneously.

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

class Downloader extends Thread {
    private String url;
    private String destination;

    public Downloader(String url, String destination) {
        this.url = url;
        this.destination = destination;
    }

    @Override
    public void run() {
        try {
            System.out.println("Downloading from " + url);
            try (InputStream in = new URL(url).openStream();
                 FileOutputStream out = new FileOutputStream(destination)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                System.out.println("Download complete for " + url);
            }
        } catch (Exception e) {
            System.err.println("Error downloading from " + url + ": " + e.getMessage());
        }
    }
}





