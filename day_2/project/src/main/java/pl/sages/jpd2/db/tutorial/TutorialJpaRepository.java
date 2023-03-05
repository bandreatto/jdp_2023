package pl.sages.jpd2.db.tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialJpaRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findAllByTitle(String title);
}
