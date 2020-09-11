package dev.danvega.mssqldemo;

import dev.danvega.mssqldemo.controller.CourseController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MssqlDemoApplicationTests {

    @Autowired
    CourseController courseController;

    @Test
    void contextLoads() {
        // sanity test
        Assertions.assertNotNull(courseController);
    }

}
