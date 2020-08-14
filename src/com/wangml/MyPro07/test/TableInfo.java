package com.wangml.MyPro07.test;


public class TableInfo {
    public static void main(String[] args) {
        Emp emp0 = new Emp(1, "百战牌鼠标","BZ_001",99.2, 0.9);
        Emp emp1 = new Emp(2, "键盘侠玩偶", "WO_102", 403.00, 0.7);
        Emp emp2 = new Emp(3, "实战java程序设计", "BK_001", 89.00, 0.8);
        Emp emp3 = new Emp(4,"高琪牌西装", "GQ_XF_12", 700.00, 0.5);
        Emp emp4 = new Emp(5, "大米牌手机", "DM_PH_13", 900.00, 0.3);

        Emp[] emp = {emp0, emp1, emp2, emp3, emp4};


        for (int i=0; i<emp.length; i++) {
                System.out.println(emp[i]);
        }
    }
}

class Emp {
    private int id;
    private String name;
    private String type;
    private double price;
    private double discount;

    public Emp(int id, String name, String type, double price, double discount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getType() + "\t" + getPrice() + "\t" + getDiscount();
    }
}