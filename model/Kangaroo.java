package model;
public class Kangaroo{
	private String name;
	private double height;
	private double weight;
	private double bmi;
	/*private String gender;*/
	private String bloodType;
	/*private char gender;*/
	private String gender;
	public final static String MALE = "MALE";
	public final static String FEMALE = "FEMALE";
	/*public final static char MALE = 'M';
	public final static char FEMALE = 'F';*/
//relacion
	private Date dateBirth;

//Constructor
	public Kangaroo(String name, double height, double weight,String bloodType, String gender , int day, int month, int year){
		this.name=name;
		this.height=height;
		this.weight=weight;
		/*this.bmi=bmi;*/
		calculateBmi();
		/*this.gender=gender;*/
		this.bloodType=bloodType;
		this.gender=gender;
		this.dateBirth=new Date(day, month, year);
	}

//Métodos sets and gets

	public String getName(){
		return name;
	} 
	public void setName(String name){
		this.name=name;
	}
	public double getHeight(){
		return height;

	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	




	//El método calcula el indice de masa corporal del canguro
	public double calculateBmi(){
		 bmi= getWeight() / (getHeight() * getHeight());
		 return bmi;
		}
	
	public void setBmi(double bmi){
		this.bmi=bmi;
	}

	public String getBloodType(){
		return bloodType;
	}
	public void setBloodType(String bloodType){
		this.bloodType=bloodType;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	/*public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender=gender;
	}*/
	public Date getDateBirth(){
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth){
		this.dateBirth=dateBirth;
	}


//	METODO PARA DETERMINAR SI EL CANGURO TIENE TENDENCIAS A ENFERMEDADES CARDIACAS
		public String KangarooHeartDisease(){
			String heartK = "";
		
			if( bmi < 18 && bloodType.equals("A") || bmi < 18 && bloodType.equals("AB")){
				heartK += "Riesgo Bajo";
			}else if( bmi < 18 && bloodType!="A" || bmi <17 && bloodType!= "AB"){
				heartK+= "Riesgo Moderado"; 
			}else if( bmi >=18 && bmi <=25){
				heartK+= "Riesgo bajo";
			}else if (bmi > 25 && bloodType.equals("A") || bmi > 25 && bloodType.equals("B") || bmi > 25 && bloodType.equals("O")){
				heartK+= "Riesgo Alto";
			}else if ( bmi > 25 && bloodType.equals("AB")){
				heartK+= "Riesgo Moderado";
			} return heartK;	
		
		}

// METODO PARA CALCULAR LA COMIDA DEL KANGAROO
		public double KangarooFood(){
			double foodK = 0;
			if( weight <30){
				foodK = weight * 0.8;
			}else if ( weight >= 30 && weight <= 48){
				foodK = weight + (weight *0.10);
			}else if ( weight > 48){
				foodK= 40 + (weight - 48)*0.4;
			}

			return foodK;
		}

// METODO PARA CALCULAR LA CANTIDAD DE AGUA QUE NECESITA UN CANGURO
		public double KangarooWater(){
			double waterK = 0;
			waterK = bmi * 1.5;
			return waterK;
		}


// METODO PARA DETERMINAR LOS DIAS QUE FALTAN PARA VACUNAR EL CANGURO
	public int VaccinateKangaroo(int presentDay){

	//kangarooLifeInDays Total de dias que ha vivido el canguro.		
		int kangarooLifeInDays=presentDay-dateBirth.toDays();
		int toReturn=0;
		if(kangarooLifeInDays<= 360){
			//para saber cuantos dias faltan para vacunar el canguro
			toReturn= 360 - kangarooLifeInDays;
		}else{
			 //-1 cuando no hay que vacunar
			toReturn=-1;
		}
		return toReturn;
	}
// METODO PARA COMPROBAR QUE NOMBRE DE LOS CANGUROS EMPIEZA POR VOCAL Y TERMINA POR VOCAL
	public String vocalsOfTheName(){
		String nameMinus = name.toLowerCase();
		String nameWithMoreVocals = "";
		boolean theVocal =false;
		if (nameMinus.charAt(0) == 'a' || nameMinus.charAt(0) == 'e' || nameMinus.charAt(0) == 'i' || nameMinus.charAt(0) == 'o' || nameMinus.charAt(0) == 'u'){
			theVocal=true;
		
		}else{
			theVocal=false;
		}if (nameMinus.charAt(name.length()-1) == 'a' || nameMinus.charAt(name.length()-1) == 'e' || nameMinus.charAt(name.length()-1) == 'i' || nameMinus.charAt(name.length()-1) == 'o' || nameMinus.charAt(name.length()-1) == 'u'){
			theVocal=true;
		}else{
			theVocal=false;
		}if(theVocal = true){
			nameMinus = name;
		} return nameWithMoreVocals;
	}
}

