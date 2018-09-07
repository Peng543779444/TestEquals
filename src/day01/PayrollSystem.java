package day01;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee [] employees = new Employee[2];
        employees[0] = new SalariedEmployee("李磊",1000,new MyDate(2018,12,06),8000);
        employees[1] = new HourlyEmployee("韩梅梅",1002,new MyDate(2018,4,30),150,8);
        System.out.println(employees[0]);

        Scanner s = new Scanner(System.in);
        System.out.println("请输入本月月份");
        int month =s.nextInt();
        for(int i =0;i<employees.length;i++){
                if(month == employees[i].getBirthday().getMonth()){
                    System.out.println("加工资");
                }
            System.out.println(employees[i]);
        }
    }
}
