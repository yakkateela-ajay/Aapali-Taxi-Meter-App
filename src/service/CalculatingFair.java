package service;

import model.Car;

public class CalculatingFair implements CalculatingFairInterface {

	@Override
	public void mini(Car car) {
		// TODO Auto-generated method stub
		int distance=car.getDistance();
		int cost;
		if(distance<=3){
			System.out.print("MINI - Rs. 50");
		}else if(distance>3 && distance<=18){
			cost=50+(distance-3)*10;
			System.out.print(" MINI - Rs."+cost);
		}
		else if(distance>18 && distance<75){
			cost=50+(15*10)+(distance-18)*8;
			System.out.print("MINI - Rs."+cost);
			
		}
		else{
			cost=distance*8;
			System.out.print("MINI - Rs."+cost);
		}
	}

	@Override
	public void sedan(Car car) {
		// TODO Auto-generated method stub
		int distance=car.getDistance();
		int cost;
		if(distance<=5){
			System.out.print(" SEDAN - Rs. 80");
		}else if(distance>5 && distance<=20){
			cost=80+(distance-5)*12;
			System.out.print(" SEDAN - Rs."+cost);
		}
		else if(distance>20 && distance<100){
			cost=80+(15*12)+(distance-20)*10;
			System.out.print(" SEDAN - Rs."+cost);
			
		}
		else{
			cost=distance*10;
			System.out.print(" SEDAN - Rs."+cost);
		}
	}

	@Override
	public void suv(Car car) {
		// TODO Auto-generated method stub
		int distance=car.getDistance();
		int cost;
		if(distance<=5){
			System.out.print(" SUV - Rs. 100");
		}
		else if(distance>5 && distance<=20){
			cost=100+(distance-5)*15;
			System.out.print(" Suv - Rs."+cost);
		}else if(distance>20){
			cost=100+(15*15)+(distance-20)*12;
			System.out.print(" SUV - Rs."+cost);
			
		}
		
	}

}
