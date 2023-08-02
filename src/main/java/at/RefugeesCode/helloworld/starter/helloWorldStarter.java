package at.RefugeesCode.helloworld.starter;

import at.RefugeesCode.helloworld.HelloWorld;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloWorldStarter {

    @Bean
    public ApplicationRunner stratmyhelloworld(HelloWorld helloWorld){

        return args -> {
            System.out.println(helloWorld.sayHelloWorld());
        };
    }

}
