package com.learn.esconsumer;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KafkaToEsMapper {

    public UserDoc UserToUserDoc(User user);
}
