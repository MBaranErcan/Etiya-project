package com.etiya.project.Mappers;

import com.etiya.project.DTOs.User;
import com.etiya.project.entities.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CustomerOrderMapper.class, GeneralTypeMapper.class, GeneralStatusMapper.class})
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "userId", target = "userId"),
            @Mapping(source = "scrName", target = "screenName"),
            @Mapping(source = "uName", target = "userName"),
            @Mapping(source = "gnlStEntity", target = "generalStatus"),
            @Mapping(source = "gnlTpEntity", target = "generalType")
    })
    User toUser(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
}