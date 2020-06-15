package life.eclosia.starter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import static org.junit.Assert.assertTrue;

/**
 * Test de la class Main
 */
public class MainTest {

    /**
     * Bean a tester
     */
    @Spy
    private Main bean;

    /**
     * Set Up for Test
     */
    @Before
    public void setUp() {
        //Setup des mock
    }

    /**
     * Test que les test sont fonctionelle
     */
    @Test
    public void test() {
        assertTrue(true);
    }
}
