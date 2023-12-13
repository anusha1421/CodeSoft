package org.experiential.ninth;
import java.util.Random;

class Racer implements Runnable {
    private String name;
    private int totalLaps;

    public Racer(String name, int totalLaps) {
        this.name = name;
        this.totalLaps = totalLaps;
    }

    @Override
    public void run() {
        for (int lap = 1; lap <= totalLaps; lap++) {
            System.out.println(name + " is starting lap " + lap);
            simulateRace();
            System.out.println(name + " completed lap " + lap);

            // Check car wheels after each lap
            checkCarWheels();
        }

        System.out.println(name + " finished the race!");
    }

    private void simulateRace() {
        // Simulate the time it takes to complete a lap
        try {
            Thread.sleep(new Random().nextInt(1000)); // Simulating race time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkCarWheels() {
        System.out.println(name + "'s car is checking the wheels...");
        try {
            Thread.sleep(500); // Simulating time to check the wheels
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "'s car wheels are okay!");
    }
}

public class Formula1Race {
    public static void main(String[] args) {
        int totalLaps = 5;

        Thread racer1 = new Thread(new Racer("Racer 1", totalLaps));
        Thread racer2 = new Thread(new Racer("Racer 2", totalLaps));
        Thread racer3 = new Thread(new Racer("Racer 3", totalLaps));

        // Start the racers
        racer1.start();
        racer2.start();
        racer3.start();

        try {
            // Wait for all racers to finish
            racer1.join();
            racer2.join();
            racer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Race is over!");
    }
}


