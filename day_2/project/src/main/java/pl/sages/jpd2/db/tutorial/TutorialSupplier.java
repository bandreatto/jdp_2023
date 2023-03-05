package pl.sages.jpd2.db.tutorial;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class TutorialSupplier {

    public Stream<Tutorial> get() {
        return Stream.of(
                new Tutorial("Spring Data", "Tut#1 Description", false),
                new Tutorial("Java Spring", "Tut#2 Description", false),
                new Tutorial("Hibernate", "Tut#3 Description", false),
                new Tutorial("Spring Boot", "Tut#4 Description", false),
                new Tutorial("Spring Data JPA", "Tut#5 Description", false),
                new Tutorial("   ", "Tut#6 Description", false), // todo JPA EntityManager
                new Tutorial("Spring Security", "Tut#7 Description", false)
        );
    }
}
