/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.Statement;
import java.sql.SQLException;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vinod
 */
public class CustomerModel {
    public ArrayList<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection();
        
        String query="SELECT * FROM customer";
        Statement stm=connection.createStatement();
        ResultSet result=stm.executeQuery(query);
        
        ArrayList<CustomerDto> dtos=new ArrayList();
        
        while(result.next()){
            CustomerDto dto=new CustomerDto();
            
            dto.setCustID(result.getString("CustId"));
            dto.setCustTitle(result.getString("CustTitle"));
            dto.setCustName(result.getString("CustName"));
            dto.setDOB(result.getString("DOB"));
            dto.setSalary(result.getDouble("salary"));
            dto.setCustAddress(result.getString("CustAddress"));
            dto.setCity(result.getString("City"));
            dto.setProvince(result.getString("Province"));
            dto.setPostalCode(result.getInt("PostalCode"));
            
            dtos.add(dto);
        }
        
        return dtos;
    }
    
    public void saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException{
       Connection connection=DBConnection.getInstance().getConnection();

       String sqlQuery="INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
     
       PreparedStatement pstm=connection.prepareStatement(sqlQuery);
       pstm.setString(1, dto.getCustID());
       pstm.setString(2, dto.getCustTitle());
       pstm.setString(3, dto.getCustName());
       pstm.setString(4, dto.getDOB());
       pstm.setDouble(5, dto.getSalary());
       pstm.setString(6, dto.getCustAddress());
       pstm.setString(7, dto.getCity());
       pstm.setString(8, dto.getProvince());
       pstm.setInt(9, dto.getPostalCode());
       
       
       int rows =pstm.executeUpdate();
        
        if(rows>0){
           // System.out.println("Item saved sucsussfully.....");
            JOptionPane.showMessageDialog(null, "Customer Saved Sucsusfully");
        }
        else{
           //System.out.println("Item Not saved.....");
           JOptionPane.showMessageDialog(null, "Error!Customer not Saved!");
        
        }
       
    }
    
    public CustomerDto getCustomer(String custId) throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            CustomerDto dto = new CustomerDto();
            dto.setCustID(rst.getString("CustId"));
            dto.setCustTitle(rst.getString("CustTitle"));
            dto.setCustName(rst.getString("CustName"));
            dto.setDOB(rst.getString("DOB"));
            dto.setSalary(rst.getDouble("salary"));
            dto.setCustAddress(rst.getString("CustAddress"));
            dto.setCity(rst.getString("City"));
            dto.setProvince(rst.getString("Province"));
            dto.setPostalCode(rst.getInt("PostalCode"));
            
            return dto;
        }
        return null;
    }
    
    public String delete(String id) throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection(); 
        String sql = "DELETE FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0 ? "Success" : "Fail";
    }
    
    public String update(CustomerDto dto) throws SQLException, ClassNotFoundException{

       Connection connection = DBConnection.getInstance().getConnection();
       String sql = "UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getCustTitle());
        statement.setString(2, dto.getCustName());
        statement.setString(3, dto.getDOB());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getCustAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getProvince());
        statement.setInt(8, dto.getPostalCode());
        statement.setString(9, dto.getCustID());

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";
    }
}
