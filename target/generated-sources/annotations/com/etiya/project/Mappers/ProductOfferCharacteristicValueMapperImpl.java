package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.DTOs.ProductOfferCharacteristicValue;
import com.etiya.project.entities.GnlStEntity;
import com.etiya.project.entities.ProdOfrCharValEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class ProductOfferCharacteristicValueMapperImpl implements ProductOfferCharacteristicValueMapper {

    private final ProductOfferMapper productOfferMapper = ProductOfferMapper.INSTANCE;
    private final GeneralCharacteristicMapper generalCharacteristicMapper = GeneralCharacteristicMapper.INSTANCE;

    @Override
    public ProductOfferCharacteristicValue toProductOfferCharacteristicValue(ProdOfrCharValEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ProductOfferCharacteristicValue productOfferCharacteristicValue = new ProductOfferCharacteristicValue();

        productOfferCharacteristicValue.setProductOfferCharacteristicValueId( entity.getProdOfrCharValId() );
        productOfferCharacteristicValue.setProductOffer( productOfferMapper.toProductOffer( entity.getProdOfrId() ) );
        productOfferCharacteristicValue.setGeneralCharacteristic( generalCharacteristicMapper.toGeneralCharacteristic( entity.getGnlCharEntity() ) );
        productOfferCharacteristicValue.setName( entity.getName() );
        productOfferCharacteristicValue.setDescription( entity.getDescr() );
        productOfferCharacteristicValue.setShortCode( entity.getShrtCode() );
        productOfferCharacteristicValue.setStatusId( gnlStEntityToGeneralStatus( entity.getStId() ) );

        return productOfferCharacteristicValue;
    }

    @Override
    public ProdOfrCharValEntity toProdOfrCharValEntity(ProductOfferCharacteristicValue value) {
        if ( value == null ) {
            return null;
        }

        ProdOfrCharValEntity prodOfrCharValEntity = new ProdOfrCharValEntity();

        prodOfrCharValEntity.setProdOfrCharValId( value.getProductOfferCharacteristicValueId() );
        prodOfrCharValEntity.setProdOfrId( productOfferMapper.toProdOfrEntity( value.getProductOffer() ) );
        prodOfrCharValEntity.setGnlCharEntity( generalCharacteristicMapper.toGnlCharEntity( value.getGeneralCharacteristic() ) );
        prodOfrCharValEntity.setName( value.getName() );
        prodOfrCharValEntity.setDescr( value.getDescription() );
        prodOfrCharValEntity.setShrtCode( value.getShortCode() );
        prodOfrCharValEntity.setStId( generalStatusToGnlStEntity( value.getStatusId() ) );

        return prodOfrCharValEntity;
    }

    protected GeneralStatus gnlStEntityToGeneralStatus(GnlStEntity gnlStEntity) {
        if ( gnlStEntity == null ) {
            return null;
        }

        GeneralStatus generalStatus = new GeneralStatus();

        List<ProdOfrCharValEntity> list = gnlStEntity.getProdOfrCharValEntities();
        if ( list != null ) {
            generalStatus.setProdOfrCharValEntities( new ArrayList<ProdOfrCharValEntity>( list ) );
        }
        generalStatus.setName( gnlStEntity.getName() );

        return generalStatus;
    }

    protected GnlStEntity generalStatusToGnlStEntity(GeneralStatus generalStatus) {
        if ( generalStatus == null ) {
            return null;
        }

        GnlStEntity gnlStEntity = new GnlStEntity();

        List<ProdOfrCharValEntity> list = generalStatus.getProdOfrCharValEntities();
        if ( list != null ) {
            gnlStEntity.setProdOfrCharValEntities( new ArrayList<ProdOfrCharValEntity>( list ) );
        }
        gnlStEntity.setName( generalStatus.getName() );

        return gnlStEntity;
    }
}
