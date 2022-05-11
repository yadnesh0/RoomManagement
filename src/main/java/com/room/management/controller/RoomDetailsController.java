package com.room.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.room.management.model.RoomDetails;
import com.room.management.repository.RoomDetailsRepository;
@RestController
public class RoomDetailsController {
	@Autowired
	RoomDetailsRepository roomDetailsRepository;
	@GetMapping("/room")
	private List<RoomDetails> getAllRoomDetails(){
		return this.roomDetailsRepository.showAllRoomDetails();
	}
	@GetMapping("/room/{room_id}")
	private RoomDetails getRoomById(@PathVariable("room_id") String id) {
		return this.roomDetailsRepository.showRoomDetails(Integer.parseInt(id));
	}
	@DeleteMapping("/room/{room_id}")
	private void deleteRoomDetails(@PathVariable("room_id") String id) {
	roomDetailsRepository.removeRoomDetails(Integer.parseInt(id));
	}
	@PostMapping("/room")
	private RoomDetails addRoomDetails(@RequestBody RoomDetails r){
		return this.roomDetailsRepository.addRoomDetails(r);
	}
	@PutMapping("/room")
	private RoomDetails updateRoomDetails(@RequestBody RoomDetails r) {
		return this.roomDetailsRepository.updateRoomDetails(r);
	}
}
