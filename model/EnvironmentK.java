package model;
public class EnvironmentK{

//Atributos	
	private double area;
	private double amountOfFood;
	private int amountOfMales;
	private double amountOfWater;

	public final static double MULTIPLY_AREA = 8.0;

//Relación
	private Kangaroo kangaroo1;
	private Kangaroo kangaroo2;
	private Kangaroo kangaroo3;


	public EnvironmentK(int amountOfMales, Kangaroo kangaroo1, Kangaroo kangaroo2, Kangaroo kangaroo3){
		this.amountOfMales=amountOfMales;
		this.amountOfWater=amountOfWater;
		this.kangaroo1=kangaroo1;
		this.kangaroo2=kangaroo2;
		this.kangaroo3=kangaroo3;
	} 
	//METODO PARA CALCULAR EL AREA DE LOS AMBIENTES
	public double getArea(){
		area = 0;
		if(kangaroo1 != null)
			area += kangaroo1.getHeight()*MULTIPLY_AREA;

		if (kangaroo2 != null){
			area += kangaroo2.getHeight()*MULTIPLY_AREA;
		}if (kangaroo3 != null){
			area += kangaroo3.getHeight()*MULTIPLY_AREA;
		}
		return area;

	}
	public void setArea(double area){
		this.area=area;
	}
	
	//METODO SUMAR LA CANTIDAD DE COMIDA DE LOS CANGUROS
	public double getAmountOfFood(){
		amountOfFood = 0;
		if(kangaroo1 != null){
			amountOfFood+= kangaroo1.KangarooFood();
		}
		if(kangaroo2 != null){
			amountOfFood+= kangaroo2.KangarooFood();
		}
		if(kangaroo3 != null){
			amountOfFood+= kangaroo3.KangarooFood();
		}
		return amountOfFood;
	}
	public void setAmountOfFood(double amountOfFood){
		this.amountOfWater=amountOfWater;
	}

	//METODO PARA CALCULAR LA CANTIDA DE COMIDA EN CADA AMBIENTE
	public String calculateAmountOfWater(){
		String amountOfWater;
		amountOfWater = "";
		if(kangaroo1 != null){
			amountOfWater+= "La cantidad de agua del canguro " + kangaroo1.getName() + " es: " +kangaroo1.KangarooWater() + " litros. \n";
		}
		if(kangaroo2 != null){
			amountOfWater+= "La cantidad de agua del canguro " + kangaroo2.getName() + " es: " +kangaroo2.KangarooWater() + " litros. \n";
		}
		if(kangaroo3 != null){
			amountOfWater+= "La cantidad de agua del canguro " + kangaroo3.getName() + " es: " +kangaroo3.KangarooWater() + " litros. \n";
		}
		return amountOfWater;
	}
	public void setAmountOfWater(double amountOfWater){
		this.amountOfWater=amountOfWater;
	
	}
	public int getAmountOfMales(){
		return amountOfMales;
	}
	public Kangaroo getKangaroo1(){
		return kangaroo1;
	}
	public void setKangaroo1(Kangaroo kangaroo1){
		this.kangaroo1=kangaroo1;
	}
	public Kangaroo getKangaroo2(){
		return kangaroo2;
	}
	public void setKangaroo2(Kangaroo kangaroo2){
		this.kangaroo2=kangaroo2;
	}
	public Kangaroo getKangaroo3(){
		return kangaroo3;
	}
	public void setKangaroo3(Kangaroo kangaroo3){
		this.kangaroo3=kangaroo3;
	}
	//PARA MOSTRAR EL HEART DISEASE DE LOS CANGUROS
	public String heartDiseaseKangaroos(){
		String heartDiseaseK = "";
		if(kangaroo1!=null){
			heartDiseaseK += "El registro de tendencias hacia enfermedades del canguro " + kangaroo1.getName() + " es: " + kangaroo1.KangarooHeartDisease() +"\n";
		}
		if(kangaroo2!=null){
			heartDiseaseK += "El registro de tendencias hacia enfermedades del canguro " + kangaroo2.getName() + " es: " + kangaroo2.KangarooHeartDisease() +"\n";
		}
		if(kangaroo3!=null){
			heartDiseaseK += "El registro de tendencias hacia enfermedades del canguro " + kangaroo3.getName() + " es: " + kangaroo3.KangarooHeartDisease() +"\n";
		}return heartDiseaseK;  
	}
	//PARA MOSTRAR EL KANGAROO CON LETRA AL FINAL Y AL PRINCIPIO DEL NOMBRE 
	public String kangarooVocalName(){
		String kangarooWithVocal = "";
		if(kangaroo1!=null){
			kangarooWithVocal += kangaroo1.vocalsOfTheName() + "\n"; 
		}if(kangaroo2!=null){
			kangarooWithVocal += kangaroo2.vocalsOfTheName() + "\n";
		}if(kangaroo3!=null){
			kangarooWithVocal += kangaroo3.vocalsOfTheName() + "\n";
		}return kangarooWithVocal;
	}
	
