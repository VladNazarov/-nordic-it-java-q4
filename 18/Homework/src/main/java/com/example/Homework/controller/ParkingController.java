package com.example.Homework.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Homework.model.OccupiedPlaceException;
import com.example.Homework.model.Parking;

@RestController
public class ParkingController {

	private final String OCCUPIED = "occupied";
	private final String FREE = "free";

	private ConcurrentHashMap<Integer, String> places = Parking.places;

	@GetMapping("/free")
	public ConcurrentHashMap<Integer, String> isFree() {
		return places;
	}

	@PostMapping("/park")
	public String park(@RequestParam(name = "id", required = false) Integer id) throws OccupiedPlaceException {

		if (id == null) {
			for (Map.Entry<Integer, String> entry : places.entrySet()) {

				if (entry.getValue().equals(FREE)) {
					places.put((Integer) entry.getKey(), OCCUPIED);
					break;
				}
			}
			return "succesful";

		} else if (!places.get(id).equals(OCCUPIED)) {
			places.put(id, OCCUPIED);
			return "succesful";

		} else {
			throw new OccupiedPlaceException("Can`t use occupied place");
		}

	}

	@PostMapping("/unpark")
	public String unpark(@RequestParam(name = "id") int id) throws OccupiedPlaceException {
		if (places.get(id).equals(OCCUPIED)) {
			places.put(id, FREE);

			return "succesful";

		} else {
			throw new OccupiedPlaceException("Can`t unpark free place");
		}
	}

}
