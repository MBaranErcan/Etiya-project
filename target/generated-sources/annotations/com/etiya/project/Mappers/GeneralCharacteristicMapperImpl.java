package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralCharacteristic;
import com.etiya.project.DTOs.GeneralCharacteristicValue;
import com.etiya.project.DTOs.ProductOfferCharacteristicValue;
import com.etiya.project.entities.GnlCharEntity;
import com.etiya.project.entities.GnlCharValEntity;
import com.etiya.project.entities.ProdOfrCharValEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class GeneralCharacteristicMapperImpl implements GeneralCharacteristicMapper {

    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;
    private final GeneralCharacteristicValueMapper generalCharacteristicValueMapper = GeneralCharacteristicValueMapper.INSTANCE;

    @Override
    public GeneralCharacteristic toGeneralCharacteristic(GnlCharEntity gnlCharEntity) {
        if ( gnlCharEntity == null ) {
            return null;
        }

        GeneralCharacteristic generalCharacteristic = new GeneralCharacteristic();

        generalCharacteristic.setGeneralCharacteristicId( gnlCharEntity.getGnlCharId() );
        generalCharacteristic.setGeneralCharacteristicValue( gnlCharValEntityListToGeneralCharacteristicValueList( gnlCharEntity.getGnlCharValEntity() ) );
        generalCharacteristic.setProductOfferCharacteristicValues( prodOfrCharValEntityListToProductOfferCharacteristicValueList( gnlCharEntity.getProdOfrCharValEntities() ) );
        generalCharacteristic.setDescription( gnlCharEntity.getDescr() );
        generalCharacteristic.setName( gnlCharEntity.getName() );
        generalCharacteristic.setShortCode( gnlCharEntity.getShrtCode() );
        generalCharacteristic.setStatusId( generalStatusMapper.toGeneralStatus( gnlCharEntity.getStId() ) );

        return generalCharacteristic;
    }

    @Override
    public GnlCharEntity toGnlCharEntity(GeneralCharacteristic generalCharacteristic) {
        if ( generalCharacteristic == null ) {
            return null;
        }

        GnlCharEntity gnlCharEntity = new GnlCharEntity();

        gnlCharEntity.setGnlCharId( generalCharacteristic.getGeneralCharacteristicId() );
        gnlCharEntity.setGnlCharValEntity( generalCharacteristicValueListToGnlCharValEntityList( generalCharacteristic.getGeneralCharacteristicValue() ) );
        gnlCharEntity.setProdOfrCharValEntities( productOfferCharacteristicValueListToProdOfrCharValEntityList( generalCharacteristic.getProductOfferCharacteristicValues() ) );
        gnlCharEntity.setDescr( generalCharacteristic.getDescription() );
        gnlCharEntity.setName( generalCharacteristic.getName() );
        gnlCharEntity.setShrtCode( generalCharacteristic.getShortCode() );
        gnlCharEntity.setStId( generalStatusMapper.toGnlStEntity( generalCharacteristic.getStatusId() ) );

        return gnlCharEntity;
    }

    protected List<GeneralCharacteristicValue> gnlCharValEntityListToGeneralCharacteristicValueList(List<GnlCharValEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<GeneralCharacteristicValue> list1 = new ArrayList<GeneralCharacteristicValue>( list.size() );
        for ( GnlCharValEntity gnlCharValEntity : list ) {
            list1.add( generalCharacteristicValueMapper.toGeneralCharacteristicValue( gnlCharValEntity ) );
        }

        return list1;
    }

    protected ProductOfferCharacteristicValue prodOfrCharValEntityToProductOfferCharacteristicValue(ProdOfrCharValEntity prodOfrCharValEntity) {
        if ( prodOfrCharValEntity == null ) {
            return null;
        }

        ProductOfferCharacteristicValue productOfferCharacteristicValue = new ProductOfferCharacteristicValue();

        productOfferCharacteristicValue.setName( prodOfrCharValEntity.getName() );

        return productOfferCharacteristicValue;
    }

    protected List<ProductOfferCharacteristicValue> prodOfrCharValEntityListToProductOfferCharacteristicValueList(List<ProdOfrCharValEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductOfferCharacteristicValue> list1 = new ArrayList<ProductOfferCharacteristicValue>( list.size() );
        for ( ProdOfrCharValEntity prodOfrCharValEntity : list ) {
            list1.add( prodOfrCharValEntityToProductOfferCharacteristicValue( prodOfrCharValEntity ) );
        }

        return list1;
    }

    protected List<GnlCharValEntity> generalCharacteristicValueListToGnlCharValEntityList(List<GeneralCharacteristicValue> list) {
        if ( list == null ) {
            return null;
        }

        List<GnlCharValEntity> list1 = new ArrayList<GnlCharValEntity>( list.size() );
        for ( GeneralCharacteristicValue generalCharacteristicValue : list ) {
            list1.add( generalCharacteristicValueMapper.toGnlCharValEntity( generalCharacteristicValue ) );
        }

        return list1;
    }

    protected ProdOfrCharValEntity productOfferCharacteristicValueToProdOfrCharValEntity(ProductOfferCharacteristicValue productOfferCharacteristicValue) {
        if ( productOfferCharacteristicValue == null ) {
            return null;
        }

        ProdOfrCharValEntity prodOfrCharValEntity = new ProdOfrCharValEntity();

        prodOfrCharValEntity.setName( productOfferCharacteristicValue.getName() );

        return prodOfrCharValEntity;
    }

    protected List<ProdOfrCharValEntity> productOfferCharacteristicValueListToProdOfrCharValEntityList(List<ProductOfferCharacteristicValue> list) {
        if ( list == null ) {
            return null;
        }

        List<ProdOfrCharValEntity> list1 = new ArrayList<ProdOfrCharValEntity>( list.size() );
        for ( ProductOfferCharacteristicValue productOfferCharacteristicValue : list ) {
            list1.add( productOfferCharacteristicValueToProdOfrCharValEntity( productOfferCharacteristicValue ) );
        }

        return list1;
    }
}
