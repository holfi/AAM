package com.example.aam_task.Service;

import com.example.aam_task.Model.ProductsList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsListService {

        // передаем модель для сохранения в БД
        void save(ProductsList productsList);

        // удаляем по id записи
        void delete(Long id);

        // передаем модель для обновления в БД
        void update(ProductsList productsList);

        // ищем по заданному имени
        List<ProductsList> getByName(String name);

}
