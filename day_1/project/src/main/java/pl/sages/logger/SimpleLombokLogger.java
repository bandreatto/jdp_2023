package pl.sages.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("extraSimpleLombokLogger")
@Slf4j
@Order(20)
class SimpleLombokLogger implements SimpleLogger {

    @Override
    public void printMessage(String message) {
        log.info("Lombok: " + message);
    }
}
