package com.etiya.project.Mappers;

import com.etiya.project.DTOs.GeneralCharacteristic;
import com.etiya.project.DTOs.GeneralCharacteristicValue;
import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.entities.GnlCharValEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {GeneralCharacteristicMapper.class, GeneralStatusMapper.class})
public interface GeneralCharacteristicValueMapper {

    GeneralCharacteristicValueMapper INSTANCE = Mappers.getMapper(GeneralCharacteristicValueMapper.class);

    @Mappings({
            @Mapping(source = "gnlCharValId", target = "generalCharacteristicValueId"),
            @Mapping(source = "charId", target = "charId"),
            @Mapping(source = "defaultSelected", target = "defaultSelected"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "stId", target = "statusId"),
            @Mapping(source = "val", target = "value"),
    })
    GeneralCharacteristicValue toGeneralCharacteristicValue(GnlCharValEntity gnlCharValEntity);

    @InheritInverseConfiguration
    GnlCharValEntity toGnlCharValEntity(GeneralCharacteristicValue generalCharacteristicValue);
}
