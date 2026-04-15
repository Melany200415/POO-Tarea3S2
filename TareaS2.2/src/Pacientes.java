
public class Pacientes {
    // Atributo público
    public String nombre;
    // Atributos privados
    private String nidentificacion;
    private String tipSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridadMedica;

    // Constructor
    public Pacientes(String nombre, String nidentificacion, String tipSeguro,
                     int edad, double costoConsulta,
                     int numeroConsultas, int prioridadMedica) {

        this.nombre = nombre;
        setNidentificacion(nidentificacion);
        setTipSeguro(tipSeguro);
        setEdad(edad);
        setCostoConsulta(costoConsulta);
        setNumeroConsultas(numeroConsultas);
        setPrioridadMedica(prioridadMedica);
    }

    // Setters

    public void setNidentificacion(String nidentificacion) {
        // utilizo matches que es un metodo String  y \\d es un digito {10}la cantidad
        if (nidentificacion.matches("\\d{10}")) {
            this.nidentificacion = nidentificacion;
        }
    }


    public void setTipSeguro(String tipSeguro) {
        //equalsIgnoreCase comparar dos cadenas ignorando las diferencias entre mayúsculas y minúsculas.
        if (tipSeguro.equalsIgnoreCase("Basico")) {
            this.tipSeguro = tipSeguro;
        } else if (tipSeguro.equalsIgnoreCase("Premium")) {
            this.tipSeguro = tipSeguro;
        } else if (tipSeguro.equalsIgnoreCase("Sin Seguro")) {
            this.tipSeguro = tipSeguro;
        }
    }


    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        }
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        }
    }

    public void setPrioridadMedica(int prioridadMedica) {
        if (prioridadMedica >= 1 && prioridadMedica <= 5) {
            this.prioridadMedica = prioridadMedica;
        }
    }

    //Calculos
    public double calculocostoconsulta() {
        return costoConsulta * numeroConsultas;
    }

    public double descuentoseguro() {
        double total = calculocostoconsulta();
        //equalsIgnoreCase = comparar dos cadenas de texto y decirte si
        // son idénticas, sin importar si las letras están en mayúsculas o minúsculas
        if (tipSeguro.equalsIgnoreCase("Basico")) {
            return total * 0.10;
        } else if (tipSeguro.equalsIgnoreCase("Premium")) {
            return total * 0.20;
        } else {
            return 0.0;
        }
    }

    public double totalpago() {
        double total = calculocostoconsulta();
        return total - descuentoseguro();
    }

    public String clasificacion() {
        if (prioridadMedica >= 4) {
            return "Alta prioridad";
        } else if (prioridadMedica >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }
    public String mensaje() {
        //equals respetando mayúsculas y minúsculas.
        if (clasificacion().equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else if (clasificacion().equals("Prioridad media")) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }
    public void mostrarReporte() {
        System.out.println("==========PACIENTE=============");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + nidentificacion);
        System.out.println("Tipo de seguro: " + tipSeguro);
        System.out.println("Edad: " +  edad);
        System.out.println("Total consulta: " + calculocostoconsulta());
        System.out.println("Descuento: " + descuentoseguro());
        System.out.println("Total a pagar: " + totalpago());
        System.out.println("Clasificación: " + clasificacion());
        System.out.println("Mensaje: " + mensaje());
        System.out.println("=============================");
    }
}

