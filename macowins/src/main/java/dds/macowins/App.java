package dds.macowins;

import java.util.GregorianCalendar;


public class App 
{
    public static void main( String[] args )
    {
        Macowins Mac = new Macowins();
        
        Prenda pantalon = new Pantalon();
        Venta venta1 = new Venta(new GregorianCalendar(2016, 02,02));
        venta1.Prenda = pantalon;
        venta1.Cantidad = 2;
        
        Mac.Ventas.add(venta1);
        
        double ganancia = Mac.Ganancia(new GregorianCalendar(2016,02,02));
        //System.out.printf("%n", ganancia);
        System.out.printf("%.2f %n", ganancia);
    }
}
