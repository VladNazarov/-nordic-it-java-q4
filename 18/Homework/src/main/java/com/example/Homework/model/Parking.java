package com.example.Homework.model;

import java.util.concurrent.ConcurrentHashMap;

public class Parking {
	public static ConcurrentHashMap<Integer, String> places;

	static {
		places = new ConcurrentHashMap<>();
		for (int i = 1; i <= 20; i++) {
			places.put(i, "free");
		}
	}

}
