package com.FM.ClassDec;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.FM.Decorator.Decorator;

import java.util.Objects;

public class Eyes extends Decorator {
	String eye,ValueChar;
	Map<String, String> Charrac = new HashMap<>();

	public Eyes(Face aa, String Eye) {
		super(aa);
		ValueChar = init(Eye);
		eye = Eye;
	}

	public String readValue() {
		return face.readValue();
	}

	public String Character() {
		return face.Character() + ValueChar +" ";
	}

	public String SetLayout() {
		return face.SetLayout() + eye + " ";
	}

	public String init(String eye1)
	{
		String Char = "";
		Charrac.put("background/eye11.png","Cute");
		Charrac.put("background/eye12.png","innocent");
		Charrac.put("background/eye13.png","innocent");
		Charrac.put("background/eye14.png","Cute");
		Charrac.put("background/eye15.png","innocent");
		Charrac.put("background/eye16.png","moddy");
		Charrac.put("background/eye17.png","sassy");
		Charrac.put("background/eye18.png","Cute");
		Charrac.put("background/eye19.png", "savage");
		Charrac.put("background/eye20.png", "classy");
		
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