	//PARA MOSTRAR LA INFO DE LOS CANGUROS

	public String showKangaroos(){

		String message = "";
		if(kangaroo1!=null){
		message+= "El primer canguro se llama: " + kangaroo1.getName() + "\n";
		message+= "-Pesa: " + kangaroo1.getWeight() + " kilogramos \n";
		message+= "-Mide: " + kangaroo1.getHeight() + " metros \n";
		/*message+= "-Su indice de masa corporal es: " + kangaroo1.getBmi() + " \n";*/
		message+= "-Su sexo es: " + kangaroo1.getGender() + "\n";
		message+= "-Su tipo de sangre es: " + kangaroo1.getBloodType() + "\n";
		message+= "-Su fecha de nacimiento es: " + " Dia: " + kangaroo1.getDateBirth().getDay() + " Mes: " + kangaroo1.getDateBirth().getMonth() + " Año: " + kangaroo1.getDateBirth().getYear() + "\n";

		}
		if(kangaroo2!=null){
			message+= "El segundo canguro se llama: " + kangaroo2.getName() + "\n";
			message+= "-Pesa: " + kangaroo2.getWeight() + " kilogramos \n";
			message+= "-Mide: " + kangaroo2.getHeight() + " metros \n";
			/*message+= "-Su indice de masa corporal es: " + kangaroo2.getBmi() + " \n";*/
			message+= "-Su sexo es: " + kangaroo2.getGender() + "\n";
			message+= "-Su tipo de sangre es: " + kangaroo2.getBloodType() + "\n";
			message+= "-Su fecha de nacimiento es: " + " Dia: " + kangaroo2.getDateBirth().getDay() + " Mes: " + kangaroo2.getDateBirth().getMonth() + " Año: " + kangaroo2.getDateBirth().getYear() + "\n";
		}
		if(kangaroo3!=null){
			message+= "El tercer canguro se llama: " + kangaroo3.getName() + "\n";
			message+= "-Pesa: " + kangaroo3.getWeight() + " kilogramos \n";
			message+= "-Mide: " + kangaroo3.getHeight() + " metros \n";
			/*message+= "-Su indice de masa corporal es: " + kangaroo3.getBmi() + " \n";*/
			message+= "-Su sexo es: " + kangaroo3.getGender() + "\n";
			message+= "-Su tipo de sangre es: " + kangaroo3.getBloodType() + "\n";
			message+= "-Su fecha de nacimiento es: " + " Dia: " + kangaroo3.getDateBirth().getDay() + " Mes: " + kangaroo3.getDateBirth().getMonth() + " Año: " + kangaroo3.getDateBirth().getYear() + "\n";
		}

		return message;
	}
	//METODO PARA VERIFICAR LAS FECHAS DE LAS VACUNAS DE LOS CANGUROS 
	public String VerifyDatesOfKangarooVaccines(int presentDay){
		String message ="";
		if(kangaroo1!=null){
			//vaccionateCheck es el toReturn de la clase kangaroo	
			int vaccinateCheck = kangaroo1.VaccinateKangaroo(presentDay);
			//si es mayor o igual a cero es porque faltan dias para que el canguro sea vacunado
			if( vaccinateCheck>=0){
				message +="Los dias que faltan para la vacunacion de " + kangaroo1.getName() + " son: " + vaccinateCheck +"\n";
			}

		}
		if(kangaroo2!=null){
			//vaccionateCheck es el toReturn de la clase kangaroo	
			int vaccinateCheck = kangaroo2.VaccinateKangaroo(presentDay);
			//si es mayor o igual a cero es porque faltan dias para que el canguro sea vacunado
			if( vaccinateCheck>=0){
				message +="Los dias que faltan para la vacunacion de " + kangaroo2.getName() + " son: " + vaccinateCheck +"\n";
			}

		}
		if(kangaroo3!=null){
			//vaccionateCheck es el toReturn de la clase kangaroo	
			int vaccinateCheck = kangaroo3.VaccinateKangaroo(presentDay);
			//si es mayor o igual a cero es porque faltan dias para que el canguro sea vacunado
			if( vaccinateCheck>=0){
				message +="Los dias que faltan para la vacunacion de " + kangaroo3.getName() + " son: " + vaccinateCheck +"\n";
			}

		}
		return message;

	}
	//METODO PARA MOSTRAR EL BMI DE LOS CANGUROS
	public String calculateKangaroosBmi(){
		String message = "";

		if (kangaroo1 != null){
		message+= "El bmi del canguro " + kangaroo1.getName() + " es: " + kangaroo1.calculateBmi() + "\n";

		}
		if(kangaroo2!=null){
			message+= "El bmi del canguro " + kangaroo2.getName() + " es: " + kangaroo2.calculateBmi() + "\n";
		}
		if(kangaroo3!=null){
			message+= "El bmi del canguro " + kangaroo3.getName() + " es: " + kangaroo3.calculateBmi() + "\n";
		}
		return message;
	}	

