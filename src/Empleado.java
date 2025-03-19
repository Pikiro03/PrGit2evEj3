public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    void incrementarEdad(){
        this.edad += 1;
    void incrementarSueldo(int porcentajeIncremento){
        this.sueldo += sueldo * (1+porcentajeIncremento/100.0);
    }
}
