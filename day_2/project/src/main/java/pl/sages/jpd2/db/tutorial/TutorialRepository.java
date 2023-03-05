package pl.sages.jpd2.db.tutorial;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Slf4j
public class TutorialRepository {

    @Lazy
    private final TutorialRepository self;
    private final EntityManager entityManager;
    private final TutorialValidator tutorialValidator;

    public List<Tutorial> findAll() {
        return entityManager.createQuery("SELECT t FROM Tutorial t", Tutorial.class)
                .getResultList();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = InvalidTutorialException.class)
    public Tutorial save(Tutorial tutorial) throws InvalidTutorialException {
        entityManager.persist(tutorial);
        tutorialValidator.validate(tutorial);
        return tutorial;
    }

    @Transactional
    public void saveAll(List<Tutorial> tutorials) {
        tutorials.forEach(tutorial -> {
            try {
                self.save(tutorial);
            } catch (InvalidTutorialException e) {
                log.error("Invalid tutorial: ", e);
            }
        });
    }
}
