package com.hiepnh.chatapp.coresvc.entites;

import org.hibernate.annotations.Columns;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_at")
    private Long createAt;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_by")
    private Long updateAt;
}
