package com.vti.BlockApp.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity

@Table(name = "post")
public class Post {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Long id;


    @Column(name = "title ", length =100, unique = true,nullable = false)

    private String title;

    @Column(name = "description",length =100, nullable = false)

    private String description;


    @Column(name = "created_At",nullable = false,updatable = false)
    @CreationTimestamp
    private LocalDateTime CreatedAt;



    @Column(name = "updated_at",nullable = false)
    @CreationTimestamp
    private LocalDateTime updatedAt;

}
