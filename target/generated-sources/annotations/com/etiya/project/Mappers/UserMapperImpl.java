package com.etiya.project.Mappers;

import com.etiya.project.DTOs.User;
import com.etiya.project.entities.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T14:55:21+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    private final GeneralTypeMapper generalTypeMapper = GeneralTypeMapper.INSTANCE;
    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userEntity.getUserId() );
        user.setScreenName( userEntity.getScrName() );
        user.setUserName( userEntity.getuName() );
        user.setGeneralStatus( generalStatusMapper.toGeneralStatus( userEntity.getGnlStEntity() ) );
        user.setGeneralType( generalTypeMapper.toGeneralType( userEntity.getGnlTpEntity() ) );

        return user;
    }

    @Override
    public UserEntity toUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUserId( user.getUserId() );
        userEntity.setScrName( user.getScreenName() );
        userEntity.setuName( user.getUserName() );
        userEntity.setGnlStEntity( generalStatusMapper.toGnlStEntity( user.getGeneralStatus() ) );
        userEntity.setGnlTpEntity( generalTypeMapper.toGnlTpEntity( user.getGeneralType() ) );

        return userEntity;
    }
}
