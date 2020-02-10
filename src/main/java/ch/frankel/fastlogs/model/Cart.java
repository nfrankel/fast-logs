package ch.frankel.fastlogs.model;

public class Cart {
    public double getPrice() {
        try {
            // Simulate a long computation
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 200.0;
    }
}
