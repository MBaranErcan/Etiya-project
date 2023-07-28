package com.etiya.project.Mappers;

import com.etiya.project.DTOs.CustomerOrderCharacteristicValue;
import com.etiya.project.entities.CustOrdCharValEntity;
import com.etiya.project.entities.CustOrdEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {GeneralStatusMapper.class, CustomerOrderMapper.class})
public interface CustomerOrderCharacteristicValueMapper {

    CustomerOrderCharacteristicValueMapper INSTANCEGeneralStatusMapper = Mappers.getMapper(CustomerOrderCharacteristicValueMapper.class);


    @Mappings({
            @Mapping(source = "custOrdCharValId", target = "customerOrderCharacteristicValueId"),
            @Mapping(source = "val", target = "value"),
            @Mapping(source = "gnlStEntity", target = "customerOrderCharacteristicStatus"),
            @Mapping(source = "custOrdId", target = "customerOrder")
    })
    CustomerOrderCharacteristicValue toCustomerOrderCharacteristicValue(CustOrdCharValEntity object);

    @InheritInverseConfiguration
    CustOrdEntity toCustOrdEntity(CustomerOrderCharacteristicValue object);
}
