package pl.sages.jpd2.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
public class ExtraEmailListener implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent event) {
        log.info("In extraEmailListener...");
    }
}
