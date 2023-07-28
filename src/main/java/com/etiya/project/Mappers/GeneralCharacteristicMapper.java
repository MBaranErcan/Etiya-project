package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralCharacteristic;
import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.entities.GnlCharEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {GeneralStatusMapper.class, GeneralCharacteristicValueMapper.class})
public interface GeneralCharacteristicMapper {

    GeneralCharacteristicMapper INSTANCE = Mappers.getMapper(GeneralCharacteristicMapper.class);

    @Mappings({
            @Mapping(source = "gnlCharId", target = "generalCharacteristicId"),
            @Mapping(source = "gnlCharValEntity", target = "generalCharacteristicValue"),
            @Mapping(source = "prodOfrCharValEntities", target = "productOfferCharacteristicValues"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "stId", target = "statusId")
    })
    GeneralCharacteristic toGeneralCharacteristic(GnlCharEntity gnlCharEntity);

    @InheritInverseConfiguration
    GnlCharEntity toGnlCharEntity(GeneralCharacteristic generalCharacteristic);

}
