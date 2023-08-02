package model;

import java.util.ArrayList;

public class SuperVisor extends Employee{

    public SuperVisor(String fio, String position, String phoneNumber, int salary, int age) {
        super(fio, position, phoneNumber, salary, age);
    }
    public static void promotion(ArrayList<Employee> employees, int salary){
        for(Employee employee : employees){
            if(!employee.getClass().getSimpleName().equals("SuperVisor"))
                employee.setSalary(employee.getSalary() + salary);
        }
    }

}
