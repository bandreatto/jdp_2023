package pl.sages.jpd2.number;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class FirstRandomNumberController {

    private RandomNumberProvider randomNumberProvider;

    @GetMapping("api/random-number/first")
    int getValue() {
        return randomNumberProvider.getValue();
    }
}
