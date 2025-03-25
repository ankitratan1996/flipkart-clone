package com.favouriteservice.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<FavouriteDto> favouriteDtos;
}
