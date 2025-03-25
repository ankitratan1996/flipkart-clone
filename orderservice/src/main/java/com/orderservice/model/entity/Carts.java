package com.orderservice.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cart_Id;
    private Integer user_Id;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @JsonIgnore
    @OneToMany(mappedBy ="carts",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Set<Orders> orderInformationSet;



}
