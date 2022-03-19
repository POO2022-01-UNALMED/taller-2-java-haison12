package test;

public class Auto {
    String modelo;
    int precio;
    Array[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantindadCreados;

    int cantidadAsientos(){
        int total = 0;

        for (Asiento i; i<this.asientos.size(); i++){
            if (i != null){
                total++;
            }
        }
        return total;
    }
    String verificarInteridad(){
        for (Asiento u; u<this.asientos.size(); u++){
            if (this.registro != u.registro && this.registro != this.motor.registro){
                return "Las piezas no son originales";
            } else {
                return "Auto original";
            }
        }


    }

}
