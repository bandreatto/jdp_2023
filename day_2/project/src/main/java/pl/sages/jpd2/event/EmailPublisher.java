package pl.sages.jpd2.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class EmailPublisher {

    private final ApplicationEventPublisher eventPublisher;

    void publishEmailEvent(EmailEvent event) {
        eventPublisher.publishEvent(event);
    }

    void publishMessageEvent(String message) {
        eventPublisher.publishEvent(message);
    }
}
