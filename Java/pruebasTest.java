

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebasTest
{
    /**
     * Default constructor for test class pruebasTest
     */
    public pruebasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void prueba1()
    {
        int variable1=4;
        int operacion=4+2;
        int resultadoesperado=6;
        
        assertEquals(operacion, resultadoesperado);
    }
    
     @Test
    public void prueba2()
    {
        int variable1=3;
        int operacion=3-4;
        int resultadoesperado=-1;
        
        assertEquals(operacion, resultadoesperado);
    }
    
      
     @Test
    public void prueba3()
    {
        int variable1=7;
        int operacion=7+1;
        int resultadoesperado=8;
        
        assertEquals(operacion, resultadoesperado);
    }
}
