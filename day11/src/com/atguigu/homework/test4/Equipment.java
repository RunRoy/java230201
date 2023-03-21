package com.atguigu.homework.test4;

/**
 * @author lystart
 * @create 2023-02-15 20:17
 */
public class Equipment {

    private int id;// 编号
    private String brand;// 品牌
    private double price;// 价格
    private String name;// 名称
    private Status state;// 状态

    public Equipment() {
    }

    public Equipment(int id, String brand, double price, String name, Status state) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", state=" + state +
                "}\n";
    }
}
