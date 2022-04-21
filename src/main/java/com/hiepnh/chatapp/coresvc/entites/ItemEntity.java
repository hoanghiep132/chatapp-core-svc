package com.hiepnh.chatapp.coresvc.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
public class ItemEntity extends BaseEntity{

    @Column(name = "name")
    private String name;
}
