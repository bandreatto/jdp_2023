package pl.sages.logger;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//("extraHelloWorldLogger")
@Slf4j
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
@RequiredArgsConstructor
class HelloWorldLogger implements CommandLineRunner, InitializingBean, DisposableBean {

    @Value("${pl.sagesacademy.example:unknown}")
//    @Value("pl.sagesacademy.example:unknown")
    private String sagesExample;

//    private final SimpleLogger simpleConsoleLogger;
//    private final SimpleLogger simpleLogger;
    private final List<SimpleLogger> simpleLoggers;

    private final SagesConfigurationProperties sagesConfigurationProperties;

    // Demonstracja użycia Qualifier
//    HelloWorldLogger(@Qualifier("extraSimpleLombokLogger") SimpleLogger simpleLogger) {
//        this.simpleLogger = simpleLogger;
//    }

    @Override
    public void run(String... args) throws Exception {
//        log.info("Hello from run in HelloWorldLogger component!!!");
//        simpleLogger.printMessage("Hello from command line runner!");
        simpleLoggers.forEach(simpleLogger ->
                simpleLogger.printMessage("Hello from command line runner!"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("After properties set invoked...");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Destroy invoked...");
    }
}
