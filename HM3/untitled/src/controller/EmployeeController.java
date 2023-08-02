package controller;

import model.EmployeeList;
import model.SuperVisor;
import model.Employee;

public class EmployeeController {
    private EmployeeList list;
    public EmployeeController(){
        //1
        list = new EmployeeList();
        addList();
        list.promotion(45, 5000);
        Employee.promotion(list.getList(), 35, 1500);
        list.averageAge(list.getList());
        list.averageSalary(list.getList());
        //2
        list.addEmployee(new SuperVisor("Белоусова Айлин Александровна", "Руководитель", "+185-14-81532", 60000, 35));
        SuperVisor.promotion(list.getList(), 5000);
        list.print();
    }
    private void addList(){
        list.addEmployee(new Employee("Куликов Валентин Игоревич", "Слесарь", "+904-35-96803", 35000, 28));
        list.addEmployee(new Employee("Федосеев Владлен Тарасович", "Уборщик", "294-50-41768", 40000, 47));
        list.addEmployee(new Employee("Чернов Матвей Протасьевич", "Старший слесарь", "+341-59-08598", 20000, 46));
        list.addEmployee(new Employee("Сидоров Владимир Ильяович", "Разнорабочий", "+310-37-93095", 25000, 22));
        list.addEmployee(new Employee("Семёнова Эля Витальевна", "Бухгалтер", "+639-67-06300", 30000, 35));
    }
}
