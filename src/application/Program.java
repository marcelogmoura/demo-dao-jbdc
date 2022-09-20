package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();  
		
		System.out.println("= = TEST # 01: seller findById = =");
		System.out.print("Digite o id a ser pesquisado: ");
		int pesquisaId = scan.nextInt();

		Seller seller = sellerDao.findById(pesquisaId);		
		System.out.println(seller);
		
		System.out.println("\n= = TEST # 02: seller findByDepartment = =");
		System.out.print("Digite o Departamento a ser pesquisado: ");
	    int pesquisaDepartamento = scan.nextInt();
		
		Department department = new Department(pesquisaDepartamento , null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
	}
	
}
