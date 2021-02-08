package com.swa.codebuildtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodebuildTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void myTest() {
        var something = 1;
        assertEquals(1, something);
    }
}
