import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1() {
        assertEquals(8, fib.fib(6));
    }

    @Test
    public void test2() {
        assertEquals (0,fib.fib(0));
    }

    @Test
    public void test3(){
        assertEquals(1,fib.fib(1))
    }
}



