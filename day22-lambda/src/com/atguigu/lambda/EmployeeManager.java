package com.atguigu.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 包名:com.atguigu.lambda
 *
 * @author Leevi
 * 日期2023-03-03  10:07
 */
public class EmployeeManager {
    private List<Employee> allEmployees = new ArrayList<>();

    public EmployeeManager() {
        allEmployees.add(new Employee(1, "张三", '男', 33, 8000));
        allEmployees.add(new Employee(2, "翠花", '女', 23, 18000));
        allEmployees.add(new Employee(3, "无能", '男', 46, 8000));
        allEmployees.add(new Employee(4, "李四", '女', 23, 9000));
        allEmployees.add(new Employee(5, "老王", '男', 23, 15000));
        allEmployees.add(new Employee(6, "大嘴", '男', 23, 11000));
    }

    /**
     * 根据条件获取员工列表
     * @param predicate
     * @return
     */
    public List<Employee> get(Predicate<Employee> predicate){
        List<Employee> employeeList = new ArrayList<>();
        //遍历所有员工
        for (Employee employee : allEmployees) {
            //将符合条件的员工放到employeeList
            if (predicate.test(employee)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    /**
     * 添加员工
     * @param supplier
     */
    public void add(Supplier<Employee> supplier){
        allEmployees.add(supplier.get());
    }
}
