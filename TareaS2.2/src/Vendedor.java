public class Vendedor {
    //Atributos publicos
    public String nombre;
    public String area;



    //Atributos private
    private double montoVenta;
    private double pcomision;
    private  int cumplimeta;
// Constructor
    public Vendedor(String nombre,String area, double montoVenta,double pcomision,int cumplimeta ){
        this.nombre=nombre;
        this.area= area;
        this.montoVenta= montoVenta;
        this.pcomision= pcomision;
        this.cumplimeta=cumplimeta;
    }
    // Metodos
    public double calcularComision(){
        return montoVenta * pcomision /100;
    }
    public double calcularIntotal(){
        return montoVenta+calcularComision();
    }
public  String estadop() {
    if (cumplimeta >=90)
        return ("Excelente");
    else if (cumplimeta >= 70)
        return ("Aceptable");
    else
        return ("Bajo");
}
//mesajes final
    public String mensajef() {
        if (estadop().equals("Excelente")) {
            return "Vendedor con desempeño sobresaliente";
        }
        if (estadop().equals("Aceptable")) {
            return "Vendedor con desempeño aceptable";
        }
        return "Se requiere seguimiento comercial";
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Comisión: " + calcularComision());
        System.out.println("Ingreso total: " + calcularIntotal());
        System.out.println("Estado: " + estadop());
        System.out.println("Mensaje: " + mensajef());
    }
}
