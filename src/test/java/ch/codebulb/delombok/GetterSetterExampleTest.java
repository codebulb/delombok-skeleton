package ch.codebulb.delombok;

import org.junit.Test;
import static org.junit.Assert.*;

public class GetterSetterExampleTest {
    private static final GetterSetterExample example = new GetterSetterExample();
    
    @Test
    public void test() {
        assertEquals(10, example.getAge());
        assertEquals(Client.class, example.client.getClass());
        assertEquals(10, Client.getAge());
    }
}
