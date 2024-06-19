package ra.entity;

import java.util.Scanner;

public class Department implements IEmployeeManagement {
    String department_id;
    String department_name;
    String description;
    int is_deleted;

    public Department() {
    }

    public Department(String department_id, String department_name, String description, int is_deleted) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.description = description;
        this.is_deleted = is_deleted;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("nhap department ID : ");
        this.department_id =scanner.nextLine();
        System.out.println("nhap department Name : ");
        this.department_name = scanner.nextLine();
        System.out.println("nhap description : ");
        this.description = scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Department ID: "+ this.department_id);
        System.out.println("Department Name: " + this.department_name);
        System.out.println("Description: "+this.description);
        System.out.println("Is Deleted: "+this.is_deleted);
    }
}
