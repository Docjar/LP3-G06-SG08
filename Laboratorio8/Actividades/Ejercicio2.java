import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lima Sanchez Jose Fabrizio, Taco Chipana Eber Jardel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(7, 2));

        // Etiquetas
        JLabel nombreLabel = new JLabel("Nombre:");
        JLabel documentoLabel = new JLabel("Documento:");
        JLabel fechaLabel = new JLabel("Fecha de Viaje:");
        JLabel servicioOpcionalLabel = new JLabel("Servicios Opcionales:");
        JLabel pisoLabel = new JLabel("Piso:");
        JLabel origenLabel = new JLabel("Origen:");
        JLabel destinoLabel = new JLabel("Destino:");
        JLabel calidadLabel = new JLabel("Calidad del Servicio:");

        // Campos de Texto
        JTextField nombreTextField = new JTextField();
        JTextField documentoTextField = new JTextField();
        JTextField fechaTextField = new JTextField();

        // Botones de Comando
        JButton resumenButton = new JButton("Mostrar Resumen");

        // Casillas de Verificación
        JCheckBox audifonosCheckBox = new JCheckBox("Audífonos");
        JCheckBox mantaCheckBox = new JCheckBox("Manta");
        JCheckBox revistasCheckBox = new JCheckBox("Revistas");

        // Botones de Opción
        ButtonGroup pisoGroup = new ButtonGroup();
        JRadioButton primerPisoRadioButton = new JRadioButton("1er Piso");
        JRadioButton segundoPisoRadioButton = new JRadioButton("2do Piso");
        pisoGroup.add(primerPisoRadioButton);
        pisoGroup.add(segundoPisoRadioButton);

        // Cuadros Combinados
        String[] lugares = {"Lugar 1", "Lugar 2", "Lugar 3"};
        JComboBox<String> origenComboBox = new JComboBox<>(lugares);
        JComboBox<String> destinoComboBox = new JComboBox<>(lugares);

        // Lista
        String[] calidadServicio = {"Económico", "Standard", "VIP"};
        JList<String> calidadServicioList = new JList<>(calidadServicio);
        calidadServicioList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Agregar componentes a la ventana
        frame.add(nombreLabel);
        frame.add(nombreTextField);
        frame.add(documentoLabel);
        frame.add(documentoTextField);
        frame.add(fechaLabel);
        frame.add(fechaTextField);
        frame.add(servicioOpcionalLabel);
        frame.add(audifonosCheckBox);
        frame.add(new JLabel("")); // Espacio en blanco
        frame.add(mantaCheckBox);
        frame.add(revistasCheckBox);
        frame.add(pisoLabel);
        frame.add(primerPisoRadioButton);
        frame.add(new JLabel("")); // Espacio en blanco
        frame.add(segundoPisoRadioButton);
        frame.add(origenLabel);
        frame.add(origenComboBox);
        frame.add(destinoLabel);
        frame.add(destinoComboBox);
        frame.add(calidadLabel);
        frame.add(calidadServicioList);
        frame.add(resumenButton);

        resumenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String documento = documentoTextField.getText();
                String fecha = fechaTextField.getText();
                String serviciosOpcionales = "";

                if (audifonosCheckBox.isSelected()) {
                    serviciosOpcionales += "Audífonos, ";
                }
                if (mantaCheckBox.isSelected()) {
                    serviciosOpcionales += "Manta, ";
                }
                if (revistasCheckBox.isSelected()) {
                    serviciosOpcionales += "Revistas, ";
                }

                String piso = primerPisoRadioButton.isSelected() ? "1er Piso" : "2do Piso";
                String origen = (String) origenComboBox.getSelectedItem();
                String destino = (String) destinoComboBox.getSelectedItem();
                String calidad = calidadServicioList.getSelectedValue();

                String resumen = "Resumen de la Compra:\n" +
                        "Nombre: " + nombre + "\n" +
                        "Documento: " + documento + "\n" +
                        "Fecha de Viaje: " + fecha + "\n" +
                        "Servicios Opcionales: " + serviciosOpcionales + "\n" +
                        "Piso: " + piso + "\n" +
                        "Origen: " + origen + "\n" +
                        "Destino: " + destino + "\n" +
                        "Calidad del Servicio: " + calidad;

                JOptionPane.showMessageDialog(frame, resumen, "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
