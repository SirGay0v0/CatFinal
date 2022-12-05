package com.example.CatFinal;

import dto.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CatTest {

    @Test
    void catTest(){
        Cat cat = new Cat(1L, "Klown");
        Assertions.assertEquals(1L, cat.getId());

        Assertions.assertEquals("Klown", cat.getName());
    }
}
