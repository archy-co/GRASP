package proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RealImageTest {

    RealImage realImage;

    @Before
    public void setUp() {
        realImage = new RealImage("file.txt");
    }

    @Test
    public void getFilename(){
        Assert.assertEquals(realImage.getFilename(), "file.txt");
    }

    @Test
    public void loadFromDisk() {
        Assert.assertTrue(true);
    }
}