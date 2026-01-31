/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Service {
    // 私有属性
    private int serviceId; // 服务ID
    private String serviceType; // 服务类型
    private double cost; // 服务费用
    private String mechanicName; // 机械师姓名
    private short serviceHours; // 服务时长

    // 1. 无参构造方法
    public Service() {
    }

    // 2. 有参构造方法
    public Service(int serviceId, String serviceType, double cost, String mechanicName, short serviceHours) {
        this.serviceId = serviceId;
        this.serviceType = serviceType;
        this.cost = cost;
        this.mechanicName = mechanicName;
        this.serviceHours = serviceHours;
    }

    // 3. 完整getter/setter方法
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public short getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(short serviceHours) {
        this.serviceHours = serviceHours;
    }

    // 4. toString()方法
    @Override
    public String toString() {
        return serviceType + " ($" + cost + ")";
    }
}
