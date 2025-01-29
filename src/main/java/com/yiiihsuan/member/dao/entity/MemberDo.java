package com.yiiihsuan.member.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "member")
public class MemberDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String phone;

    @Column(nullable = false)
    private String password;

    @Column(name = "created_ts", nullable = false, updatable = false)
    private LocalDateTime createdTs = LocalDateTime.now();

    @Column(name = "updated_ts", nullable = false)
    private LocalDateTime updatedTs = LocalDateTime.now();
}
