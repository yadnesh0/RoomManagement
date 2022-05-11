package com.room.management.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.room.management.model.RoomDetails;
import com.room.management.service.RoomDetailsService;
@Service
public  class RoomDetailsRepository {
	@Autowired
	RoomDetailsService roomDetailsService;

	public RoomDetails addRoomDetails(RoomDetails roomDetails) {
		return this.roomDetailsService.saveAndFlush(roomDetails);
	}
	public List<RoomDetails> showAllRoomDetails() {
		return this.roomDetailsService.findAll();
	}
	public RoomDetails showRoomDetails(int id) {
		return this.roomDetailsService.findById(id).get();
	}
	public RoomDetails updateRoomDetails(RoomDetails roomDetails) {
		return this.roomDetailsService.saveAndFlush(roomDetails);
	}
	public void removeRoomDetails(int id) {
	    this.roomDetailsService.deleteById(id);
	}
}