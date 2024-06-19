package ra.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Employee implements IEmployeeManagement{
    int employee_id;
    String first_name;
    String last_name;
    Date date_of_birth;
    String phone;
    String address;
    double salary;
    Date create_at;
    Date update_at;
    boolean is_deleted;
    String department_id;

    public Employee() {
    }

    public Employee(int employee_id, String first_name, String last_name, Date date_of_birth, String phone, String address, double salary, Date create_at, Date update_at, boolean is_deleted, String department_id) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.create_at = create_at;
        this.update_at = update_at;
        this.is_deleted = is_deleted;
        this.department_id = department_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Enter First Name: ");
        this.first_name = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        this.last_name = scanner.nextLine();
        System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
        this.date_of_birth = java.sql.Date.valueOf(scanner.nextLine());
        System.out.println("Enter Phone: ");
        this.phone = scanner.nextLine();
        System.out.println("Enter Address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter Salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("First Name: " + this.first_name);
        System.out.println("Last Name: " + this.last_name);
        System.out.println("Date of Birth: " + this.date_of_birth);
        System.out.println("Phone: " + this.phone);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.salary);
        System.out.println("Created At: " + this.create_at);
        System.out.println("Updated At: " + this.update_at);
        System.out.println("Is Deleted: " + this.is_deleted);
        System.out.println("Department ID: " + this.department_id);
    }
}
