
package pruebacasillaverificacion;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame{
    private JTextField campoTexto;
    private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
    private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva
    public MarcoCasillaVerificacion()
    {
        super("Lima Sánchez José Fabrizio,Taco Chipana Eber Jardel");
        setLayout(new FlowLayout());
        campoTexto = new JTextField(" Observe el cambio en el estilo del tipo de letra", 20); 
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto); // agrega campoTexto a JFrame
        negritaJCheckBox = new JCheckBox("Negrita");
        cursivaJCheckBox = new JCheckBox("Cursiva");
        add(negritaJCheckBox); // agrega casilla de verificación “negrita” a JFrame
        add(cursivaJCheckBox); // agrega casilla de verificación “cursiva” a JFrame
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }
private class ManejadorCheckBox implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent evento)
    {
    Font tipoletra = null; // almacena el nuevo objeto Font
    if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected())
    tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    else if (negritaJCheckBox.isSelected())
    tipoletra = new Font("Serif", Font.BOLD, 14);
    else if (cursivaJCheckBox.isSelected())
    tipoletra = new Font("Serif", Font.ITALIC, 14);
    else
    tipoletra = new Font("Serif", Font.PLAIN, 14);
    campoTexto.setFont(tipoletra);
    } 
    }
}