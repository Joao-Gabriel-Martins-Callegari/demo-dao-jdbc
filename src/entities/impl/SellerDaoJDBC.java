package entities.impl;

import java.util.List;

import entities.Seller;
import interfaces.SellerDao;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void insert(Seller obj) {
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Seller obj) {       
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer id) {       
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Seller findById(Integer id) {       
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Seller> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }



}
