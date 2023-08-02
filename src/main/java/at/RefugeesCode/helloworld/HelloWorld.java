package at.RefugeesCode.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Hello hello;
    private World world;


    public HelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String sayHelloWorld(){
        String sayhello = hello.sayhello();
        String sayWrld = world.sayWrld();
        String sayhelloworld = sayhello + " "+ sayWrld;

        return sayhelloworld;

    }
}
