package com.bl.employee;

public class EmployeeWage {
    static final int FULL_TIME = 1;
    static final int WAGE_PER_HOUR = 20;
    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;

        int empCheck = (int)(Math.random() *10)%2;

        if(empCheck == FULL_TIME)
           empHour = 8;
        else
            empHour = 0;

        empWage = empHour * WAGE_PER_HOUR;
        System.out.println(empWage);
    }
}
