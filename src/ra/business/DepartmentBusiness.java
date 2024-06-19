package ra.business;

import ra.entity.Department;
import ra.until.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class DepartmentBusiness {
public static  List<Department>findAll() throws SQLException {
    Connection conn = null;
    CallableStatement callSt = null;
    List<Department> listDepartment = null;
    try {
        conn = ConnectionDB.openConnection();
        callSt = conn.prepareCall("{call  get_all_department()}");
        ResultSet rs = callSt.executeQuery();
        while (rs.next()){
            Department department = new Department();
            department.setDepartment_id(rs.getString("department_id"));
            department.setDepartment_name(rs.getString("department_name"));
            department.setDescription(rs.getString("description"));
            department.setIs_deleted(rs.getInt("is_deleted"));
            listDepartment.add(department);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        ConnectionDB.closeConnection(conn, callSt);
    }
    return listDepartment;
}
}
