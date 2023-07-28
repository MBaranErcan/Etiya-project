package com.etiya.project.Mappers;

import com.etiya.project.DTOs.CustomerOrderCharacteristicValue;
import com.etiya.project.entities.CustOrdCharValEntity;
import com.etiya.project.entities.CustOrdEntity;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-28T11:26:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
public class CustomerOrderCharacteristicValueMapperImpl implements CustomerOrderCharacteristicValueMapper {

    private final GeneralStatusMapper generalStatusMapper = GeneralStatusMapper.INSTANCE;
    private final CustomerOrderMapper customerOrderMapper = Mappers.getMapper( CustomerOrderMapper.class );

    @Override
    public CustomerOrderCharacteristicValue toCustomerOrderCharacteristicValue(CustOrdCharValEntity object) {
        if ( object == null ) {
            return null;
        }

        CustomerOrderCharacteristicValue customerOrderCharacteristicValue = new CustomerOrderCharacteristicValue();

        customerOrderCharacteristicValue.setCustomerOrderCharacteristicValueId( object.getCustOrdCharValId() );
        customerOrderCharacteristicValue.setValue( object.getVal() );
        customerOrderCharacteristicValue.setCustomerOrderCharacteristicStatus( generalStatusMapper.toGeneralStatus( object.getGnlStEntity() ) );
        customerOrderCharacteristicValue.setCustomerOrder( customerOrderMapper.toCustomerOrder( object.getCustOrdId() ) );

        return customerOrderCharacteristicValue;
    }

    @Override
    public CustOrdEntity toCustOrdEntity(CustomerOrderCharacteristicValue object) {
        if ( object == null ) {
            return null;
        }

        CustOrdEntity custOrdEntity = new CustOrdEntity();

        return custOrdEntity;
    }
}
