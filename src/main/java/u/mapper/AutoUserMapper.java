package u.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import u.dto.UserDto;
import u.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    // @Mapping(source = "email", target = "emailAddress")
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
