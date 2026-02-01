/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import model.Owner;
import model.Service;
/**
 *
 * @author Administrator
 */
public class Vehicle {
    // 私有属性
    private String vehicleId; // 车辆ID
    private String make; // 车辆品牌
    private String model; // 车辆型号
    private int year; // 车辆年份
    private String registrationNo; // 注册号
    private Owner owner; // 关联车主
    private Service selectedService; // 关联选中的服务

    // 1. 无参构造方法
    public Vehicle() {
    }

    // 2. 有参构造方法
    public Vehicle(String vehicleId, String make, String model, int year, String registrationNo, Owner owner, Service selectedService) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.registrationNo = registrationNo;
        this.owner = owner;
        this.selectedService = selectedService;
    }

    // 3. 完整getter/setter方法
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Service getSelectedService() {
        return selectedService;
    }

    public void setSelectedService(Service selectedService) {
        this.selectedService = selectedService;
    }

    // 4. toString()方法
    @Override
    public String toString() {
        return "[" + vehicleId + "] " + make + " " + model + " (" + year + ")";
    }
}
