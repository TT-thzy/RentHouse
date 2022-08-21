package com.rent.mapper;

import com.rent.pojo.Street;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
@Repository
public interface StreetMapper {

    public Street queryStreetById(Integer id) throws Exception;

    //根据区县id查询所属的街道并按升序排序
    public List<Street> queryStreetByQxid(Integer id) throws Exception;
}
