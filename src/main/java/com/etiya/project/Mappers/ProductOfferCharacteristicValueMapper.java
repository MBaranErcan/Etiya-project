package com.etiya.project.Mappers;

import com.etiya.project.DTOs.ProductOfferCharacteristicValue;
import com.etiya.project.entities.ProdOfrCharValEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProductOfferMapper.class, GeneralCharacteristicMapper.class})
public interface ProductOfferCharacteristicValueMapper {

    ProductOfferCharacteristicValueMapper INSTANCE = Mappers.getMapper(ProductOfferCharacteristicValueMapper.class);

    @Mappings({
            @Mapping(source = "prodOfrCharValId", target = "productOfferCharacteristicValueId"),
            @Mapping(source = "prodOfrId", target = "productOffer"),
            @Mapping(source = "gnlCharEntity", target = "generalCharacteristic"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "stId", target = "statusId")
    })
    ProductOfferCharacteristicValue toProductOfferCharacteristicValue(ProdOfrCharValEntity entity);

    @InheritInverseConfiguration
    ProdOfrCharValEntity toProdOfrCharValEntity(ProductOfferCharacteristicValue value);
}
