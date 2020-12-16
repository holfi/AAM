package com.example.aam_task.Service;

import com.example.aam_task.Mapper.ProductsListMapper;
import com.example.aam_task.Model.ProductsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsListServiceImpl implements ProductsListService {

    @Autowired
    ProductsListMapper productsListMapper;

    @Override
    public void save(ProductsList productsList) {
        productsListMapper.save(productsList);
    }

    @Override
    public void delete(Long id) {
        productsListMapper.delete(id);
    }

    @Override
    public void update(ProductsList productsList) {
        productsListMapper.update(productsList);
    }

    @Override
    public List<ProductsList> getByName(String name) {
        return productsListMapper.getByName(name);
    }
}
