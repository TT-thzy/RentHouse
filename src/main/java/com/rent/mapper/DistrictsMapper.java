package com.rent.mapper;

import com.rent.pojo.Districts;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
@Repository
public interface DistrictsMapper {

    public Districts queryDistrictsById(Integer id) throws Exception;

    public List<Districts> queryAllDistricts() throws Exception;
}
