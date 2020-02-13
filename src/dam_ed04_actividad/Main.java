/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

package dam_ed04_actividad;

public class Main {
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        // Variable en la que almacenamos la opción
        int accion;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        // Acción retirar
        operativa_cuenta(cuenta1, 2300, 0);
        // Acción ingresar
        operativa_cuenta(cuenta1, 695, 1);
    }
    
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad, int accion) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        if (accion == 0){
            try {
                cuenta1.retirar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        } else if (accion == 1){
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
