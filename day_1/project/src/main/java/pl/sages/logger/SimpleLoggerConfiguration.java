package pl.sages.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@Slf4j
class SimpleLoggerConfiguration {

    @Bean
//    @Primary
    @Order(30)
    SimpleLogger jdpLogger() {
        return new SimpleLogger() {
            @Override
            public void printMessage(String message) {
                log.info("JDP: " + message);
            }
        };

//        return (message -> {
//            log.info("JDP: " + message);
//        });
    }
}
