package dds.macowins;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SacoTest {
	
	private Saco sacoNacional1;
	private Saco sacoImportado1;
	
	@Before
	public void Initialize() {
		
		sacoNacional1 = new Saco();
		sacoImportado1 = new Saco();
	}
	
	@Test
	public void SacosNacionalesNoDebenTenerTasaDeImportacion() {
		
		Assert.assertEquals(400.0, sacoNacional1.PrecioFinal());// resultado esperado= (300+100)*1
		
	}
	
	@Test
	public void SacosImportadosDebenLlevarTasa() {
		sacoImportado1.setInternacional(true);
		Assert.assertEquals(520.0, sacoImportado1.PrecioFinal()); // resultado esperado= (300+100)*30%
	}
}
