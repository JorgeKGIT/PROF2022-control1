package profundizacion.examen1;

import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Vector;

import static org.junit.Assert.assertThrows;

public class MatriculaTest {

	
	Matricula matricula;

	@BeforeEach
	public void init(){
		System.out.println("Nuevo test");
		
	}
	
	
	@Test
    public void TestExceptionEmptyVector() throws Exception
    {
    	matricula = new Matricula(null);
    	
        assertThrows(Exception.class, () -> matricula.getImporte() );
    }
	@Test
	public void Suma_Matriculas_Correcta() throws Exception {
	
		Asignatura a1= mock(Asignatura.class);
		Asignatura a2= mock(Asignatura.class);
		
		when(a1.getImporte()).thenReturn((double) 20);
		when(a2.getImporte()).thenReturn((double) 10);
		Vector<Asignatura> vector = new Vector<Asignatura>();
		vector.add(a1);
		vector.add(a2);
		matricula= new Matricula(vector);
		assertEquals((double)30,matricula.getImporte());
	
	}
	@Test
	public void Test_Recorrer_Todas_Matriculas() throws Exception {
		
		Vector<Asignatura> vector = new Vector<Asignatura>();
		Asignatura a1= mock(Asignatura.class);
		Asignatura a2= mock(Asignatura.class);
		when(a1.getImporte()).thenReturn((double) 1);
		when(a2.getImporte()).thenReturn((double) 1);
		vector.add(a1);
		vector.add(a2);
		matricula = new Matricula(vector);
		assertEquals((double)vector.size(),matricula.getImporte());
		
	}
}
