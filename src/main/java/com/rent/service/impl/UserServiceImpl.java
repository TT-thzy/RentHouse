package com.rent.service.impl;

import com.rent.dto.HouseInfoDto;
import com.rent.enumerate.AssertNullType;
import com.rent.mapper.UserMapper;
import com.rent.pojo.HouseInfo;
import com.rent.pojo.User;
import com.rent.service.UserService;
import com.rent.utils.AssertNullOfTypeUtil;
import com.rent.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:10
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public User login(HashMap<String, String> map) throws Exception {
        if (map == null) {
            return null;
        }
        User user = userMapper.queryByNameAndPassword(map);
        if (user == null) {
            return null;
        }
        return user;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveUser(User user) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, user)) {
            int i = userMapper.saveUser(user);
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public boolean queryUserByUsername(String name) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, name)) {
            User user = userMapper.queryUserByUsername(name);
            if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, user)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<HouseInfoDto> queryHouseInfoByUid(String uid) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, uid)) {
            User user = userMapper.queryHouseInfoByUid(uid);
            List<HouseInfo> houseInfos = user.getHouseInfos();
            ArrayList<HouseInfoDto> houseInfoDto = new ArrayList<>();
            for (HouseInfo houseInfo : houseInfos) {
                HouseInfoDto infoDto = new HouseInfoDto(houseInfo.getFwid(), houseInfo.getTitle(), houseInfo.getZj(), DateUtil.dateToString(houseInfo.getDate()));
                houseInfoDto.add(infoDto);
            }
            return houseInfoDto;
        }
        return null;
    }
}
