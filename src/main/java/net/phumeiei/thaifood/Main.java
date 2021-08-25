package net.phumeiei.thaifood;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

	public static final String MOD_ID = "thaifood";

	@Override
	public void onInitialize() {
		System.out.println("Yes! This mod is working");
		Items.regItems();
	}
}
