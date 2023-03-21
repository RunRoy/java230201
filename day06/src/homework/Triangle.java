package homework;

/**
 * @author lystart
 * @create 2023-02-09 18:42
 */
public class Triangle {
    /*
    声明一个三角形类Triangle，包含属性：a,b,c，都是double类型，表示三条边，包含几个方法：
    - boolean isTriangle()：判断是否是一个三角形
    - boolean isRightTriangle()：判断是否是一个直角三角形
    - boolean isIsoscelesTriangle()：判断是否是一个等腰三角形

    - boolean isEquilateralTriangle()：判断是否是一个等边三角形
    - double area()：根据三条边，用海伦公式求面积
    - double perimeter()：求周长
在测试类的main方法中创建三角形对象，将三角形的三条边设置为3,4,5，调用方法测试。
     */
    double a;
    double b;
    double c;

    // 判断是否是一个三角形；
   public  boolean isTriangle(){
       System.out.print("判断是否是三角形：");
        if(a > 0 && b > 0 && c > 0 && a+b>c && c+b>a && a+c>b){
            return true;
        }else {
        return false;
        }
    }

    //判断是否是一个直角三角形
   public  boolean isRightTriangle(){
       System.out.print("是否是一个直角三角形：");
        if(a * a + b * b == (c * c)){
            return true;
        }else {
            return  false;
        }
    }

    //判断是否是一个等腰三角形
  public boolean isIsoscelesTriangle(){
           System.out.print("是否是一个等腰三角形：");
       if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b){
           return true;
       }else{
           return false;
       }
    }

    //判断是否是一个等边三角形
    boolean isEquilateralTriangle(){
        System.out.print("是否是一个等边三角形：" +"\t");
        if(a == b || b == c){
            return true;
        }else{
        return false;
        }
    }

    double area() {//根据三条边，用海伦公式求面积
       double p = a + b + c;
       double area = 0;
       area = Math.sqrt(p) * (p-a)*(p-b)*(p-c);
       return area;
    }

    //求周长
    double perimeter(){
       double per = a + b + c;
        return per;
    }
}
