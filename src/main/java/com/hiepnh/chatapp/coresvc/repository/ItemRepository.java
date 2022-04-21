package com.hiepnh.chatapp.coresvc.repository;


import com.hiepnh.chatapp.coresvc.entites.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
}
