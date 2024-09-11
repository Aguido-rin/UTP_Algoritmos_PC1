package service;
/**
 *
 * @author AguidoRin
 */
import controller.StudentsList;
import javax.swing.table.DefaultTableModel;
import view.StudentForm;
import model.Student;

public class ProcessStuForm {
    public static void CleanAll(StudentForm sf){
        sf.txtDni.setText("");
        sf.txtName.setText("");
        sf.cbxLevel.setSelectedIndex(0);
        sf.spnAge.setValue(0);
        sf.cbxDisc.setSelectedIndex(0);
        sf.txtDni.requestFocus();
    }
    public static Student GetReg(StudentForm f1){
        Student est=new Student();
        est.setDni(f1.txtDni.getText());
        est.setNombres(f1.txtName.getText());
        est.setNivel(f1.cbxLevel.getSelectedItem().toString());
        est.setEdad(Integer.parseInt(f1.spnAge.getValue().toString()));
        est.setDiscapacidad(f1.cbxDisc.getSelectedItem().toString());
        return est;
    }
    public static void Start(StudentForm f1){
        f1.setTitle("Registro de llamadas de clientes");
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
    }
    public static void ShowInTable(StudentForm f1,Student Lista[]){
        String titulos[]={"Nro","Dni","Nombres","Nivel Educativo","Edad","Discapacidad","Pension"};
        DefaultTableModel mt =  new DefaultTableModel(null,titulos);
        f1.tblStudents.setModel(mt);
        for(int i=0; i<StudentsList.getCount();i++){
            mt.addRow(Lista[i].SFile(i+1));
        }
    }
}