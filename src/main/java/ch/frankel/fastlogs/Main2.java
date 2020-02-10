package ch.frankel.fastlogs;

import ch.frankel.fastlogs.model.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main2.class);

    Main2(Cart cart) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Cart price is now {}", cart.getPrice());
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Main2(new Cart());
        long end = System.currentTimeMillis();
        LOGGER.info("Program finished in {} ms", end - start);
    }
}
