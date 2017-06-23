package com.paran.instance;

public class InstanceEx {
	public static void main(String[] args){
		Car kia = new Car("기아","k5","red", false, 240);
		Car ssangyoung = new Car("쌍용","Rexton","Black", true, 200);
		Car samsung = new Car("르노 삼성", "QM6", "White", true, 280);
		kia.print();
		ssangyoung.print();
		samsung.print();
	}
}
class Car{
	String manufacture;
	String name;
	String color;
	boolean fuel;
	int maxSpeed;	
	
	public Car(String manufacture,String name, String color, boolean fuel, int maxSpeed){
		this.manufacture=manufacture;
		this.name=name;
		this.color=color;
		this.fuel=fuel;
		this.maxSpeed=maxSpeed;
	}
	public void print(){
		if(fuel){
			System.out.println(manufacture+"\t"+ name +"\t"+ color+"\t" + maxSpeed+"km/h");
		}else{
			System.out.println(manufacture+"\t"+ name +"\t"+ color+"\t" + maxSpeed+"km/h");
		}
		
	}
}
