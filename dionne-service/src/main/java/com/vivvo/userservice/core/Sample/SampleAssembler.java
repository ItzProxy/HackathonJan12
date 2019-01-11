package com.vivvo.userservice.core.Sample;

import com.vivvo.userservice.SampleDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SampleAssembler {

    public SampleDto assemble(User user) {
        return new SampleDto()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setUserId(user.getUserId())
                .setUsername(user.getUsername());
    }

    public User disassemble(SampleDto dto) {
        UUID userId = dto.getUserId() == null ? UUID.randomUUID() : dto.getUserId();
        return new User()
                .setUserId(userId)
                .setFirstName(StringUtils.trim(dto.getFirstName()))
                .setLastName(StringUtils.trim(dto.getLastName()))
                .setUsername(StringUtils.trim(dto.getUsername()));
    }

}
