package pl.sages.jpd2.db.tutorial;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
class TutorialValidator {

    void validate(Tutorial tutorial) throws InvalidTutorialException {
        if (StringUtils.isBlank(tutorial.getTitle())) {
            throw new InvalidTutorialException("Title cannot be blank!");
        }
    }
}
