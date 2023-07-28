package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.entities.GnlStEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class, CustomerOrderMapper.class, CustomerOrderCharacteristicValueMapper.class, ProductOfferMapper.class})
public interface GeneralStatusMapper {

    GeneralStatusMapper INSTANCE = Mappers.getMapper(GeneralStatusMapper.class);

    @Mappings({
            @Mapping(source = "gnlStId", target = "generalStatusId"),
            //@Mapping(source = "userEntityList", target = "users"),
            //@Mapping(source = "custOrdEntity", target = "customerOrders"),
            //@Mapping(source = "custOrdCharValEntity", target = "customerOrderCharacteristicValues"),
            //@Mapping(source = "prodOfrEntities", target = "productOffers"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "entCodeName", target = "entityCodeName"),
            @Mapping(source = "actv", target = "active"),
            @Mapping(source = "shrtCode", target = "shortCode")
    })
    GeneralStatus toGeneralStatus(GnlStEntity gnlStEntity);

    @InheritInverseConfiguration
    GnlStEntity toGnlStEntity(GeneralStatus generalStatus);
}
