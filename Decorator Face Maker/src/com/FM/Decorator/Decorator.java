package com.FM.Decorator;
import com.FM.ClassDec.Face;

public class Decorator extends Face{
	protected Face face;
	public Decorator(Face aa)
	{
		super();
		face=aa;
	}
}


