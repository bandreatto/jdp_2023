package pl.sages.jpd2.db;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class FruitRepository {

    private final EntityManager entityManager;

    public List<Fruit> findAll() {
        return entityManager.createQuery("SELECT f FROM fruit f", Fruit.class)
                .getResultList();
    }

    @Transactional()
    public Fruit createFruit(Fruit fruit) {
        entityManager.persist(fruit);
        return fruit;
    }
}
