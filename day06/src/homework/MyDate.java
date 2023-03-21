package homework;

import java.time.DayOfWeek;

/**
 * @author lystart
 * @create 2023-02-09 18:19
 */
public class MyDate {
    //声明一个日期类MyDate，包含属性：年、月、日
    //在测试类的main方法中，创建3个日期对象，一个是你的出生日期，一个是来尚硅谷的日期，一个是毕业的日期，并打印显示
    int year;
    int month;
    int day;


    public boolean isLeapYear(){
        System.out.println("判断是否是润年");
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
            return false;
    }

    // 根据月份值返回对应的英语单词
    public  String monthName() {
        System.out.println("根据月份值返回对应的英语单词");
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month-1];
    }

    // 返回这个月的总天数
    public int totalDaysOfMonth() {
        System.out.println("返回这个月的总天数");
    int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = isLeapYear()? 29: 28;
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
        }
        return days;

    }
        // 返回这一年的总天数
        public int totalDaysOfYear(){
            System.out.println("返回这一年的总天数");
        return isLeapYear()? 366 : 365;
        }

        // 返回这天是这一年中的第几天
    int sky = 0;
    public int daysOfTheYear(){
        System.out.print("返回这天是这一年中的第几天");
        switch (month){
            case 12:
                sky += 30;
            case 11:
                sky += 31;
            case 10:
                sky += 30;
            case 9:
                sky += 31;
            case 8:
                sky += 31;
            case 7:
                sky += 30;
            case 6:
                sky += 31;
            case 5:
                sky += 30;
            case 4:
                sky += 31;
            case 3:
               sky +=  isLeapYear() ? 29 : 28;
            case 2:
                sky += 31;
            case 1:
                sky += day;
        }
        return sky;
    }




    }
