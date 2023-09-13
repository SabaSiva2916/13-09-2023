package org.sample;

import org.shop.Door;

public class Shop {
    
    public static void main(String[] args) {
	
	Door door = new Door();
	door.shopStaus();
	
	door.getLock().setLock(false);
	door.shopStaus();
    }

}
