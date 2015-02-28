import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple unit test that serves a placeholder and sample.
 */
public class BootStrapTest {
    private BootStrap bootStrap;

    @Before
    public void setUp() throws Exception {
        bootStrap = new BootStrap("test");
    }

    @Test
    public void bootStrapPass() throws Exception {

        assertEquals("test", bootStrap.getName());

    }
}
