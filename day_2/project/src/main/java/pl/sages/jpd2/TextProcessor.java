package pl.sages.jpd2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class TextProcessor {

    @BasicCleaner
    private final List<JpdCleaner> cleaners;

    void process(String text) {
        // todo
        log.info("Text processing...");
    }
}
