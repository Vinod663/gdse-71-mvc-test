/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.customerView;
import edu.ijse.mvc.view.itemView;
import java.sql.Connection;//
import java.sql.SQLException;//
import java.sql.PreparedStatement;
/**
 *
 * @author vinod
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
       new itemView().setVisible(true);
       //new customerView().setVisible(true);
    }
    
}
