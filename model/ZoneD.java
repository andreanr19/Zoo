package model;
public class ZoneD{

//Atributos
	private double amountOfFood;
	private String amountOfWater;
	private double temperature;

//Relaciones
	private BeardedDragon dragon1;
	private BeardedDragon dragon2;

//Método Constructor	
	public ZoneD(double amountOfFood, double temperature, BeardedDragon dragon1, BeardedDragon dragon2){
		this.amountOfFood=amountOfFood;
		this.amountOfWater=amountOfWater;
		this.temperature=temperature;
		this.dragon1=dragon1;
		this.dragon2=dragon2;
	}

//Métodos gets y sets
	public double getAmountOfFood(){
		return amountOfFood;
	}
	public void setAmountOfFood(double amountOfFood){
		this.amountOfFood=amountOfFood;
	}
	public String getAmountOfWater(){
		amountOfWater = "";
		amountOfWater+= "La cantidad de agua que necesita el dragon " + dragon1.getName() + " es: " + dragon1.dragonWater() + " litros \n";
		amountOfWater+= "La cantidad de agua que necesita el dragon " + dragon2.getName() + " es: " + dragon2.dragonWater() + " litros \n";

		return amountOfWater;
	}
	public void setAmountOfWater(String amountOfWater){
		this.amountOfWater=amountOfWater;
	}
	public double getTemperature(){
		return temperature;
	}
	public void setTemperature(double temperature){
		this.temperature=temperature;
	}
	public BeardedDragon getDragon1(){
		return dragon1;
	}
	public void setDragon1(BeardedDragon dragon1){
		this.dragon1=dragon1;
	}
	public BeardedDragon getDragon2(){
		return dragon2;
	}
	public void setDragon2(BeardedDragon dragon2){
		this.dragon2=dragon2;
	}


	//METODO PARA MOSTRAR LA INFORMACION DE LOS DRAGONES
		public String showDragons(){

		String message = "";

		message+= "El dragon 1 se llama: " + dragon1.getName() + "\n";
		message+= "-Pesa: " + dragon1.getWeight() + " kilogramos \n";
		message+= "-Mide: " + dragon1.getHeight() + " metros \n";
		message+= "-Su indice de masa corporal es: " + dragon1.getBmi() + " \n";
		message+= "-Su sexo es: " + dragon1.getGender() + "\n";
		message+= "-Su tipo de sangre es: " + dragon1.getBloodType() + "\n";
		message+= "-Su fecha de nacimiento es: " + "dia: " + dragon1.getDateBirth().getDay() + " mes: " + dragon1.getDateBirth().getDay() + " año: " + dragon1.getDateBirth().getYear() + "\n";

		if(dragon2!=null){
			message+= "El dragon 2 se llama: " + dragon2.getName() + "\n";
			message+= "-Pesa: " + dragon2.getWeight() + " kilogramos \n";
			message+= "-Mide: " + dragon2.getHeight() + " metros \n";
			message+= "-Su indice de masa corporal es: " + dragon2.getBmi() + " \n";
			message+= "-Su sexo es: " + dragon2.getGender() + "\n";
			message+= "-Su tipo de sangre es: " + dragon2.getBloodType() + "\n";
			message+= "-Su fecha de nacimiento es: " + "dia: " + dragon2.getDateBirth().getDay() + " mes: " + dragon2.getDateBirth().getDay() + " año: " + dragon2.getDateBirth().getYear() + "\n";
		}
		return message;
	}	

	//ALERTA PARA LOS BIOLOGOS CUANDO LA COMIDA DEL DRAGON SEA MENOR A 5KG

		public String alertFoodKangaroo(){
		String msj="";
		if( amountOfFood < 5){
			msj+="La comida de los dragones es " + getAmountOfFood() + " kilogramos. Por favor poner más comida";
		}if (amountOfFood >5){
			msj+="La comida de los dragones es " + getAmountOfFood() + " kilogramos. Esta OK";
		}return msj;
	}
}


