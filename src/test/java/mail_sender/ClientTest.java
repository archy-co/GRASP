package mail_sender;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

    Client client1;
    Client client2;

    @Before
    public void setUp() {
        client1 = new Client("Robby", 15, Sex.male);
        client2 = new Client("Julia", 15, Sex.female);
    }

    @Test
    public void getSex() {
        Assert.assertEquals("M", client1.getSex().toString());
        Assert.assertEquals("F", client2.getSex().toString());
    }
}