package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;
/*
Author: Trigun Rai
Creation Date: 26th Jul 2019 10:00AM
Modification Date: 30th Jul 2019 15:13AM
Version:1.0
Copyright:Zensar Technnologies. All rights reserved
Description: Represents data access object Interface.
It represents Business layer,
it contains CRUD Operation methods for entity product
*/
public interface ProductDao {

void insert(Product product);
void update(Product product);
void delete(Product product);
Product getById(int productId);
List<Product> getAll();
}
