package dds.macowins;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SacoTest {
	
	private Saco sacoNacional1;
	private Saco sacoImportado1;
	
	@Before
	public void Initialize() {
		
		Prenda.TasaImportacion = 1.3; 
		Prenda.ValorNegocio = 100;
		
		
		sacoNacional1 = new Saco(5, new Armani());
		sacoImportado1 = new Saco(5, new Sarkany());
	}
	
	@Test
	public void SacosNacionalesNoDebenTenerTasaDeImportacion() {
		
		Assert.assertEquals(965.25, sacoNacional1.precioFinal());// resultado esperado= (300+100)*1
		
	}
	
	@Test
	public void SacosImportadosDebenLlevarTasa() {
		sacoImportado1.setInternacional(true);
		Assert.assertEquals(643.5, sacoImportado1.precioFinal()); // resultado esperado= (300+100)*30%
	}
	
}
