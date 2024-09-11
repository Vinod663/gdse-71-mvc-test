/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;
    
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;


/**
 *
 * @author vinod
 */
public class CustomerController {
    private final CustomerModel customerModel=new CustomerModel();
    
    public  ArrayList<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
         ArrayList<CustomerDto> customerDtos = customerModel.getAll();
         return customerDtos;
    }
    
    public void save(CustomerDto dto) throws SQLException, ClassNotFoundException{
        customerModel.saveCustomer(dto);
    }
    
    public CustomerDto searchCustomer(String customerCode) throws SQLException, ClassNotFoundException{
        CustomerDto dto = customerModel.getCustomer(customerCode);
        return dto;
    }
    
    public String deleteCustomer(String id) throws SQLException, ClassNotFoundException{
      String result= customerModel.delete(id);
      return result;
    }
    
    public String updateCustomer(CustomerDto custDto) throws SQLException, ClassNotFoundException{
        String resp = customerModel.update(custDto);
        return resp;
    }
}
