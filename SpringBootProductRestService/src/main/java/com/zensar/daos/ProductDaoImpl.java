package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;
/*
Author: Trigun Rai
Creation Date: 26th Jul 2019 10:00AM
Modification Date: 31st Jul 2019 10:43AM
Version:2.0
Copyright:Zensar Technnologies. All rights reserved
Description: Represents data access object class.
which implements dao interface,
it contains CRUD Operation methods implementation for an entity
*/
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}

	

}
