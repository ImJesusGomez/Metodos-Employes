package metodos_employees;

import java.io.*;

public class Metodos_Employees {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        imprimirArrEmp(almacenarEmployee(crearEmployee(), crearEmployee(), crearEmployee()));

    }

    public static Employees crearEmployee() throws IOException {
        System.out.println("DATOS DEL EMPLEADO");

        System.out.println("ID> ");
        int id = Integer.parseInt(teclado.readLine());

        System.out.println("Nombre> ");
        String nombre = teclado.readLine();

        System.out.println("Salario");
        double salario = Double.parseDouble(teclado.readLine());

        Employees x = new Employees(id, nombre, salario);

        return x;
    }

    public static Employees[] almacenarEmployee(Employees e1, Employees e2, Employees e3) {
        Employees[] arregloEmpleados = {e1, e2, e3};
        return arregloEmpleados;
    }
    
    public static void imprimirArrEmp(Employees[] lista){
        
        for(Employees e : lista){
            e.describir();
        }
        
    }

}
