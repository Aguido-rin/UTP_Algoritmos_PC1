package main;

import controller.ControllerStuForm;
import view.StudentForm;

/**
 *
 * @author AguidoRin
 */
public class MainClass {
    public static void main(String[] args) {
        
        StudentForm sf =new StudentForm();
        ControllerStuForm csf =  new ControllerStuForm(sf);
        
    }
}