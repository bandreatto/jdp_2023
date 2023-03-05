package pl.sages.jpd2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ConditionalOnProperty(name = "empty-div-section-cleaner.enabled", havingValue = "true")
class EmptyDivSectionCleaner implements JpdCleaner {

    @Override
    public String clean(String text) {
        log.info("In EmptyDivSectionCleaner...");
        return text;
    }
}
