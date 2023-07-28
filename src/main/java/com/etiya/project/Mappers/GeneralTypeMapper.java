package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralType;
import com.etiya.project.DTOs.ProductOffer;
import com.etiya.project.entities.GnlTpEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class, ProductOfferMapper.class})
public interface GeneralTypeMapper {

    GeneralTypeMapper INSTANCE = Mappers.getMapper(GeneralTypeMapper.class);

    @Mappings({
            @Mapping(source = "gnlTpId", target = "generalTypeId"),
            //@Mapping(source = "userEntity", target = "users"),
            //@Mapping(source = "prodOfrEntities", target = "productOffers"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "entCodeName", target = "entityCodeName"),
            @Mapping(source = "actv", target = "isActive")
    })
    GeneralType toGeneralType(GnlTpEntity gnlTpEntity);

    @InheritInverseConfiguration
    GnlTpEntity toGnlTpEntity(GeneralType generalType);
}
