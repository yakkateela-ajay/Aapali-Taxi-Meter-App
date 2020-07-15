package controller;
import java.util.*;

import model.Car;
import service.CalculatingFair;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the distance");
		int distance=sc.nextInt();
		Car car=new Car();
		car.setDistance(distance);
		CalculatingFair calculatingFair=new CalculatingFair();
		calculatingFair.mini(car);
		calculatingFair.sedan(car);
		calculatingFair.suv(car);
	}

}
