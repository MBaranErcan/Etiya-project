package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.DTOs.ProductOffer;
import com.etiya.project.DTOs.ProductOfferCharacteristicValue;
import com.etiya.project.entities.ProdOfrEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CustomerOrderMapper.class, ProductOfferCharacteristicValueMapper.class, GeneralStatusMapper.class, GeneralTypeMapper.class})
public interface ProductOfferMapper {

    ProductOfferMapper INSTANCE = Mappers.getMapper(ProductOfferMapper.class);

    @Mappings({
            @Mapping(source = "prodOfrId", target = "productOfferId"),
            @Mapping(source = "custOrdEntityList", target = "customerOrders"),
            @Mapping(source = "prodOfrCharValEntity", target = "productOfferCharacteristicValue"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "stId", target = "stId"),
            @Mapping(source = "tpId", target = "tpId")
    })
    ProductOffer toProductOffer(ProdOfrEntity prodOfrEntity);

    @InheritInverseConfiguration
    ProdOfrEntity toProdOfrEntity(ProductOffer productOffer);
}
