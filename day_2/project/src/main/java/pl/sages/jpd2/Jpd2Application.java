package pl.sages.jpd2;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import pl.sages.jpd2.db.Fruit;
import pl.sages.jpd2.db.FruitRepository;
import pl.sages.jpd2.db.tutorial.Tutorial;
import pl.sages.jpd2.db.tutorial.TutorialJpaRepository;
import pl.sages.jpd2.db.tutorial.TutorialRepository;
import pl.sages.jpd2.db.tutorial.TutorialSupplier;
import pl.sages.jpd2.event.ExtraEmailListener;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableAsync
@AllArgsConstructor
@Slf4j
public class Jpd2Application implements CommandLineRunner {

	private final TextProcessor textProcessor;
	private final FruitRepository fruitRepository;
	private final TutorialRepository tutorialRepository;
	private final TutorialSupplier tutorialSupplier;
	private final TutorialJpaRepository tutorialJpaRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jpd2Application.class, args);
		context.addApplicationListener(new ExtraEmailListener());
	}

	@Override
	public void run(String... args) throws Exception {
//		textProcessor.process("raz, dwa, trzy");

		// Analiza zachowania FruitRepository (konieczność użycia Transactional)
//		Fruit fruit = new Fruit();
//		fruit.setName("apple");
//		fruit.setWeight(2.53);
//
//		fruit = fruitRepository.createFruit(fruit);
//		log.info("Fruit created...");

		// TutorialRepository
		List<Tutorial> tutorials = tutorialSupplier.get().collect(Collectors.toList());
		tutorialRepository.saveAll(tutorials);
		log.info("Saved tutorials!");

		List<Tutorial> foundTutorials = tutorialJpaRepository.findAll();
		log.info("Found tutorials!");

		List<Tutorial> foundTutorialsByTitle = tutorialJpaRepository.findAllByTitle("Hibernate");
		log.info("Found tutorials by title!");
	}
}
