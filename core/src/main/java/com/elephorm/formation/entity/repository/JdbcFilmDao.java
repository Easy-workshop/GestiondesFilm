package com.elephorm.formation.entity.repository;

import com.elephorm.formation.entity.Film;



import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;





import java.sql.SQLException;





public class JdbcFilmDao {
      
         public void save(Film film){
          Connection con =null;
      try{
      //Class.forName("com.mysql.jdbc.Drivers").newInstance();
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
      
      System.out.println("CONNEXION OK");
     
       PreparedStatement pstmt=con.prepareStatement("INSERT INTO MOVIE(TITLE,MOVIE_TYPE,COPIES) VALUES(?,?,?)");
       pstmt.setString(1,film.getTitre());
       pstmt.setString(2,film.getGenre());
       pstmt.setInt(3,film.getNbExemplaire());

      pstmt.executeUpdate();
      
      }catch(Throwable e){
    System.out.println("Connexion kooooo");   
    e.printStackTrace();
} finally{
try{
if (con!=null){
con.close();
   }
}catch (SQLException ex){

}

}
     }  
}


    
    
    

