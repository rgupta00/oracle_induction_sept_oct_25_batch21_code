package com.java17;

import java.util.Objects;
//DTO: data transfer object*
//class Employee{
//    private String name;
//    private String email;
//    private double salary;
//
//    public Employee(String name, String email, double salary) {
//        this.name = name;
//        this.email = email;
//        this.salary = salary;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(email, employee.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email, salary);
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Employee{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", email='").append(email).append('\'');
//        sb.append(", salary=").append(salary);
//        sb.append('}');
//        return sb.toString();
//    }
//}
interface Payable{
    void pay();
}
class Foo{

}
record Employee(String name, String email, double salary) implements Payable{
    Employee(String name, String email) {this(name, email, 0.0);}

    Employee{
        if(name==null || email==null || salary<0){
            throw new IllegalStateException();
        }
    }

    @Override
    public void pay() {

    }
}
//record Employee(String name, String email, double salary) {
//
//    public Employee(String name,String email){
//        this(name, email, 0.0);
//    }
//    //compack ctr
//    public Employee{
//        if (name==null || email==null || salary<0){
//            throw new IllegalStateException();
//        }
//    }
//}

public class E_Records {
    public static void main(String[] args) {
//        Employee employee1=new Employee("abc", "xyz", 1000);
//        Employee employee2=new Employee("abc", "xyz", 1000);


    }
}
