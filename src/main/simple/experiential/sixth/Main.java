package org.experiential.sixth;

public class Main {
    public  static  void main(String[] args){

        Downloader downloader1 = new Downloader("https://example.com/file1.txt", "file1.txt");
        Downloader downloader2 = new Downloader("https://example.com/file2.txt", "file2.txt");

        // Start the threads
        downloader1.start();
        downloader2.start();


        try {
            // Wait for both threads to finish
            downloader1.join();
            downloader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads completed.");
    }


    }

