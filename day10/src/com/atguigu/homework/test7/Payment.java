package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-14 18:17
 */
public enum Payment implements Payable{
    Altray("支付宝"),
    WECHST("微信"),
    CREDITCSRD("信用卡"),
    DEPODITCARD("储蓄卡");

    private final String description;

//  private Payment(){
//
//  }

   private Payment(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public void pay() {
        switch (description){
            case "支付宝" :
            case  "微信" :
                System.out.println(description + ":扫码支付");
                break;
            case "信用卡":
            case "储蓄卡":
                System.out.println(description + ":输入卡号支付");
                break;
        }
    }
}
