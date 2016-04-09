package dds.macowins;


public class Sarkany implements Marca {
	
	public double coeficiente(double precio){
		if (precio>500)
			return 1.35;
		else
			return 1.10;
	}

}
