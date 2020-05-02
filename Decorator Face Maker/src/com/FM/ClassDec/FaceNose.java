package com.FM.ClassDec;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.FM.Decorator.Decorator;

import java.util.Objects;

public class FaceNose extends Decorator {
	String nose,ValueChar;
	Map<String, String> Charrac = new HashMap<>();

	public FaceNose(Face aa, String Nose) {
		super(aa);
		ValueChar = init(Nose);
		nose = Nose;
	}

	public String readValue() {
		return face.readValue();
	}

	public String Character() {
		return face.Character() + ValueChar +" ";
	}

	public String SetLayout() {
		return face.SetLayout() + nose + " ";
	}

	public String init(String eye1)
	{
		String Char = "";
		Charrac.put("background/nose1.png","Cute");
		Charrac.put("background/nose11.png","sassy");
		Charrac.put("background/nose114.jpg","innocent");
		Charrac.put("background/nose117.png","Cute");
		Charrac.put("background/nose12.png","innocent");
		Charrac.put("background/nose13.png","moddy");
		Charrac.put("background/nose15.png","sassy");
		Charrac.put("background/nose16.png","Cute");
		Charrac.put("background/nose17.png", "savage");
		Charrac.put("background/nose18.png", "classy");
		Charrac.put("background/nose19.png", "classy");

		for (Entry<String, String> entry : Charrac.entrySet()) {
	        if (Objects.equals(eye1, entry.getKey())) {
	            Char =  entry.getValue();
	        }
	    }
		
		return Char;
	}

	/*
	Cute innocent
	moddy sassy
	savage classy*/
}
