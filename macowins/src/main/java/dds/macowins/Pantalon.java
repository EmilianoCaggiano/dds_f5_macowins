package dds.macowins;

public class Pantalon extends Prenda {
	protected double PrecioBase;

	public Pantalon(double cmDeTela) {
		PrecioBase = 250+ cmDeTela;
	}

	
	@Override
	protected double PrecioBase() {
		// TODO Auto-generated method stub
		return PrecioBase;
	}

}
