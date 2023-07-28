package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.entities.GnlStEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T15:51:05+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class GeneralStatusMapperImpl implements GeneralStatusMapper {

    @Override
    public GeneralStatus toGeneralStatus(GnlStEntity gnlStEntity) {
        if ( gnlStEntity == null ) {
            return null;
        }

        GeneralStatus generalStatus = new GeneralStatus();

        generalStatus.setGeneralStatusId( gnlStEntity.getGnlStId() );
        generalStatus.setName( gnlStEntity.getName() );
        generalStatus.setDescription( gnlStEntity.getDescr() );
        generalStatus.setEntityCodeName( gnlStEntity.getEntCodeName() );
        generalStatus.setActive( gnlStEntity.getActv() );
        generalStatus.setShortCode( gnlStEntity.getShrtCode() );

        return generalStatus;
    }

    @Override
    public GnlStEntity toGnlStEntity(GeneralStatus generalStatus) {
        if ( generalStatus == null ) {
            return null;
        }

        GnlStEntity gnlStEntity = new GnlStEntity();

        gnlStEntity.setGnlStId( generalStatus.getGeneralStatusId() );
        gnlStEntity.setName( generalStatus.getName() );
        gnlStEntity.setDescr( generalStatus.getDescription() );
        gnlStEntity.setEntCodeName( generalStatus.getEntityCodeName() );
        gnlStEntity.setActv( generalStatus.isActive() );
        gnlStEntity.setShrtCode( generalStatus.getShortCode() );

        return gnlStEntity;
    }
}
