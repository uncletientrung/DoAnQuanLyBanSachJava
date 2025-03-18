/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error.GUI.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.View.Taikhoan;
/**
 *
 * @author DELL
 */
public class TaiKhoanController implements  ActionListener{
    private Taikhoan tkview;
    public TaiKhoanController(Taikhoan tkview){
        this.tkview=tkview;
    }
    public void actionPerformed(ActionEvent e){
        String sukien=e.getActionCommand();
        if(sukien.equals("Submit")){
            
        }
    }
}
