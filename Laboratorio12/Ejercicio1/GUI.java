/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ee1;
import java.sql.ResultSetMetaData;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GUI extends JFrame{
    private JTable tabla;
    private JButton botonQuery;
    private JButton botonAplicar;
    private JTextField ingreso;
    private JTextField filtro;
    private JLabel f;
    
    public GUI() throws Exception{
        super("Displaying Query Results");
        setLayout(new GridBagLayout());

        GridBagConstraints gb = new GridBagConstraints();
        ingreso = new JTextField(30);
        gb.gridx = 0;
        gb.gridy = 0;
        gb.gridwidth = 2;
        gb.fill = GridBagConstraints.HORIZONTAL;
        add(ingreso,gb);
        
        botonQuery = new JButton("Submit Query");
        botonQuery.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String texto = ingreso.getText();
                if(texto == null || texto.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese una Query");

                }else{

                    query();
                }
        }
        });
        gb.gridx = 2;
        gb.gridy =0;
        gb.gridwidth =1;
        gb.fill = GridBagConstraints.NONE;
        add(botonQuery,gb);
        infoBd();
        JLabel filtroLabel = new JLabel("Filtro");
        gb.gridx = 0; // Columna 0
        gb.gridy = 3; // Fila 3
        gb.gridwidth = 1; // Ocupa 1 columna
        gb.fill = GridBagConstraints.HORIZONTAL;
        add(filtroLabel, gb);

        filtro = new JTextField(30);
        gb.gridx = 1;
        gb.gridy = 3;
        gb.gridwidth = 1;
        gb.fill = GridBagConstraints.HORIZONTAL;
        add(filtro,gb);
        
        botonAplicar = new JButton("Aplicar Filtro");
        botonAplicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String texto = filtro.getText();
                if(texto == null || texto.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ingrese un filtro");

                }else{
                    JOptionPane.showMessageDialog(null, "Filtro aplicado");

                }
        }
        });
        gb.gridx = 2;
        gb.gridy = 3;
        gb.gridwidth = 1;
        gb.fill = GridBagConstraints.HORIZONTAL;
        add(botonAplicar,gb);
}
    public void infoBd() throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejercicio","root","root");
            PreparedStatement  pst = con.prepareStatement("select * from persona");
            ResultSet rs = pst.executeQuery()){
                
            ResultSetMetaData rm = rs.getMetaData();
            String[] columna = new String[rm.getColumnCount()];
            for(int i =0;i<columna.length;i++){
                columna[i] = rm.getColumnName(i+1);
            }
            DefaultTableModel tablaM =new DefaultTableModel(columna,0){
                @Override
                public boolean isCellEditable(int fila,int columna){
                    return false;
                }
            };
            while(rs.next()){
                Object[]fila = new Object[tablaM.getColumnCount()];
                for(int i =0;i<fila.length;i++){
                    fila[i] = rs.getObject(i+1);
                }
                tablaM.addRow(fila);
            }
            tabla = new JTable(tablaM);
                JScrollPane scrollPane = new JScrollPane(tabla);

        
                GridBagConstraints gb = new GridBagConstraints();
                gb.gridx = 0;
                gb.gridy = 2; 
                gb.gridwidth = 3; 
                gb.fill = GridBagConstraints.BOTH; 
                add(scrollPane, gb);

                
                revalidate();
                repaint();
    }
    }
    public void query(){
        try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejercicio","root","root")){
            String query = ingreso.getText();
            String fil = filtro.getText();
            query += " " + fil; 
            try(PreparedStatement pst = con.prepareStatement(query))
            {
                if (query.startsWith("select") || query.startsWith("SELECT")) {
                // Si la consulta es SELECT, actualiza el modelo de la tabla
                ResultSet rs = pst.executeQuery();
                updateTableModel(rs);
                
            } else {
                int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                PreparedStatement selectStatement = con.prepareStatement("SELECT * FROM persona");
                ResultSet rs = selectStatement.executeQuery();
                updateTableModel(rs);
            }
            }
            }catch(SQLException e){  
                JOptionPane.showMessageDialog(this, "Ingrese una consulta SQL");
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al interactuar con la base de datos.");
        }

    }
    private void updateTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData rm = rs.getMetaData();
        String[] columnNames = new String[rm.getColumnCount()];
        for (int i = 0; i < columnNames.length; i++) {
            columnNames[i] = rm.getColumnName(i + 1);
        }

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        while (rs.next()) {
            Object[] row = new Object[columnNames.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getObject(i + 1);
            }
            tableModel.addRow(row);
        }

        tabla.setModel(tableModel);
        revalidate();
        repaint();
    }


}