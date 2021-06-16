package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.mapper.ProductRowMapper;
import com.wit.user.manager.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Transactional
@Repository
public class UserDAOImpl extends CapitalDaoSupport implements UserDAO {

    public UserDAOImpl(DataSource datasource) {
        super(datasource);
    }


    @Override
    public List<Product> getAllProducts() throws ApiException {
        return queryForList(UserDaoConstants.FETCH_PRODUCTS_QUERY, new ProductRowMapper());

    }
}
