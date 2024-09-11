package controller;
import model.Student;
/**
 *
 * @author AguidoRin
 */
public class StudentsList {
    
    private Student lista[];
    private static int count=0;
    
    public StudentsList(int cant){
        lista = new Student[cant];
    }
    public void AddReg(Student est){
        lista[count]=est;
        count++;
    }
    public Student GetReg(int posicion){
        return lista[posicion];
    }
    public int SearchByDNI(String dni){
        for(int i=0;i<count;i++){
            if(dni.equals(lista[i].getDni()))
                return i; // si existe retornamos la posicion
        }
      return -1; // no existe el dni
    }

    public Student[] getLista() {
        return lista;
    }

    public void setLista(Student[] lista) {
        this.lista = lista;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StudentsList.count = count;
    }
}