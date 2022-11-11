package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println("===TEST 2: findAll ===");
		List<Department> list = departmentDao.findAll(); 
		for(Department d : list) {
			System.out.println(d);
		}
	}

}
