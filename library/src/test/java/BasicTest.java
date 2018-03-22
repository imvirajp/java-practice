import com.viraj.java.Basic;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasicTest {

    private Basic basic;

    @Before
    public void setUp() throws Exception {
        basic = new Basic();
    }

    @Test
    public void isEven() {
        assertTrue(basic.isEven(4));
    }

    @Test
    public void isOdd() {
        assertTrue(basic.isOdd(3));
    }

    @Test
    public void square() {
        assertThat(basic.square(2),is(4.0));
    }

    @Test
    public void cube() {
        assertThat(basic.cube(2),is(8.0));
    }

    @Test
    public void averageOf() {
        assertThat(basic.averageOf(1,2,3),is(2));
    }

    @Test
    public void greatestOf() {
        assertThat(basic.greatestOf(1,2,3),is(3));
    }

}
