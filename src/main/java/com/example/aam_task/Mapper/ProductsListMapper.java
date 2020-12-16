package com.example.aam_task.Mapper;

import com.example.aam_task.Model.ProductsList;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsListMapper {

    // здесь я использую MyBatis для операций с БД

    @Insert("insert into products(name, description) values (#{name}, #{description})")
    void save(ProductsList productsList);

    @Delete("delete from products where id = ${id}")
    void delete(Long id);

    @Update("update products set description = #{description} where id = #{id}")
    void update(ProductsList productsList);

    @Select("select * from products where name = '${name}'")
    List<ProductsList> getByName(String name);

}
