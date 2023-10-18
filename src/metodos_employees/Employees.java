package metodos_employees;

public class Employees {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private double salario;

    //METODO CONSTRUCTOR
    public Employees(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    //METODOS GET Y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void describir() {
        System.out.println("El empleado con ID " + getId() + " se llama " + getNombre() + " y gana " + getSalario());
    }

}
