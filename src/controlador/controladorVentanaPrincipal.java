/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.manipularEstudiantes;
/**
 *
 * @author JOCSELY
 */
public class controladorVentanaPrincipal implements ActionListener
{
    private manipularEstudiantes Manejador;

    public controladorVentanaPrincipal()
    {
        this.Manejador = new manipularEstudiantes();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
    }


    
}
