/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Product {
    // 1. 私有化成员变量，提高封装性
    private String name;
    private String description;
    private String availNum; // 建议后续改为 int 类型
    private String price;    // 建议后续改为 double/BigDecimal 类型
    private Address manufactureAddress;
    private Address shippingAddress;
    
    // 2. 保留一个规范的无参构造函数，删除重复的构造函数
    public Product(){
        this.manufactureAddress = new Address();
        this.shippingAddress = new Address();
    }
    
    
 //   String manufactureStreetName;
 //   String manufactureUnitNumber;
 //   String manufactureCity;
 //   String manufactureZipCode;
 //   String shippingAddressStreetName;
 //   String shippingAddressUnitNumber;
 //   String shippingAddressCity;
 //   String shippingAddressZipCode;
   

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAvailNum(String avail) {
        this.availNum = avail;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public Address getManufactureAddress() {
        return this.manufactureAddress;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }
}