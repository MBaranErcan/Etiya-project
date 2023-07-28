package com.etiya.project.Mappers;

import com.etiya.project.DTOs.CustomerOrder;
import com.etiya.project.entities.CustOrdEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class CustomerOrderMapperImpl implements CustomerOrderMapper {

    private final ProductOfferMapper productOfferMapper = ProductOfferMapper.INSTANCE;
    private final UserMapper userMapper = UserMapper.INSTANCE;
    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;

    @Override
    public CustomerOrder toCustomerOrder(CustOrdEntity custOrdEntity) {
        if ( custOrdEntity == null ) {
            return null;
        }

        CustomerOrder customerOrder = new CustomerOrder();

        customerOrder.setCustomerOrderId( custOrdEntity.getCustOrdId() );
        customerOrder.setCustOrdCharValEntity( custOrdEntity.getCustOrdCharValEntity() );
        customerOrder.setProductOffer( productOfferMapper.toProductOffer( custOrdEntity.getProdOfrEntity() ) );
        customerOrder.setUser( userMapper.toUser( custOrdEntity.getUserId() ) );
        customerOrder.setGeneralStatus( generalStatusMapper.toGeneralStatus( custOrdEntity.getGnlStEntity() ) );

        return customerOrder;
    }

    @Override
    public CustOrdEntity toCustOrdEntity(CustomerOrder customerOrder) {
        if ( customerOrder == null ) {
            return null;
        }

        CustOrdEntity custOrdEntity = new CustOrdEntity();

        custOrdEntity.setCustOrdId( customerOrder.getCustomerOrderId() );
        custOrdEntity.setCustOrdCharValEntity( customerOrder.getCustOrdCharValEntity() );
        custOrdEntity.setProdOfrEntity( productOfferMapper.toProdOfrEntity( customerOrder.getProductOffer() ) );
        custOrdEntity.setUserId( userMapper.toUserEntity( customerOrder.getUser() ) );
        custOrdEntity.setGnlStEntity( generalStatusMapper.toGnlStEntity( customerOrder.getGeneralStatus() ) );

        return custOrdEntity;
    }
}
