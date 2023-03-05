package pl.sages.jpd2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@BasicCleaner
@Slf4j
class DuplicatedTagCleaner implements JpdCleaner {

    @Override
    public String clean(String text) {
        log.info("In DuplicatedTagCleaner...");
        return text;
    }
}
