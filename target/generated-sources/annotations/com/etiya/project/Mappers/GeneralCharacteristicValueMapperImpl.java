package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralCharacteristicValue;
import com.etiya.project.entities.GnlCharValEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class GeneralCharacteristicValueMapperImpl implements GeneralCharacteristicValueMapper {

    private final GeneralCharacteristicMapper generalCharacteristicMapper = GeneralCharacteristicMapper.INSTANCE;
    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;

    @Override
    public GeneralCharacteristicValue toGeneralCharacteristicValue(GnlCharValEntity gnlCharValEntity) {
        if ( gnlCharValEntity == null ) {
            return null;
        }

        GeneralCharacteristicValue generalCharacteristicValue = new GeneralCharacteristicValue();

        generalCharacteristicValue.setGeneralCharacteristicValueId( gnlCharValEntity.getGnlCharValId() );
        generalCharacteristicValue.setCharId( generalCharacteristicMapper.toGeneralCharacteristic( gnlCharValEntity.getCharId() ) );
        generalCharacteristicValue.setDefaultSelected( gnlCharValEntity.getDefaultSelected() );
        generalCharacteristicValue.setDescription( gnlCharValEntity.getDescr() );
        generalCharacteristicValue.setName( gnlCharValEntity.getName() );
        generalCharacteristicValue.setShortCode( gnlCharValEntity.getShrtCode() );
        generalCharacteristicValue.setStatusId( generalStatusMapper.toGeneralStatus( gnlCharValEntity.getStId() ) );
        generalCharacteristicValue.setValue( gnlCharValEntity.getVal() );

        return generalCharacteristicValue;
    }

    @Override
    public GnlCharValEntity toGnlCharValEntity(GeneralCharacteristicValue generalCharacteristicValue) {
        if ( generalCharacteristicValue == null ) {
            return null;
        }

        GnlCharValEntity gnlCharValEntity = new GnlCharValEntity();

        gnlCharValEntity.setGnlCharValId( generalCharacteristicValue.getGeneralCharacteristicValueId() );
        gnlCharValEntity.setCharId( generalCharacteristicMapper.toGnlCharEntity( generalCharacteristicValue.getCharId() ) );
        gnlCharValEntity.setDefaultSelected( generalCharacteristicValue.getDefaultSelected() );
        gnlCharValEntity.setDescr( generalCharacteristicValue.getDescription() );
        gnlCharValEntity.setName( generalCharacteristicValue.getName() );
        gnlCharValEntity.setShrtCode( generalCharacteristicValue.getShortCode() );
        gnlCharValEntity.setStId( generalStatusMapper.toGnlStEntity( generalCharacteristicValue.getStatusId() ) );
        gnlCharValEntity.setVal( generalCharacteristicValue.getValue() );

        return gnlCharValEntity;
    }
}
