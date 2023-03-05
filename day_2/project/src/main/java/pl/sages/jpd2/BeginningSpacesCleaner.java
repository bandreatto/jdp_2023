package pl.sages.jpd2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@BasicCleaner
@Slf4j
class BeginningSpacesCleaner implements JpdCleaner {

    @Override
    public String clean(String text) {
        log.info("In BeginningSpacesCleaner...");
        return text;
    }
}
