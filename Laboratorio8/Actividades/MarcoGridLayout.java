/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogridlayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener {
    private final JButton[] botones; // arreglo de botones
    private static final String[] nombres = { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
    private boolean alternar = true; // alterna entre dos esquemas
    private Container contenedor; // contenedor del marco
    private GridLayout cuadricula1; // primer objeto GridLayout
    private GridLayout cuadricula2;
    public MarcoGridLayout()
    {
    super("Lima Sánchez José Fabrizio,Taco Chipana Eber Jardel");
    cuadricula1 = new GridLayout(2, 3, 5, 5); // 2 por 3; espacios de 5
    cuadricula2 = new GridLayout(3, 2); // 3 por 2; sin espacios
    contenedor = getContentPane();
    setLayout(cuadricula1);
    botones = new JButton[nombres.length];
    for (int cuenta = 0; cuenta < nombres.length; cuenta++)
    {
    botones[cuenta] = new JButton(nombres[cuenta]);
    botones[cuenta].addActionListener(this);add(botones[cuenta]); // agrega boton a objeto JFrame
    }
    }
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        if (alternar) // establece esquema con base en alternar
        contenedor.setLayout(cuadricula2);
        else
        contenedor.setLayout(cuadricula1);
        alternar = !alternar;
        contenedor.validate(); // redistribuye el contenedor
    }
}
    

