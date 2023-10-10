package model.implementation;

import model.Device;
import model.InternetDevice;
import model.MusicDevice;
import model.PhoneDevice;

public class Iphone extends Device implements InternetDevice, MusicDevice, PhoneDevice {
	
	private String number;	
		
	public Iphone(Integer id, String name, String number) {
		super(id, name);
		this.number = number;
	}

	@Override
	public void makeCalls() {
		System.out.println("Fazendo ligação");

	}

	@Override
	public void receiveCalls() {
		System.out.println("Recebendo Ligação");

	}

	@Override
	public void playMusic() {
		System.out.println("Tocando música");

	}

	@Override
	public void accessInternet() {
		System.out.println("Acessando Internet");

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.getName() + ", ID: " + this.getId() + ", número: " + this.getNumber(); 
	}

}
