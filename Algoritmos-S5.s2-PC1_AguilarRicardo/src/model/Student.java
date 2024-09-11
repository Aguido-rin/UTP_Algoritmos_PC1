package model;
/**
 *
 * @author AguidoRin
 */
public class Student {
    String dni;
    String nombres;
    String nivel;
    int edad;
    String discapacidad;
    double pago;
    
    public void Pay(){
        switch (nivel.toLowerCase()) {
            case "inicial": pago = 450;
                break;
            case "primaria": pago = 520;
                break;
            case "secundaria": pago = 610;
                break;
        }
        if ("si".equals(discapacidad.toLowerCase())) {
            pago = (pago - (pago*0.25));
        }
        
    }
    
    public Object[] SFile(int num){
        Object fila[]={num,dni,nombres,nivel,edad,discapacidad,pago};
        return fila;
    }
    
    public String ShowStudent(){
        return "\nDNI               : "+dni+
               "\nNombres           : "+nombres+
               "\nNivel Educativo   : "+nivel+
               "\nEdad              : "+edad+
               "\nDiscapacidad      : "+discapacidad+
               "\nPension           : "+pago;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
}