package com.meongnyang.shop.repository.user;

import com.meongnyang.shop.entity.Pet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserPetMapper {
    Long UpdatePetByUserId(Pet Pet);
}
