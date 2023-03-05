package pl.sages.jdp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class ClassWithDependency {

    private final Dependency dependency;
}
