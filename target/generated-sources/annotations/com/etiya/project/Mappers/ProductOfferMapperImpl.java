package com.etiya.project.Mappers;

import com.etiya.project.DTOs.CustomerOrder;
import com.etiya.project.DTOs.ProductOffer;
import com.etiya.project.DTOs.ProductOfferCharacteristicValue;
import com.etiya.project.entities.CustOrdEntity;
import com.etiya.project.entities.ProdOfrCharValEntity;
import com.etiya.project.entities.ProdOfrEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class ProductOfferMapperImpl implements ProductOfferMapper {

    private final CustomerOrderMapper customerOrderMapper = Mappers.getMapper( CustomerOrderMapper.class );
    private final ProductOfferCharacteristicValueMapper productOfferCharacteristicValueMapper = ProductOfferCharacteristicValueMapper.INSTANCE;
    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;
    private final GeneralTypeMapper generalTypeMapper = GeneralTypeMapper.INSTANCE;

    @Override
    public ProductOffer toProductOffer(ProdOfrEntity prodOfrEntity) {
        if ( prodOfrEntity == null ) {
            return null;
        }

        ProductOffer productOffer = new ProductOffer();

        productOffer.setProductOfferId( prodOfrEntity.getProdOfrId() );
        productOffer.setCustomerOrders( custOrdEntityListToCustomerOrderList( prodOfrEntity.getCustOrdEntityList() ) );
        productOffer.setProductOfferCharacteristicValue( prodOfrCharValEntityListToProductOfferCharacteristicValueList( prodOfrEntity.getProdOfrCharValEntity() ) );
        productOffer.setName( prodOfrEntity.getName() );
        productOffer.setDescription( prodOfrEntity.getDescr() );
        productOffer.setStId( generalStatusMapper.toGeneralStatus( prodOfrEntity.getStId() ) );
        productOffer.setTpId( generalTypeMapper.toGeneralType( prodOfrEntity.getTpId() ) );

        return productOffer;
    }

    @Override
    public ProdOfrEntity toProdOfrEntity(ProductOffer productOffer) {
        if ( productOffer == null ) {
            return null;
        }

        ProdOfrEntity prodOfrEntity = new ProdOfrEntity();

        prodOfrEntity.setProdOfrId( productOffer.getProductOfferId() );
        prodOfrEntity.setCustOrdEntityList( customerOrderListToCustOrdEntityList( productOffer.getCustomerOrders() ) );
        prodOfrEntity.setProdOfrCharValEntity( productOfferCharacteristicValueListToProdOfrCharValEntityList( productOffer.getProductOfferCharacteristicValue() ) );
        prodOfrEntity.setName( productOffer.getName() );
        prodOfrEntity.setDescr( productOffer.getDescription() );
        prodOfrEntity.setStId( generalStatusMapper.toGnlStEntity( productOffer.getStId() ) );
        prodOfrEntity.setTpId( generalTypeMapper.toGnlTpEntity( productOffer.getTpId() ) );

        return prodOfrEntity;
    }

    protected List<CustomerOrder> custOrdEntityListToCustomerOrderList(List<CustOrdEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CustomerOrder> list1 = new ArrayList<CustomerOrder>( list.size() );
        for ( CustOrdEntity custOrdEntity : list ) {
            list1.add( customerOrderMapper.toCustomerOrder( custOrdEntity ) );
        }

        return list1;
    }

    protected List<ProductOfferCharacteristicValue> prodOfrCharValEntityListToProductOfferCharacteristicValueList(List<ProdOfrCharValEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductOfferCharacteristicValue> list1 = new ArrayList<ProductOfferCharacteristicValue>( list.size() );
        for ( ProdOfrCharValEntity prodOfrCharValEntity : list ) {
            list1.add( productOfferCharacteristicValueMapper.toProductOfferCharacteristicValue( prodOfrCharValEntity ) );
        }

        return list1;
    }

    protected List<CustOrdEntity> customerOrderListToCustOrdEntityList(List<CustomerOrder> list) {
        if ( list == null ) {
            return null;
        }

        List<CustOrdEntity> list1 = new ArrayList<CustOrdEntity>( list.size() );
        for ( CustomerOrder customerOrder : list ) {
            list1.add( customerOrderMapper.toCustOrdEntity( customerOrder ) );
        }

        return list1;
    }

    protected List<ProdOfrCharValEntity> productOfferCharacteristicValueListToProdOfrCharValEntityList(List<ProductOfferCharacteristicValue> list) {
        if ( list == null ) {
            return null;
        }

        List<ProdOfrCharValEntity> list1 = new ArrayList<ProdOfrCharValEntity>( list.size() );
        for ( ProductOfferCharacteristicValue productOfferCharacteristicValue : list ) {
            list1.add( productOfferCharacteristicValueMapper.toProdOfrCharValEntity( productOfferCharacteristicValue ) );
        }

        return list1;
    }
}
