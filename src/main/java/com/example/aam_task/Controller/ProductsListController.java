package com.example.aam_task.Controller;

import com.example.aam_task.Model.ProductsList;
import com.example.aam_task.Service.ProductsListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductsListController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductsListController.class);

    @Autowired
    ProductsListService productsListService;

    @GetMapping("get")
    List<ProductsList> getByName(@RequestParam String name) {
        LOGGER.info("Products got by name: " + name);
        return productsListService.getByName(name);
    }

    @PostMapping("save")
    void save(@RequestBody List<ProductsList> productsList) {
        for(ProductsList p : productsList) {
            productsListService.save(p);
            LOGGER.info("Product saved: " + p);
        }
    }

    @PutMapping("update")
    void update(@RequestBody List<ProductsList> productsList) {
        for(ProductsList p : productsList) {
            productsListService.update(p);
            LOGGER.info("Products updated: " + p);
        }
    }

    @DeleteMapping("delete")
    void delete(@RequestParam Long id) {
        LOGGER.info("Products deleted: " + id);
        productsListService.delete(id);
    }

}
