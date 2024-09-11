package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Student;
import view.StudentForm;
import service.ProcessStuForm;
import javax.swing.JOptionPane;
/**
 *
 * @author AguidoRin
 */
public class ControllerStuForm implements ActionListener{
    StudentForm view;
    StudentsList regs;
    public ControllerStuForm(StudentForm sf){
        view=sf;
        regs =  new StudentsList(50);
        view.btnAdd.addActionListener(this);
        view.bntSearch.addActionListener(this);
        ProcessStuForm.Start(view);
        ProcessStuForm.ShowInTable(view,regs.getLista());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.btnAdd){
            Student est = ProcessStuForm.GetReg(view);
            est.Pay();
            regs.AddReg(est);
            ProcessStuForm.CleanAll(view);
            ProcessStuForm.ShowInTable(view,regs.getLista());
        }
        if(e.getSource()== view.bntSearch){
            
            String dniSearched = JOptionPane.showInputDialog("Ingrese DNI");
            int posicion = regs.SearchByDNI(dniSearched);
            if(posicion == -1){
                JOptionPane.showMessageDialog(null, "Su DNI no existe");
            }else{
                JOptionPane.showMessageDialog(null, regs.GetReg(posicion).ShowStudent());
            }
            
        }
    }
}