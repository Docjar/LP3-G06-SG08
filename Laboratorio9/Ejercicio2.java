/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio2().gui());    
    }
    private void gui(){
        JFrame fr = new JFrame("WordCount");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new BorderLayout());
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        p.add(sp,BorderLayout.CENTER);

        fr.add(p);
        fr.setSize(300,200);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        updateTa("ejemplo.txt",ta);
    }
    private void updateTa(String archivo,JTextArea ta){
        try(BufferedReader r = new BufferedReader(new FileReader(archivo))){
            StringBuilder c = new StringBuilder();
            int lin = 0;
            int w = 0;
            int ca= 0;
            String l;
            while((l = r.readLine())!=null){
                lin++;
                w+= conteo(l);
                ca += l.length();
            }
            c.append("Archivo: ").append(archivo).append("\n");
            c.append("Lineas = ").append(lin).append("\n");
            c.append("Letras = ").append(w).append("\n");
            c.append("Caracteres = ").append(ca).append("\n");
            
            ta.setText(c.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private int conteo(String l){
        String[] w = l.split("\\s+");
        int cont = 0;
        for(String word : w){
            if(word.chars().allMatch(Character::isLetterOrDigit)){
                cont++;
            }
        }return cont;
    }
}
