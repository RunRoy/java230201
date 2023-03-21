package com.atguigu.homework;

/**
 * @author lystart
 * @create 2023-02-10 23:47
 */
public class EmployeeManager {

    Employee[] allEmployees = new Employee[5];
    int total = 0;

      public  boolean addEmployee(Employee emp){
          if(total >= allEmployees.length){
              System.out.println("数组已满");
              return false;
          }
          allEmployees[total++] = emp;
          return true;
      }
      //Employee[] getEmployees()：返回total个员工对象
      Employee[] getEmployees(){
          Employee[] arr = new Employee[total];
          for (int i = 0; i < allEmployees.length; i++) {
                arr[i] = allEmployees[i];
          }
          return arr;
      }
}
