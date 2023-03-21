package homework;

/**
 * @author lystart
 * @create 2023-02-09 18:03
 */
public class homework1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 001;
        emp1.name = "Tom";
        emp1.age = 18;
        emp1.salary = 8000;
        System.out.println("员工1的信息:");
        System.out.println("工号：" + emp1.id);
        System.out.println("姓名：" + emp1.name);
        System.out.println("年龄：" + emp1.age);
        System.out.println("薪资：" + emp1.salary);

        Employee emp2 = new Employee();
        emp2.id = 002;
        emp2.name = "Jerry";
        emp2.age = 19;
        emp2.salary = 7999.99;
        System.out.println("员工2的信息:");
        System.out.println("工号：" + emp2.id);
        System.out.println("姓名：" + emp2.name);
        System.out.println("年龄：" + emp2.age);
        System.out.println("薪资：" + emp2.salary);


        MyDate birthday = new MyDate();
        birthday.year = 2002;
        birthday.month = 10;
        birthday.day = 10;
        System.out.println("出生日期：" + birthday.year + "/" + birthday.day);

        MyDate cultivate = new MyDate();
        cultivate.year = 2023;
        cultivate.month = 2;
        cultivate.day = 1;
        System.out.println("来尚硅谷的日期" + cultivate.year + "/" + cultivate.month + cultivate.day);

        MyDate thesis = new MyDate();
        thesis.year = 2023;
        thesis.month = 1;
        thesis.day = 1;
        System.out.println("毕业时间是" + thesis.year + "/" + thesis.month + thesis.day);

        Triangle triangle = new Triangle();
        triangle.a = 9;
        triangle.b = 3;
        triangle.c = 3;
        System.out.println(triangle.isTriangle());
        System.out.println(triangle.isRightTriangle());
        System.out.println(triangle.isIsoscelesTriangle());
        System.out.println(triangle.isEquilateralTriangle());

        System.out.println(thesis.isLeapYear());
        System.out.println(thesis.monthName());
        System.out.println(thesis.totalDaysOfMonth());
        System.out.println(thesis.totalDaysOfYear());
        System.out.println(thesis.daysOfTheYear());

    }
}
