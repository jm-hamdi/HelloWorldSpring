package at.RefugeesCode.helloworld;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {


    @Autowired
    private HelloWorld helloWorld ;
    @org.junit.jupiter.api.Test
    void sayHelloWorld() {
        Assert.assertThat(helloWorld.sayHelloWorld(),is("Hello World"));


    }
}