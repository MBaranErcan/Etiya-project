package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralType;
import com.etiya.project.entities.GnlTpEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T15:51:05+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class GeneralTypeMapperImpl implements GeneralTypeMapper {

    @Override
    public GeneralType toGeneralType(GnlTpEntity gnlTpEntity) {
        if ( gnlTpEntity == null ) {
            return null;
        }

        GeneralType generalType = new GeneralType();

        generalType.setGeneralTypeId( gnlTpEntity.getGnlTpId() );
        generalType.setName( gnlTpEntity.getName() );
        generalType.setDescription( gnlTpEntity.getDescr() );
        generalType.setShortCode( gnlTpEntity.getShrtCode() );
        generalType.setEntityCodeName( gnlTpEntity.getEntCodeName() );
        generalType.setIsActive( gnlTpEntity.getActv() );

        return generalType;
    }

    @Override
    public GnlTpEntity toGnlTpEntity(GeneralType generalType) {
        if ( generalType == null ) {
            return null;
        }

        GnlTpEntity gnlTpEntity = new GnlTpEntity();

        gnlTpEntity.setGnlTpId( generalType.getGeneralTypeId() );
        gnlTpEntity.setName( generalType.getName() );
        gnlTpEntity.setDescr( generalType.getDescription() );
        gnlTpEntity.setShrtCode( generalType.getShortCode() );
        gnlTpEntity.setEntCodeName( generalType.getEntityCodeName() );
        gnlTpEntity.setActv( generalType.getIsActive() );

        return gnlTpEntity;
    }
}
