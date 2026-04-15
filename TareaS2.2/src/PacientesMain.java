
public class PacientesMain {
    public static void main(String[] args){
        // Crear objeto con los datos de prueba
        Pacientes p = new Pacientes("Carlos Pérez", "0102030405", "Premium",
                45, 25.50, 3, 4
        );
        Pacientes p1 = new Pacientes("Melany Perugachi","173091436","Basico",21,8.50,2,2);
        // Mostrar resultados
        p.mostrarReporte();
        p1.mostrarReporte();
    }
}
