package com.hiepnh.chatapp.coresvc.repository;

import com.hiepnh.chatapp.coresvc.entites.CollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<CollectionEntity, Long> {
}
