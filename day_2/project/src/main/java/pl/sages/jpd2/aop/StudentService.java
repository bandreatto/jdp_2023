package pl.sages.jpd2.aop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Slf4j
class StudentService {

    @Lazy
    private final StudentService studentService;

    Student addStudent(String firstName, String lastName) {
        if (firstName != null && firstName.length() < 3) {
            throw new RuntimeException("'firstName' must contain at least 3 characters!");
        }

        Student student = Student.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
        this.assignToClass(student);

        return student;
    }

    void deleteAll() {
        log.info("All records have been deleted!");
    }

    void assignToClass(Student student) {
        log.info("Student assigned to class...");
    }
}
