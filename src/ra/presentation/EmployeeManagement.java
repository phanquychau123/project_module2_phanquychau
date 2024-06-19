package ra.presentation;

import ra.business.DepartmentBusiness;
import ra.entity.Department;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("*************EMPLOYEE-MANAGEMENT**************");
            System.out.println("1:quan li phong ban");
            System.out.println("2:quan li nhan vien");
            System.out.println("3:thoat");
            System.out.println("nhap lua chon cua ban");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    departmentMenu(scanner);
                    break;
                case 2:
                    employeeMenu(scanner);
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("nhap lua chon tu 1-3");
            }
        }
        scanner.close();
    }
    public static void departmentMenu(Scanner scanner) throws SQLException {
       boolean run = true;
       while (run){
           System.out.println("***************DEPARTMENT-MENU******************");
           System.out.println("1:danh sach phong ban");
           System.out.println("2:tao moi phong ban");
           System.out.println("3:cap nhat phong ban");
           System.out.println("4:xoa phong ban");
           System.out.println("5:thong ke so luong nhan vien theo ma phong ban");
           System.out.println("6:thoat");
           System.out.print("lua chon cua ban");
           int choice= Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                EmployeeManagement.displayListDepartment();
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   run=false;
                   break;
               default:
                   System.out.println("chon tu 1-6");
           }
       }
    }
public static void employeeMenu(Scanner scanner){
        boolean run = true;
        while (run){
            System.out.println("*************EMPLOYEE-MENU******************");
            System.out.println("1:danh sach nhan vien");
            System.out.println("2:tao moi nhan vien");
            System.out.println("3:cap nhap nhan vien");
            System.out.println("4:xoa nhan vien");
            System.out.println("5:hien thi danh sach nhan vien theo tuoi giam dan");
            System.out.println("6:tim kiem nhan vien theo ho hoac ten");
            System.out.println("7:thong ke so luong nhan vien theo do tuoi");
            System.out.println("8:thoat");
            System.out.print("lua chon cua ban");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    run = false;
                    break;
                default:
                    System.out.println("chon tu 1-8");

            }
        }
}
public static void displayListDepartment() throws SQLException {
    List<Department>  listDepartment = DepartmentBusiness.findAll();
    listDepartment.stream().forEach(System.out::println);

}
}
