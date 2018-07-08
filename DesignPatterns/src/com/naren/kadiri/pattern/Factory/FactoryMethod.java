package com.naren.kadiri.pattern.Factory;

public class FactoryMethod {
	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS obj = osf.getInstance("apl");
		obj.spec();
	}
}
