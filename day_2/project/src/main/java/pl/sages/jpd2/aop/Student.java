package pl.sages.jpd2.aop;

import lombok.*;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
class Student {

    private final String firstName;
    private final String lastName;
}
