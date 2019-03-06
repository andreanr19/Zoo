package model;
public class BeardedDragon{
//Atributos
	private String name;
	/*private String gender;*/ 
	private String bloodType;
	private double weight; 
	private double height; 
	private double bmi;
	private char gender;
	public final static char MALE = 'M';
	public final static char FEMALE = 'F';
//Relaciones
	private Date dateBirth;

//Método constructor
	public BeardedDragon(String name, char gender, /*String gender,*/ String bloodType, double weight, double height, /*double bmi,*/ int day, int month, int year){
		this.name=name;
		this.bloodType=bloodType;
		this.weight=weight;
		this.height=height;
		/*this.bmi=bmi;*/
		this.gender=gender;
		this.dateBirth=new Date(day, month, year); 
	}

//Gets y sets

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	public String getBloodType(){
		return bloodType;
	}
	public void setBloodType(String bloodType){
		this.bloodType=bloodType;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getBmi(){
		bmi= weight / (height * height);
		 return bmi;
		
	}
	public void setBmi(double bmi){
		this.bmi=bmi;

	}
	public Date getDateBirth(){
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth){
		this.dateBirth=dateBirth;
	}

	//METODO PARA CALCULAR LA CANTIDAD DE AGUA QUE NECESITA UN DRAGON
	public double dragonWater(){
		double waterD;
		waterD= 0;
		waterD += bmi*0.75;
		return waterD;

	}

}