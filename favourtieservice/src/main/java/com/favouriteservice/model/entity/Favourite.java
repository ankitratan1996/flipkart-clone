package com.favouriteservice.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "favourites")
@IdClass(FavouriteId.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Favourite {

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
