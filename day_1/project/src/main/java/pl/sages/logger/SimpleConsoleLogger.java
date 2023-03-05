package pl.sages.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Slf4j
@Order(10)
class SimpleConsoleLogger implements SimpleLogger { // , Ordered

//    @Override
//    public int getOrder() {
//        return 0;
//    }

    @Override
    public void printMessage(String message) {
        log.info(message);
    }
}
