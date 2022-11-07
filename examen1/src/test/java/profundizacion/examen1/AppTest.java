package profundizacion.examen1;


import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.jupiter.api.BeforeEach;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	Matricula matricula;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	@BeforeEach
	public void init(){
		matricula = new Matricula(null);
	}
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws Exception
    {
    	assertEquals(0,0);
    }
}
