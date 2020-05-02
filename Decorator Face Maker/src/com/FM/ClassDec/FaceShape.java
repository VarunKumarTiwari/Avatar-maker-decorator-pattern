package com.FM.ClassDec;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

import com.FM.Decorator.Decorator;

public class FaceShape extends Decorator{

	String Hair,ValueHair;
	Map<String, String> Charrac = new HashMap<>();

	public FaceShape(Face aa,String hair) {
		super(aa);
		ValueHair = init(hair);
		Hair = hair;
		// TODO Auto-generated constructor stub
	}
	
	public String readValue(){
		return   face.readValue();
	}

	public String SetLayout()
	{
		return face.SetLayout()+ Hair  +" ";
	}
	
	public String Character()
	{
		return face.Character()+ ValueHair +" ";
	}
	
	public String init(String hair1)
	{
		String Char = "";
		Charrac.put("background/hair.png","Cute");
		Charrac.put("background/hair2.png","innocent");
		Charrac.put("background/hair4.png","sassy");
		Charrac.put("background/hair3.png","savage");
		Charrac.put("background/hair5.png","innocent");
		Charrac.put("background/hair6.png","classy");
		
		for (Entry<String, String> entry : Charrac.entrySet()) {
	        if (Objects.equals(hair1, entry.getKey())) {
	            Char =  entry.getValue();
	        }
	    }
		 
		//System.out.println(Char);
		
		return Char;
	}

}
