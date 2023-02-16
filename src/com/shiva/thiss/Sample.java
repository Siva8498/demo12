package com.shiva.thiss;

public class Sample 
{
	
	void main()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.main();
		
	}

}
