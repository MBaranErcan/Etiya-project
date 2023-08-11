package com.etiya.project.Mappers;

import com.etiya.project.DTOs.CustomerOrder;
import com.etiya.project.entities.CustOrdEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CustomerOrderCharacteristicValueMapper.class, ProductOfferMapper.class, UserMapper.class, GeneralStatusMapper.class})
public interface CustomerOrderMapper {

    CustomerOrderMapper INSTANCECustomerOrderCharacteristicValueMapper = Mappers.getMapper(CustomerOrderMapper.class);

    @Mappings({
            @Mapping(source = "custOrdId", target = "customerOrderId"),
            @Mapping(source = "prodOfrEntity", target = "productOffer"),
            @Mapping(source = "userId", target = "user"),
            @Mapping(source = "gnlStEntity", target = "generalStatus")
    })
    CustomerOrder toCustomerOrder(CustOrdEntity custOrdEntity);

    @InheritInverseConfiguration
    CustOrdEntity toCustOrdEntity(CustomerOrder customerOrder);
}
