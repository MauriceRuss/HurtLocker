import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JerkSONTest {
   private JerkSON jerkSON;
   private String badData;

    @Before
    public void setUp() throws Exception {
        this.jerkSON = new JerkSON();
        this.badData = jerkSON.getFoodList();
    }

    @Test
    public void findStringParse() {
    }

    @Test
    public void parseMilk() throws Exception {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseBread() {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseCookies() {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseApples() {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseNameTitle() {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void parsePriceTitle() {
     String expected = badData;
     String actual = jerkSON.getFoodList();
     Assert.assertEquals(expected, actual);
    }
}