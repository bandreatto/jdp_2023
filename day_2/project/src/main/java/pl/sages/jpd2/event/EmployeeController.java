package pl.sages.jpd2.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Slf4j
class EmployeeController {

    private final EmailPublisher emailPublisher;

    @GetMapping("notify/event/{message}")
    void publishEvents(@PathVariable String message) {
        emailPublisher.publishEmailEvent(new EmailEvent(this, message));
        log.info("Published e-mail event...");
        emailPublisher.publishMessageEvent(message);
        log.info("Published message event...");
    }
}
