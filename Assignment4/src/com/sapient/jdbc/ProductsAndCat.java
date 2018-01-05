package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.net.aso.e;

public class ProductsAndCat {
	private static Connection conn;
	private static Scanner scan;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // for same pc
			conn = DriverManager.getConnection(url, "system", "system");
			scan = new Scanner(System.in);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {

		String sql = null;
		PreparedStatement st = null;
		int ch = 0;
		int pid = 0;
		double price = 0.0;
		double price2 = 0.0;
		String name = null;
		String brand = null;
		ResultSet rs = null;
		do{System.out.println("Enter Choice" + "\n1.Display all the products in the ascending order of  brand "
				+ "\n2.Display all the products for the given brand"
				+ "\n3.Display all the products for the price range" + "\n4.Display all the products for the Product ID"
				+ "\n5.Display all the products whose pname starts with  ‘r’"
				+ "\n6.Display all the products whose price is greater than 10000 for the given brand"
				+ "\n7.Display  all the products for the given category name \nSelect number:");
		ch = scan.nextInt();

		System.out.println("\n______________________________________________________________________________");
		switch (ch) {
		case 1:
			sql = "select * from product order by brand";
			st = conn.prepareStatement(sql);

			break;
		case 2:
			sql = "select * from product WHERE Brand=?";
			System.out.println("Enter Brand to search:");
			brand = scan.next();
			st = conn.prepareStatement(sql);
			st.setString(1, brand);
			break;
		case 3:
			sql = "select * from product WHERE price>=? AND price<=?";
			System.out.println("Enter Price Range to search: \nPrice 1:");
			st = conn.prepareStatement(sql);

			price = scan.nextDouble();
			System.out.println("Price 2:");
			price2 = scan.nextDouble();
			if (price < price2) {
				st.setDouble(1, price);
				st.setDouble(2, price2);
			} else {
				st.setDouble(1, price2);
				st.setDouble(2, price);
			}
			break;
		case 4:
			sql = "select * from product WHERE pid=?";
			System.out.println("Enter Product ID to search:");
			pid = scan.nextInt();
			st = conn.prepareStatement(sql);
			st.setInt(1, pid);
			break;
		case 5:
			sql = "select * from product WHERE pname LIKE 'r%'";
			st = conn.prepareStatement(sql);

			break;
		case 6:
			sql = "select * from product  WHERE price>10000 and brand=?";
			System.out.println("Enter Brand to search:");
			brand = scan.next();
			st = conn.prepareStatement(sql);
			st.setString(1, brand);
			break;
		case 7:
			sql = "select * from product p INNER JOIN category c on p.cid=c.cat_id where c.cat_name=?";
			System.out.println("Enter Catagory to search:");
			brand = scan.next();
			st = conn.prepareStatement(sql);
			st.setString(1, brand);
			break;
		default:
			sql = null;
			System.out.println("Invalid Choice");
			break;

		}
		if (sql != null && st != null) {
			rs = st.executeQuery();
			System.out.printf("%10s%20s%20s%10s%20s", "PID", "PName", "PRICE", "CID", "BRAND");
			System.out.println("\n_______________________________________________________________________________");
			while (rs.next()) {
				pid = rs.getInt("pid");
				name = rs.getString("pname");
				price = rs.getDouble("price");
				int cid = rs.getInt("cid");
				brand = rs.getString("Brand");
				// System.out.println(id+" "+name+" "+sal+" "+did);
				System.out.printf("\n%10d%20s%20.2f%10d%20s", pid, name, price, cid, brand);
			}
			System.out.println("\n______________________________________________________________________________");

		}
		System.out.println("Do you want to continue? press 'y'");
		name=scan.next();
		}while(name.contentEquals("y"));

	}

}
