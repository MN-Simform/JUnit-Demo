import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationsJ {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @Test
    void Test1(){
        System.out.println("Test1");
    }

    @Test
    void Test2(){
        System.out.println("Test2");
    }

    @Test
    void Test3(){
        System.out.println("Test3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }
}