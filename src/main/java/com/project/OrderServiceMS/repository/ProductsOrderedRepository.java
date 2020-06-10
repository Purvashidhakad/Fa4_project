package com.project.OrderServiceMS.repository;



import org.springframework.data.repository.CrudRepository;

import com.project.OrderServiceMS.entity.ProductsOrderedEntity;

public interface ProductsOrderedRepository  extends CrudRepository<ProductsOrderedEntity, Integer>{

}
