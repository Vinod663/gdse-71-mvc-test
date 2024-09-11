/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vinod
 */
public class ItemController {
    
    private final ItemModel ITEM_MODEL;

    public ItemController() {
        this.ITEM_MODEL = new ItemModel();
    }
    
    public ArrayList<ItemDto> getAllItems() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> itemDtos = ITEM_MODEL.getAll();
        return itemDtos;
    }
    
    public String saveItem(ItemDto itemDto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.save(itemDto);
        return resp;
    }
    
    public String updateItem(ItemDto itemDto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.update(itemDto);
        return resp;
    }
    
    public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException{
        ItemDto dto = ITEM_MODEL.getItem(itemCode);
        return dto;
    }
    
    public String deleteItem(String itemCode) throws SQLException, ClassNotFoundException{
        String del = ITEM_MODEL.clearItem(itemCode);
        return del;
    }
    
    
    
    
    
}
