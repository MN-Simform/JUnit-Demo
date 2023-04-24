import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    void Test(){
        assertEquals(15, main.sumArr(new int[]{1,2,3,4,5}));
    }

    @Test
    void Test1(){
        int res = main.sumArr(new int[]{});
        int expectedRes = 0;
        assertEquals(expectedRes, res);
    }

    @Test
    void Test2(){
        int res = main.sumArr(new int[]{1,2,3,4,5,6,7,8,9,10});
        int expectedRes = 55;
        assertEquals(expectedRes, res);
    }
}