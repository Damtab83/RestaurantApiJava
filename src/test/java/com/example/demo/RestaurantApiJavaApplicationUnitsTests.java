package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.business.Restaurant;
import static org.junit.jupiter.api.Assertions.assertEquals;


class RestaurantApiJavaApplicationUnitsTests {

	@Test
	void testCreationRestaurant() {
		
		Restaurant restaurant = Restaurant.creationDeNotreRestaurant();
		System.out.println(restaurant);
		
		assertEquals(4, restaurant.getTables().size());
	}
	
	

}
