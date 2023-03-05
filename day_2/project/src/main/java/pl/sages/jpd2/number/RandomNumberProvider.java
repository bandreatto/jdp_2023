package pl.sages.jpd2.number;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
//@Scope("prototype")
@RequestScope
class RandomNumberProvider {

    private final int value = new Random().nextInt();

    int getValue() {
        return value;
    }
}
