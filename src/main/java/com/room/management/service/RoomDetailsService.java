package com.room.management.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.room.management.model.RoomDetails;
@Repository
public interface RoomDetailsService extends JpaRepository<RoomDetails, Integer>{
	

}
