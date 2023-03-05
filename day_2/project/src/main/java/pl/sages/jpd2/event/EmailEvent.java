package pl.sages.jpd2.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
//@AllArgsConstructor
class EmailEvent extends ApplicationEvent {

    private final String message;

    public EmailEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
