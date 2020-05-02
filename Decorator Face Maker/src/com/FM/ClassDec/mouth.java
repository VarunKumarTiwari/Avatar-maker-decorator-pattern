package com.FM.ClassDec;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

import com.FM.Decorator.Decorator;

public class mouth extends Decorator {

	String lips,ValueLips;
	Map<String, String> Charrac = new HashMap<>();
	
	public mouth(Face aa,String Lips) {
		super(aa);
		ValueLips = init(Lips);
		
		lips = Lips;
		// TODO Auto-generated constructor stub
	}

	public String readValue(){
		return   face.readValue();
	}

	public String SetLayout()
	{
		System.out.println(face.SetLayout()+ ValueLips +" ");
		return face.SetLayout()+ lips  +" ";
	}
	public String Character()
	{
		return face.Character()+ ValueLips +" ";
	}
	
	public String init(String eye1)
	{
		String Char = "";
		Charrac.put("background/lips7.png","Cute");
		Charrac.put("background/lips8.png","innocent");
		Charrac.put("background/lips9.png","innocent");
		Charrac.put("background/lips10.png","Cute");
		Charrac.put("background/lips12.png","innocent");
		Charrac.put("background/lips13.png","moddy");
		Charrac.put("background/lips14.png","sassy");
		Charrac.put("background/lips15.png","Cute");
		Charrac.put("background/lips16.png", "savage");
		Charrac.put("background/mo1.jpg", "classy");
		
		Charrac.put("background/mo2.jpg", "savage");
		Charrac.put("background/mo3.jpg", "sassy");
		Charrac.put("background/mo4.jpg.gif", "savage");
		Charrac.put("background/mo5.png", "classy");
		Charrac.put("background/mo6.png", "sassy");
		
		
		
		for (Entry<String, String> entry : Charrac.entrySet()) {
	        if (Objects.equals(eye1, entry.getKey())) {
	            Char =  entry.getValue();
	        }
	    }
		
		//System.out.println(Char);
		return Char;
	}
}
