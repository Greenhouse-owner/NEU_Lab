/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class Owner {
    // 私有属性
    private int ownerId; // 车主ID
    private String firstName; // 车主名
    private String lastName; // 车主姓
    private LocalDate serviceDate; // 服役日期
    private boolean isActive; // 车主状态

    // 1. 无参构造方法
    public Owner() {
    }

    // 2. 有参构造方法
    public Owner(int ownerId, String firstName, String lastName, LocalDate serviceDate) {
        this.ownerId = ownerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.serviceDate = serviceDate;
        this.isActive = true; // 默认状态为有效
    }

    // 3. 完整getter/setter方法
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // 4. toString()方法
    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + ownerId + ")";
    }
}
