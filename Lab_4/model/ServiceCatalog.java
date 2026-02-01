/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Service目录管理类 - 单例模式
 * @author Administrator
 */
public class ServiceCatalog {
    // 单例实例
    private static ServiceCatalog instance;
    
    // 服务列表
    private List<Service> services;
    
    // 私有构造方法
    private ServiceCatalog() {
        services = new ArrayList<>();
    }
    
    // 获取单例实例
    public static ServiceCatalog getInstance() {
        if (instance == null) {
            instance = new ServiceCatalog();
        }
        return instance;
    }
    
    // 添加服务
    public void addService(Service service) {
        services.add(service);
    }
    
    // 获取所有服务
    public List<Service> getAllServices() {
        return new ArrayList<>(services);
    }
    
    // 根据ID查找服务
    public Service findServiceById(int serviceId) {
        for (Service service : services) {
            if (service.getServiceId() == serviceId) {
                return service;
            }
        }
        return null;
    }
    
    // 删除服务
    public boolean removeService(int serviceId) {
        Service service = findServiceById(serviceId);
        if (service != null) {
            return services.remove(service);
        }
        return false;
    }
}