package com.favouriteservice.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class FavouriteId {

    @Id
    private Integer userId;

    @Id
    private Integer productId;

    @Id
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using= LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "dd-MM-yyyy__HH:mm:ss:SSSSSS",shape = JsonFormat.Shape.STRING)
    @DateTimeFormat(pattern = "dd-MM-yyyy__HH:mm:ss:SSSSSS")
    private LocalDateTime likedDate;
}
