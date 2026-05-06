import edu.zut.Range;
import org.junit.*;

import static org.junit.Assert.*;

public class RangeTest {

    private Range range;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("! Rozpoczęto testy klasy RangeTest !");
    }

    @Before
    public void setUp() {
        System.out.println("Tworzenie obiektu testowego Range...");
        range = new Range(10, 20);
    }

    @After
    public void tearDown() {
        System.out.println("Zakończono test.");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("! Zakończono testy klasy RangeTest !");
    }

    @Test
    public void testNumberInsideRange() {
        System.out.println("Uruchomiono test: testNumberInsideRange");
        assertTrue(range.isInRange(15));
    }

    @Test
    public void testNumberBelowRange() {
        System.out.println("Uruchomiono test: testNumberBelowRange");
        assertFalse(range.isInRange(5));
    }

    @Test
    public void testNumberAboveRange() {
        System.out.println("Uruchomiono test: testNumberAboveRange");
        assertFalse(range.isInRange(25));
    }

    @Test
    public void testLowerBoundary() {
        System.out.println("Uruchomiono test: testLowerBoundary");
        assertTrue(range.isInRange(10));
    }

    @Test
    public void testUpperBoundary() {
        System.out.println("Uruchomiono test: testUpperBoundary");
        assertTrue(range.isInRange(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsExceptionWhenMinGreaterThanMax() {
        System.out.println("Uruchomiono test: testConstructorThrowsExceptionWhenMinGreaterThanMax");
        new Range(30, 10);
    }
}