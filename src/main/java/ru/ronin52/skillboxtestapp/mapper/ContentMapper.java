package ru.ronin52.skillboxtestapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.ronin52.skillboxtestapp.dto.ContentDto;
import ru.ronin52.skillboxtestapp.entity.ContentEntity;

@Mapper(componentModel = "spring")
public interface ContentMapper {
    @Mapping(target = "id", ignore = true)
    ContentEntity map(ContentDto dto);
}
