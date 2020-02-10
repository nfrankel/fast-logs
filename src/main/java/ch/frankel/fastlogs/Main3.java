package ch.frankel.fastlogs;

import ch.frankel.fastlogs.model.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class Main3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main3.class);
    private static final LazyLogger LAZY = new LazyLogger(LOGGER);

    Main3(Cart cart) {
        LAZY.debug("Cart price is now {}", cart::getPrice);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Main3(new Cart());
        long end = System.currentTimeMillis();
        LOGGER.info("Program finished in {} ms", end - start);
    }
}

class LazyLogger {

    private final Logger logger;

    LazyLogger(Logger logger) {
        this.logger = logger;
    }

    void debug(String format, Supplier<Object> supplier) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, supplier.get());
        }
    }
}
