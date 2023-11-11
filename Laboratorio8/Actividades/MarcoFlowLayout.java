/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoflowlayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame{
    private final JButton botonJButtonIzquierda;
    private final JButton botonJButtonCentro;
    private final JButton botonJButtonDerecha;
    private final FlowLayout esquema; // objeto esquema
    private final Container contenedor; 
    public MarcoFlowLayout()
    {
    super("Lima Sánchez José Fabrizio,Taco Chipana Eber Jardel");
    esquema = new FlowLayout();
    contenedor = getContentPane();
    setLayout(esquema);
    botonJButtonIzquierda = new JButton("Izquierda");
    add(botonJButtonIzquierda); // agrega botón Izquierda al marco
    botonJButtonIzquierda.addActionListener( 
    new ActionListener()
    { 
    @Override 
    public void actionPerformed(ActionEvent evento)
    {
    esquema.setAlignment(FlowLayout.LEFT);
    esquema.layoutContainer(contenedor);
    }
    }
    );

    botonJButtonCentro = new JButton("Centro"); 
    add(botonJButtonCentro); // agrega botón Centro al marco
    botonJButtonCentro.addActionListener(
    new ActionListener() { 
    @Override 
    public void actionPerformed(ActionEvent evento)
    {
    esquema.setAlignment(FlowLayout.CENTER);
    esquema.layoutContainer(contenedor);
    }
    }
    );
    botonJButtonDerecha = new JButton("Derecha");
    add(botonJButtonDerecha); // agrega botón Derecha al marco
    botonJButtonDerecha.addActionListener( 
    new ActionListener()
    { 
    @Override 
    public void actionPerformed(ActionEvent evento)
    {
    esquema.setAlignment(FlowLayout.RIGHT);
    esquema.layoutContainer(contenedor);
    }
    }
    );
    } 
    }
