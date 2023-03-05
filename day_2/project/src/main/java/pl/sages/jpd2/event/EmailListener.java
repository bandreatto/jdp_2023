package pl.sages.jpd2.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
class EmailListener {

    @EventListener
    @Async
    void listenToEmailEvent(EmailEvent event) {
        log.info("Received e-mail event with message: {}", event.getMessage());
    }

    @EventListener(String.class)
    @Async
    void listenToMessageEvent() {
        log.info("Received message event");
    }
}
