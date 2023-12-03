/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;
import java.sql.*;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.*;
public class Actividad1 {

    public static void main(String[] args) throws Exception {
        //
//          try{
//              Class.forName("com.mysql.jdbc.Driver");
//              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/actividad","root","root");
//              Statement stmt = con.createStatement();
//              ResultSet rs = stmt.executeQuery("select*from usuario");
//              while(rs.next())
//                  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//              con.close();
//            }catch(Exception e){
//                System.out.println(e);
//            }
                //RowSet
//        Class.forName("com.mysql.jdbc.Driver");
//        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
//        rowSet.setUrl("jdbc:mysql://localhost:3306/actividad");
//        rowSet.setUsername("root");
//        rowSet.setPassword("root");
//
//        rowSet.setCommand("select * from usuario");
//        rowSet.execute();
//        while(rowSet.next()){
//            System.out.println("Dni: "+rowSet.getString(1));
//            System.out.println("Nombres: "+rowSet.getString(2));
//            System.out.println("Direccion: "+rowSet.getString(3)+"\n");
//        }
            //PreparedStatement
//            try{
//                
//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/actividad","root","root");
//
//            PreparedStatement stmt=con.prepareStatement("insert into usuario(dni,nombres,direccion) values(?,?,?)");
//            stmt.setString(1,"4215378");//1 specifies the first parameter in the query
//            stmt.setString(2,"Paolo");
//            stmt.setString(3,"Castilla");
//
//
//            int i=stmt.executeUpdate();
//            System.out.println(i+" records inserted");
//
//            con.close();
//
//            }catch(Exception e)
//            { 
//                System.out.println(e);
//            } 
          //Callable procedure
//          Class.forName("com.mysql.jdbc.Driver");
//          Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/actividad","root","root");
//            CallableStatement stmt=con.prepareCall("{call proce(?,?,?)}");
//            stmt.setString(1,"34561278");
//            stmt.setString(2,"Amir");
//            stmt.setString(3,"Aplao");
//            stmt.execute();

//            System.out.println("success");
                //funcion
//                Class.forName("com.mysql.jdbc.Driver"); 
//                Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/actividad","root","root");
//                CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}"); 
//                stmt.setInt(2,10); 
//                stmt.setInt(3,43); 
//                stmt.registerOutParameter(1,Types.INTEGER); 
//                stmt.execute(); 
//
//                System.out.println("Suma: "+ stmt.getInt(1));
//
//

            //transaccion
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/actividad","root","root"); 
            con.setAutoCommit(false); 

            Statement stmt=con.createStatement(); 
            stmt.executeUpdate("insert into usuario values('78456123','abhi','Islay')"); 
            stmt.executeUpdate("insert into usuario values('15234786','Jon','Chivay')"); 

            con.commit(); 
            con.close(); 

            }
            } 
    
    

