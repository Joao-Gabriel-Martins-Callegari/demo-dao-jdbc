import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import interfaces.DaoFactory;
import interfaces.SellerDao;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
