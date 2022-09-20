package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();  
		
		System.out.println("= = TEST # 01: seller findById = =");
		System.out.print("Digite o id a ser pesquisado: ");
		int pesquisa = scan.nextInt();

		Seller seller = sellerDao.findById(pesquisa);
		
		System.out.println(seller);

	}
	
}
