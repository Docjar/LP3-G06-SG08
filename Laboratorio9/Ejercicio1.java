
package ejercicio1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Ejercicio1 {
        private ArrayList<Empleado > emp = new ArrayList<>();
        private JTextField numT;
        private JTextField nomT;
        private JTextField suelT;
        private DefaultTableModel tabla;
        private static final String archivo = "empleado.dat";
    public static void main(String[] args) {

          SwingUtilities.invokeLater(()-> new Ejercicio1().app());
    }

    private void app(){
        
        JFrame fr = new JFrame("Empleados");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        JPanel pan = new JPanel(new GridLayout(4,2));
        JLabel datos = new JLabel("Datos del empleado");
        numT= new JTextField(10);
        nomT = new JTextField(10);
        suelT = new JTextField(10);
        pan.add(datos);
        pan.add(new JPanel());
        pan.add(new JLabel("Numero "));
        pan.add(numT);
        pan.add(new JLabel("Nombre "));
        pan.add(nomT);
        pan.add(new JLabel("Sueldo"));
        pan.add(suelT);
        
        JButton agregarBoton = new JButton("Agregar Empleado");
        agregarBoton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent a){
            agregarEmpleado();
        }
        });
        JPanel boton = new JPanel();
        boton.add(agregarBoton);
        
        tabla = new DefaultTableModel();
        tabla.addColumn("Numero");
        tabla.addColumn("Nombre");
        tabla.addColumn("Sueldo");
        JTable t = new JTable(tabla);
        JScrollPane sp = new JScrollPane(t);
        
        main.add(pan);
        main.add(boton);
        main.add(sp);

        fr.add(main);
        fr.pack();
        fr.setVisible(true);
        cargarEmpleados();
        reporteEmpleados();
    }
    private void cargarEmpleados(){
        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(archivo))){
            emp = (ArrayList<Empleado>) oi.readObject();
            System.out.println("Empleados cargados");
        }catch(FileNotFoundException e){
            System.out.println("Se creara un archivo");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    private void guardarEmpleados(){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(archivo))){
            os.writeObject(emp);
            System.out.println("Datos guardados.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private void reporteEmpleados(){
        for(Empleado e : emp){
            Object[]fila={e.getNumero(),e.getNombre(),e.getSueldo()};
            tabla.addRow(fila);
        }
    }
    private void agregarEmpleado(){
        try{
            int n = Integer.parseInt(numT.getText());
            String no = nomT.getText();
            double s = Double.parseDouble(suelT.getText());
            Empleado em = new Empleado(n,no, s);
            emp.add(em);
            Object[] fila = {em.getNumero(),em.getNombre(),em.getSueldo()};
            tabla.addRow(fila);
            JOptionPane.showMessageDialog(null,"Empleado agregado correctamente");
            numT.setText("");
            nomT.setText("");
            suelT.setText("");
            guardarEmpleados();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese bien los datos","Error",JOptionPane.ERROR_MESSAGE);
        }
     
    }
}
