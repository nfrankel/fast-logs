package ch.frankel.fastlogs;

import ch.frankel.fastlogs.model.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main4 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main4.class);

    Main4(Cart cart) {
        LOGGER.debug("Cart price is now 200");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Main4(new Cart());
        long end = System.currentTimeMillis();
        LOGGER.info("Program finished in {} ms", end - start);
    }
}
