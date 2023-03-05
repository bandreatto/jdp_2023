package pl.sages.jpd2.aop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class StudentController {

    private StudentService studentService;

    @GetMapping("api/student/add/{firstName}/{lastName}")
    void addStudent(@PathVariable String firstName, @PathVariable String lastName) {
        studentService.addStudent(firstName, lastName);
    }
}
