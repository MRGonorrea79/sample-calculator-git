package ec.epn.edu.git.calculator;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        c = new Calculator(); // ← CORREGIDO: antes creabas la instancia pero no la guardabas
    }

    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test1");
        assertEquals(6, c.addition(3, 3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_divide_then_ok() {
        System.out.println("Test3");
        assertEquals(0,c.division(1,0),0);
    }

    @Test(timeout = 200)
    public void given_a_time_when_timeout_then_exception() {
        System.out.println("Test4");
        c.timeout(100); // Debe ejecutarse en menos de 200ms
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
}
