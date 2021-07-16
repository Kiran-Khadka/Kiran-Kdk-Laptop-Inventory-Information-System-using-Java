/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopInventoryInformationSystem;

/**
 *
 * @author Acer
 */
public class Laptop {
    
    private int laptopID;
    private String manufacturer;
    private String modelName;
    private String modelNumber;
    private String type;
    private String cpu;
    private String gpu;
    private String display;
    private String memory;
    private String storageType;
    private String storageSize;
    private double price;
    private String priceRange;
    private int rating;
   
    

    /* constructor passing all the declared variables as parameters*/
    public Laptop(int laptopID, String manufacturer, String modelName, String modelNumber, String type, String cpu, String gpu, String display, String memory, String storageType, String storageSize, double price, String priceRange, int rating) {

        this.laptopID = laptopID;  
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.type = type;
        this.cpu = cpu;
        this.gpu = gpu;
        this.display = display;
        this.memory = memory;
        this.storageType = storageType;
        this.storageSize = storageSize;
        this.price = price;
        this.priceRange = priceRange;
        this.rating = rating;

    }
    /* getter mthod for all variables*/
    public int getLaptopId() {
        return this.laptopID;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getModelNumber() {
        return this.modelNumber;
    }

    public String getType() {
        return this.type;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public String getDisplay() {
        return this.display;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public String getStorageSize() {
        return this.storageSize;
    }

    public double getPrice() {
        return this.price;
    }

    public String getPriceRange() {
        return this.priceRange;
    }

    public int getRating() {
        return this.rating;
    }
    
   
}
