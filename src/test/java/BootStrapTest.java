import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dcruz on 9/2/14.
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
