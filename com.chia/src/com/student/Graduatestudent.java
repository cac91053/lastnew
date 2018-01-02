package com.student;


	public class Graduatestudent extends Student{
		int thesis;
		public Graduatestudent(){
			
		}
	@Override
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+ 
				math+"\t"+chinese+"\t"+thesis);
	}
	
	@Override
	public int getAverage(){
		
		return (english+math+chinese+thesis)/4;
	}
}
