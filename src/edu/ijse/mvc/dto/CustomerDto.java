/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author vinod
 */
public class CustomerDto {
   private String CustID;
   private String CustTitle;
   private String CustName;
   private String DOB;
   private double salary;
   private String CustAddress;
   private String City;
   private String Province;
   private int PostalCode;

    public CustomerDto() {
    }

    public CustomerDto(String CustID, String CustTitle, String CustName, String DOB, double salary, String CustAddress, String City, String Province, int PostalCode) {
        this.CustID = CustID;
        this.CustTitle = CustTitle;
        this.CustName = CustName;
        this.DOB = DOB;
        this.salary = salary;
        this.CustAddress = CustAddress;
        this.City = City;
        this.Province = Province;
        this.PostalCode = PostalCode;
    }

    
    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the CustTitle
     */
    public String getCustTitle() {
        return CustTitle;
    }

    /**
     * @param CustTitle the CustTitle to set
     */
    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    /**
     * @return the CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * @param CustName the CustName to set
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the CustAddress
     */
    public String getCustAddress() {
        return CustAddress;
    }

    /**
     * @param CustAddress the CustAddress to set
     */
    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the Province
     */
    public String getProvince() {
        return Province;
    }

    /**
     * @param Province the Province to set
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * @return the PostalCode
     */
    public int getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "CustID=" + CustID + ", CustTitle=" + CustTitle + ", CustName=" + CustName + ", DOB=" + DOB + ", salary=" + salary + ", CustAddress=" + CustAddress + ", City=" + City + ", Province=" + Province + ", PostalCode=" + PostalCode + '}';
    }

    
    
    
    
}
