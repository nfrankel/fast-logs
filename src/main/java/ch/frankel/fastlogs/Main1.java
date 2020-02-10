package ch.frankel.fastlogs;

import ch.frankel.fastlogs.model.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main1.class);

    Main1(Cart cart) {
        LOGGER.debug("Cart price is now {}", cart.getPrice());
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Main1(new Cart());
        long end = System.currentTimeMillis();
        LOGGER.info("Program finished in {} ms", end - start);
    }
}
