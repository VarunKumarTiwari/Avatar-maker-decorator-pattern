package com.FM.ClassDec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Character {

	public String getCharac(String hair,String eyes,String nose,String lips)
	{
		Face face = new mouth(new FaceNose(new Eyes(new FaceShape(new Face(), hair), eyes), nose), lips);
		String str = face.Character();
		//String[] splitStr2 = str.split("\\s+");
		List<String> items = Arrays.asList(str.split("\\s+"));
		
		
		return items.get(4);
		/*
		Cute innocent
		moddy sassy
		savage classy*/
	}
}
