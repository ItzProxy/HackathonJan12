package com.vivvo.userservice;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class SampleDto {

    private UUID userId;
    private String firstName;
    private String lastName;
    private String username;
}
