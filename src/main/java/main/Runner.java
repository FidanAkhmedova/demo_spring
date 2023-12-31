package main;
import greeters.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Greeter greeter;

    @Override
    public void run(String... args) throws Exception {
        greeter.greet();
    }
}
