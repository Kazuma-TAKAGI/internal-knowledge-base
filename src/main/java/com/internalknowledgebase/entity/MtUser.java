package com.internalknowledgebase.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mt_user")
public class MtUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userno", nullable = false)
    private Integer userno;

    @Size(max = 100)
    @NotNull
    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Size(max = 24)
    @Column(name = "userid", length = 24)
    private String userid;

    @Size(max = 200)
    @Column(name = "password", length = 200)
    private String password;


}