import java.util.Date;

import entities.Department;
import entities.Seller;
import interfaces.DaoFactory;
import interfaces.SellerDao;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
