package com.naren.kadiri.pattern.Factory;

public class OSFactory {

	public OS getInstance(String str) {

		if (str.equals("apl")) {
			return new Apple();
		} else if (str.equals("win")) {
			return new Windows();
		} else
			return new Android();
	}

}