	//METODO PARA CALCULAR EL AREA DE LOS AMBIENTES DE LOS CANGUROS

	public double calcularArea(){

		if (kangaroo1 != null){
			area = kangaroo1.getHeight()*MULTIPLY_AREA;

		}if (kangaroo2 != null){
			area += kangaroo2.getHeight()*MULTIPLY_AREA;
		}if (kangaroo3 != null){
			area += kangaroo3.getHeight()*MULTIPLY_AREA;
		}
		return area;
	}
	
		//METODO PARA ELIMINAR EL CANGURO
		public boolean deleteKangaroo(String name){
			boolean deleted=false;
			if(kangaroo1!= null && kangaroo1.getName().equals(name))
			{
				kangaroo1=null;
				deleted=true;
			}else if(kangaroo2!= null && kangaroo2.getName().equals(name)){
				kangaroo2=null;
				deleted=true;
			}else if (kangaroo3!= null && kangaroo3.getName().equals(name)){
				kangaroo3=null;
				deleted=true;
			}
			return deleted;
		}

		//METODO PARA AGREGAR UN CANGURO 
		public String addKangaroo(Kangaroo createdByTheUser){
			String msj = "";

			if(kangaroo1==null || kangaroo2==null || kangaroo3==null){

				if(createdByTheUser.getGender().equals(Kangaroo.MALE)){
					if(thereIsMale()){
						msj += "No se pudo agregar porque el ambiente ya tiene un macho";
					}
				}
				if(kangaroo1==null){
					kangaroo1 = createdByTheUser;
					msj += "Ya se pudo agregar canguro";
				}else if(kangaroo2==null){
					kangaroo2 = createdByTheUser;
					msj += "Ya se pudo agregar canguro";
				}else if(kangaroo3==null){
					kangaroo3 = createdByTheUser;
					msj += "Ya se pudo agregar canguro";
				}

			}else{
				msj += "No se pudo agregar porque el ambiente está lleno";
			}
			return msj;

		}
		//ESTE METODO LO IBA A UTILIZAR PARA HACER EL CAMBIO DEL CANGURO A OTRO AMBIENTE (no lo pudé terminar)
		/*public String toChangeKangaroo(Kangaroo toTakeToAnotherEnvironment){
			String msj = "";

			if(kangaroo1==null || kangaroo2==null || kangaroo3==null){

				if(toTakeToAnotherEnvironment.getGender().equals(Kangaroo.MALE)){
					if(hayMasMachos()){
						msj += "No se pudo cambiar el canguro aqui porque el ambiente ya tiene un macho";
					}
				}
				if(kangaroo1==null){
					kangaroo1 = toTakeToAnotherEnvironment;
					msj += "Ya se pudo cambiar el canguro de ambiente";
				}else if(kangaroo2==null){
					kangaroo2 = toTakeToAnotherEnvironment;
					msj += "Ya se pudo cambiar el canguro de ambiente";
				}else if(kangaroo3==null){
					kangaroo3 = toTakeToAnotherEnvironment;
					msj += "Ya se pudo cambiar el canguro de ambiente";
				}

			}else{
				msj += "No se pudo cambiar porque el ambiente está lleno";
			}
			return msj;*/

		//METODO PARA RESTRINGIR LA CANTIDAD DE CANGUROS MACHOS EN CADA AMBIENTE

		public boolean thereIsMale(){
			boolean more = false;

			if(kangaroo1!=null && kangaroo1.getGender().equals(Kangaroo.MALE)){
				more = true;
			}
			if(kangaroo2!=null && kangaroo1.getGender().equals(Kangaroo.MALE)){
				more = true;
			}
			if(kangaroo3!=null && kangaroo1.getGender().equals(Kangaroo.MALE)){
				more = true;
		}	return more;
	}

	public String toShowKangaroosNames(){
		String message = "";
		if(kangaroo1!=null){
		message+= "1." + kangaroo1.getName() + "\n";
		
		}
		if(kangaroo2!=null){
			message+= "2." + kangaroo2.getName() + "\n";
			
		}
		if(kangaroo3!=null){
			message+= "3." + kangaroo3.getName() + "\n";

		}

		return message;
	
	}

	
}

