package model;
public class ZoneK{

//Atributos
	private double totalArea;

//Relaciones
	private EnvironmentK environment1;
	private EnvironmentK environment2;
	private EnvironmentK environment3;

//Método constructor
	public ZoneK(double totalArea, EnvironmentK environment1, EnvironmentK environment2, EnvironmentK environment3){
		this.totalArea= totalArea;
		this.environment1=environment1;
		this.environment2=environment2;
		this.environment3=environment3;

	}
	
//gets y sets

	public double getTotalArea(){
		return totalArea;
	}
	public void setTotalArea(double totalArea){
		this.totalArea=totalArea;
	}
	//relaciones gets y sets
	public EnvironmentK getEnvironment1(){
		return environment1;
	}
	public void setEnvironment1(EnvironmentK environment1){
		this.environment1=environment1;
	}
	public EnvironmentK getEnvironment2(){
		return environment2;
	}
	public void setEnvironment2(EnvironmentK environment2){
		this.environment2=environment2;
	}
	public EnvironmentK getEnvironment3(){
		return environment3;
	}
	public void setEnvironment3(EnvironmentK environment3){
		this.environment3=environment3;
	}

		// METODO PARA MOSTRAR LA INFORMACION DE LOS CANGUROS 

	public String showKangaroosInformation(){
		String msj = "";

		msj += "Los canguros del ambiente 1 son: \n";
		msj += environment1.showKangaroos() + "\n";
		msj += "Los canguros del ambiente 2 son: \n";
		msj += environment2.showKangaroos() + "\n";
		msj += "Los canguros del ambiente 3 son: \n";
		msj += environment3.showKangaroos() + "\n";
		return msj;
	}

		// METODO PARA MOSTRAR EL BMI DE LOS CANGUROS DE CADA AMBIENTE
	public String showBmiKEnvironment(){
		String msj = "";

		msj += "El bmi de los canguros del ambiente 1 es: \n";
		msj += environment1.calculateKangaroosBmi() + "\n";
		msj +=  "El bmi de los canguros del ambiente 2 es: \n";
		msj += environment2.calculateKangaroosBmi() + "\n";
		msj +=  "El bmi de los canguros del ambiente 3 es: \n";
		msj += environment3.calculateKangaroosBmi() + "\n";
		return msj;


		// METODO PARA MOSTRAR EL AREA DE CADA AMBIENTE
	}
	public String showAreaEnvironmentInformation(){
		String msj = "";

		msj += "El area del ambiente 1 es:  \n";
		msj += environment1.calcularArea() + "\n";
		msj += "El area del ambiente 2 es: \n";
		msj += environment2.calcularArea() + "\n";
		msj += "El area del ambiente 3 es: \n";
		msj += environment3.calcularArea() + "\n";
		return msj;
	}

	// METODO PARA SUMAR LA CANTIDAD DE COMIDA DE CADA AMBIENTE
	public double showTotalFood(){
		double totalFoodKangaroos= environment1.getAmountOfFood()+environment2.getAmountOfFood()+ environment3.getAmountOfFood();
		return totalFoodKangaroos;
	}

	// METODO PARA MOSTRAR LA TENDENCIA HACIA ENFERMEDADES CARDIACAS DE LOS CANGUROS DE TODOS LOS AMBIENTES
	public String showHeartDiseaseKangaroos(){
		String msj = "";

		msj += "EL INFORME SOBRE LAS TENDENCIAS HACIA ENFERMEDADES CARDIACAS DE LOS CANGUROS DEL AMBIENTE 1 ES: \n";
		msj += environment1.heartDiseaseKangaroos() + "\n";
		msj += "EL INFORME SOBRE LAS TENDENCIAS HACIA ENFERMEDADES CARDIACAS DE LOS CANGUROS DEL AMBIENTE 2 ES: \n";
		msj += environment2.heartDiseaseKangaroos() + "\n";
		msj += "EL INFORME SOBRE LAS TENDENCIAS HACIA ENFERMEDADES CARDIACAS DE LOS CANGUROS DEL AMBIENTE 3 ES: \n";
		msj += environment3.heartDiseaseKangaroos() + "\n";
		return msj;
	}
	// METODO PARA MOSTRAR LA CANTIDAD DE AGUA DE LOS AMBIENTES 
	public String showAmountOfWaterKangaroos(){
		String msj ="";

		msj += "El registro sobre la cantidad de agua de los canguros del ambiente 1 es: \n";
		msj += environment1.calculateAmountOfWater() + "\n";
		msj += "El registro sobre la cantidad de agua de los canguros del ambiente 2 es: \n";
		msj += environment2.calculateAmountOfWater() + "\n";
		msj += "El registro sobre la cantidad de agua de los canguros del ambiente 3 es: \n";
		msj += environment3.calculateAmountOfWater() + "\n";
		return msj;
	}

	// METODO PARA MOSTRAR LA COMIDA DE CADA AMBIENTE 
	public String showFoodKEnvironment(){
		String msj = "";

		msj += "La cantidad de comida del ambiente 1 es: \n";
		msj += environment1.getAmountOfFood() + " kilogramos \n";
		msj += "La cantidad de comida del ambiente 2 es: \n";
		msj += environment2.getAmountOfFood() + " kilogramos \n";
		msj += "La cantidad de comida del ambiente 3 es: \n";
		msj += environment3.getAmountOfFood() + " kilogramos \n";
		return msj;
	}

	// METODO PARA MOSTRAR LA COMIDA TOTAL DE LA ZONA DE CANGUROS
	public String showTotalFoodPrint(){
		String msj = "";

		msj += "La cantidad total de comida de los canguros en la zona de canguros es: " + showTotalFood() + " kilogramos" ;
	return msj;
	}
	
	// METODO PARA SUMAR EL AREA DE TODOS AMBIENTE
	public double calculateAreaZoneK(){
		double totalAreaZoneK= environment1.calcularArea()+environment2.calcularArea()+environment3.calcularArea();
		return totalAreaZoneK;
	}
	// METODO PARA MOSTRAR LA SUMA DEL AREA DE TODOS LOS AMBIENTES
	public String showAreaTotalEnvironmentK(){
		String msj = "";
		msj += "El area total de los tres ambientes de los canguros es: \n";
		msj += calculateAreaZoneK() + " metros cuadrados \n";
		return msj;
	}

	// METODO PARA MOSTRAR EL AREA DE CADA AMBIENTE
	public String showAreaEnvironmentK(){
		String msj  = "";

		msj += "El area del ambiente 1 es: \n";
		msj += environment1.calcularArea() + " metros cuadrados \n";
		msj += "El area del ambiente 2 es: \n";
		msj += environment2.calcularArea() + " metros cuadrados \n";
		msj += "El area del ambiente 3 es: \n";
		msj += environment3.calcularArea() + " metros cuadrados \n";

		return msj;
	}
	
	// METODO PARA ELIMINAR UN CANGURO	
	public boolean deleteKangaroo(String name){
		boolean deleted=false;
		if(environment1.deleteKangaroo(name))
			{
				deleted=true;
			}else if(environment2.deleteKangaroo(name)){
				deleted=true;
			}else if (environment3.deleteKangaroo(name)){
				deleted=true;
			}
			return deleted;
	}
	//METODO PARA MOSTRAR EL REPORTE SOBRE LAS VACUNAS DE LOS CANGUROS
	public String showVaccinateInformation(int presentDay){
		String message = "";
		if(!environment1.VerifyDatesOfKangarooVaccines(presentDay).isEmpty()){
			message += "El reporte de la vacunacion de los canguros del ambiente 1 es: \n";
			message += environment1.VerifyDatesOfKangarooVaccines(presentDay);
		}
		if(!environment2.VerifyDatesOfKangarooVaccines(presentDay).isEmpty()){
			message += "El reporte de la vacunacion de los canguros del ambiente 2 es: \n";
			message += environment2.VerifyDatesOfKangarooVaccines(presentDay);
		}
		if(!environment3.VerifyDatesOfKangarooVaccines(presentDay).isEmpty()){
			message += "El reporte de la vacunacion de los canguros del ambiente 3 es: \n";
			message += environment3.VerifyDatesOfKangarooVaccines(presentDay);
		}
		return message;

	}
	//METODO PARA MOSTRAR LOS CANGUROS CON VOCAL AL FINAL Y AL COMIENZO DE SU NOMBRE EN CADA AMBIENTE

	public String showKangarooWithVocalInTheName(){
		String showKWithVocal = "";

		showKWithVocal += "Los canguros del ambiente 1 con vocal al comienzo y al final de su nombre son: \n";
		showKWithVocal += environment1.kangarooVocalName() + "\n";
		showKWithVocal += "Los canguros del ambiente 2 con vocal al comienzo y al final de su nombre son: \n";
		showKWithVocal += environment2.kangarooVocalName() + "\n"; 
		showKWithVocal += "Los canguros del ambiente 3 con vocal al comienzo y al final de su nombre son: \n";
		showKWithVocal += environment3.kangarooVocalName() + "\n";

		return showKWithVocal;
	}
	
	//METODO PARA AGREGAR KANGAROO
	public String addKangaroo(Kangaroo createdByTheUser, int numAmbiente){

		String msj = "";

		if(numAmbiente==1){
			msj += environment1.addKangaroo(createdByTheUser);
		}else if(numAmbiente==2){
			msj += environment2.addKangaroo(createdByTheUser);
		}else if(numAmbiente==3){
			msj += environment3.addKangaroo(createdByTheUser);
		}else{
			msj = "Digite un ambiente valido";
		}

		return msj;
	}

	//METODO PARA MOSTRAR LOS NOMBRES DE LOS CANGUROS (este lo iba a utilizar para el metodo de cambiarlos de ambiente pero no pudé) 
	public String toShowKangaroosNamesZone(){
		
		String msj = "Actualmente los canguros existentes son: \n";

		msj += "Los canguros del ambiente 1 son: \n";
		msj += environment1.toShowKangaroosNames() + "\n";
		msj += "Los canguros del ambiente 2 son: \n";
		msj += environment2.toShowKangaroosNames() + "\n";
		msj += "Los canguros del ambiente 3 son: \n";
		msj += environment3.toShowKangaroosNames() + "\n";
		return msj;
	}

	// METODO CAMBIAR CANGURO (CLONA AL CANGURO QUE SE QUIERE CAMBIAR, ASGINANDOLE SUS VALORES A UN CANGURO X, Y LUEGO LE ASIGNA LOS VALORES DEL CANGURO POR EL CUAL VA A SER CAMBIADO)
	//no está terminado, solo funciona si se quiere cambiar el canguro 1 del ambiente 1 con el canguro 1, 2 o 3 del ambiente 2

	public void changeKangaroo(String kan1,String kan2){
		if(kan1.equalsIgnoreCase(getEnvironment1().getKangaroo1().getName())){
			


			if(kan2.equalsIgnoreCase(getEnvironment1().getKangaroo1().getName())){
       			System.out.println("No se puede reemplazar un canguro por si mismo");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo2().getName())){
				System.out.println("No se puede reemplazar uno de su mismo ambiente");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo3().getName())){
				System.out.println("No se puede reemplazar uno de su mismo ambiente");



			}else if(kan2.equalsIgnoreCase(getEnvironment2().getKangaroo1().getName())){

				System.out.println("kan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName());

				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment2.getKangaroo1().getName()); 
       			environment1.getKangaroo1().setHeight(environment2.getKangaroo1().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment2.getKangaroo1().getWeight());
       			environment1.getKangaroo1().setBloodType(environment2.getKangaroo1().getBloodType());
       			environment1.getKangaroo1().setGender(environment2.getKangaroo1().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment2.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment2.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment2.getKangaroo1().getDateBirth().getYear()); 

       			environment2.getKangaroo1().setName(x.getName()); 
       			environment2.getKangaroo1().setHeight(x.getHeight()); 
       			environment2.getKangaroo1().setWeight(x.getWeight());
       			environment2.getKangaroo1().setBloodType(x.getBloodType());
       			environment2.getKangaroo1().setGender(x.getGender()); 
       			environment2.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("\n\nkan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName()+"\n\n");

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment2.getKangaroo2().getName()); 
       			environment1.getKangaroo1().setHeight(environment2.getKangaroo2().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment2.getKangaroo2().getWeight());
       			environment1.getKangaroo1().setBloodType(environment2.getKangaroo2().getBloodType());
       			environment1.getKangaroo1().setGender(environment2.getKangaroo2().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment2.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment2.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment2.getKangaroo2().getDateBirth().getYear()); 

       			environment2.getKangaroo2().setName(x.getName()); 
       			environment2.getKangaroo2().setHeight(x.getHeight()); 
       			environment2.getKangaroo2().setWeight(x.getWeight());
       			environment2.getKangaroo2().setBloodType(x.getBloodType());
       			environment2.getKangaroo2().setGender(x.getGender()); 
       			environment2.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment2.getKangaroo3().getName()); 
       			environment1.getKangaroo1().setHeight(environment2.getKangaroo3().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment2.getKangaroo3().getWeight());
       			environment1.getKangaroo1().setBloodType(environment2.getKangaroo3().getBloodType());
       			environment1.getKangaroo1().setGender(environment2.getKangaroo3().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment2.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment2.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment2.getKangaroo3().getDateBirth().getYear()); 

       			environment2.getKangaroo3().setName(x.getName()); 
       			environment2.getKangaroo3().setHeight(x.getHeight()); 
       			environment2.getKangaroo3().setWeight(x.getWeight());
       			environment2.getKangaroo3().setBloodType(x.getBloodType());
       			environment2.getKangaroo3().setGender(x.getGender()); 
       			environment2.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo1().getName())){
				System.out.print("\n\tEsta en el ambiente 3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment3.getKangaroo1().getName()); 
       			environment1.getKangaroo1().setHeight(environment3.getKangaroo1().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment3.getKangaroo1().getWeight());
       			environment1.getKangaroo1().setBloodType(environment3.getKangaroo1().getBloodType());
       			environment1.getKangaroo1().setGender(environment3.getKangaroo1().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment3.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment3.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment3.getKangaroo1().getDateBirth().getYear()); 

       			environment3.getKangaroo1().setName(x.getName()); 
       			environment3.getKangaroo1().setHeight(x.getHeight()); 
       			environment3.getKangaroo1().setWeight(x.getWeight());
       			environment3.getKangaroo1().setBloodType(x.getBloodType());
       			environment3.getKangaroo1().setGender(x.getGender()); 
       			environment3.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment3.getKangaroo2().getName()); 
       			environment1.getKangaroo1().setHeight(environment3.getKangaroo2().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment3.getKangaroo2().getWeight());
       			environment1.getKangaroo1().setBloodType(environment3.getKangaroo2().getBloodType());
       			environment1.getKangaroo1().setGender(environment3.getKangaroo2().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment3.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment3.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment3.getKangaroo2().getDateBirth().getYear()); 

       			environment3.getKangaroo2().setName(x.getName()); 
       			environment3.getKangaroo2().setHeight(x.getHeight()); 
       			environment3.getKangaroo2().setWeight(x.getWeight());
       			environment3.getKangaroo2().setBloodType(x.getBloodType());
       			environment3.getKangaroo2().setGender(x.getGender()); 
       			environment3.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo1().setName(environment3.getKangaroo3().getName()); 
       			environment1.getKangaroo1().setHeight(environment3.getKangaroo3().getHeight()); 
       			environment1.getKangaroo1().setWeight(environment3.getKangaroo3().getWeight());
       			environment1.getKangaroo1().setBloodType(environment3.getKangaroo3().getBloodType());
       			environment1.getKangaroo1().setGender(environment3.getKangaroo3().getGender()); 
       			environment1.getKangaroo1().getDateBirth().setDay(environment3.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo1().getDateBirth().setMonth(environment3.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo1().getDateBirth().setYear(environment3.getKangaroo3().getDateBirth().getYear()); 

       			environment3.getKangaroo3().setName(x.getName()); 
       			environment3.getKangaroo3().setHeight(x.getHeight()); 
       			environment3.getKangaroo3().setWeight(x.getWeight());
       			environment3.getKangaroo3().setBloodType(x.getBloodType());
       			environment3.getKangaroo3().setGender(x.getGender()); 
       			environment3.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else{
				System.out.println("No existe");
			}






		}else if (kan1.equalsIgnoreCase(getEnvironment1().getKangaroo2().getName())){
			System.out.print("\n\tEsta en el ambiente1\n");

			if(kan2.equalsIgnoreCase(getEnvironment1().getKangaroo1().getName())){
       			System.out.println("No se puede reemplazar uno de su mismo ambiente");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo2().getName())){
				System.out.println("No se puede reemplazar un canguro por si mismo");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo3().getName())){
				System.out.println("No se puede reemplazar uno de su mismo ambiente");



			}else if(kan2.equalsIgnoreCase(getEnvironment2().getKangaroo1().getName())){

				System.out.println("kan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName());

				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment2.getKangaroo1().getName()); 
       			environment1.getKangaroo2().setHeight(environment2.getKangaroo1().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment2.getKangaroo1().getWeight());
       			environment1.getKangaroo2().setBloodType(environment2.getKangaroo1().getBloodType());
       			environment1.getKangaroo2().setGender(environment2.getKangaroo1().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment2.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment2.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment2.getKangaroo1().getDateBirth().getYear()); 

       			environment2.getKangaroo1().setName(x.getName()); 
       			environment2.getKangaroo1().setHeight(x.getHeight()); 
       			environment2.getKangaroo1().setWeight(x.getWeight());
       			environment2.getKangaroo1().setBloodType(x.getBloodType());
       			environment2.getKangaroo1().setGender(x.getGender()); 
       			environment2.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("\n\nkan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName()+"\n\n");

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment2.getKangaroo2().getName()); 
       			environment1.getKangaroo2().setHeight(environment2.getKangaroo2().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment2.getKangaroo2().getWeight());
       			environment1.getKangaroo2().setBloodType(environment2.getKangaroo2().getBloodType());
       			environment1.getKangaroo2().setGender(environment2.getKangaroo2().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment2.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment2.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment2.getKangaroo2().getDateBirth().getYear()); 

       			environment2.getKangaroo2().setName(x.getName()); 
       			environment2.getKangaroo2().setHeight(x.getHeight()); 
       			environment2.getKangaroo2().setWeight(x.getWeight());
       			environment2.getKangaroo2().setBloodType(x.getBloodType());
       			environment2.getKangaroo2().setGender(x.getGender()); 
       			environment2.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment2.getKangaroo3().getName()); 
       			environment1.getKangaroo2().setHeight(environment2.getKangaroo3().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment2.getKangaroo3().getWeight());
       			environment1.getKangaroo2().setBloodType(environment2.getKangaroo3().getBloodType());
       			environment1.getKangaroo2().setGender(environment2.getKangaroo3().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment2.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment2.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment2.getKangaroo3().getDateBirth().getYear()); 

       			environment2.getKangaroo3().setName(x.getName()); 
       			environment2.getKangaroo3().setHeight(x.getHeight()); 
       			environment2.getKangaroo3().setWeight(x.getWeight());
       			environment2.getKangaroo3().setBloodType(x.getBloodType());
       			environment2.getKangaroo3().setGender(x.getGender()); 
       			environment2.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo1().getName())){
				System.out.print("\n\tEsta en el ambiente 3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo1().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo1().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo1().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo1().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo1().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo1().getDateBirth().getYear()); 

       			environment3.getKangaroo1().setName(x.getName()); 
       			environment3.getKangaroo1().setHeight(x.getHeight()); 
       			environment3.getKangaroo1().setWeight(x.getWeight());
       			environment3.getKangaroo1().setBloodType(x.getBloodType());
       			environment3.getKangaroo1().setGender(x.getGender()); 
       			environment3.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo2().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo2().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo2().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo2().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo2().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo2().getDateBirth().getYear()); 

       			environment3.getKangaroo2().setName(x.getName()); 
       			environment3.getKangaroo2().setHeight(x.getHeight()); 
       			environment3.getKangaroo2().setWeight(x.getWeight());
       			environment3.getKangaroo2().setBloodType(x.getBloodType());
       			environment3.getKangaroo2().setGender(x.getGender()); 
       			environment3.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo3().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo3().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo3().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo3().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo3().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo3().getDateBirth().getYear()); 

       			environment3.getKangaroo3().setName(x.getName()); 
       			environment3.getKangaroo3().setHeight(x.getHeight()); 
       			environment3.getKangaroo3().setWeight(x.getWeight());
       			environment3.getKangaroo3().setBloodType(x.getBloodType());
       			environment3.getKangaroo3().setGender(x.getGender()); 
       			environment3.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else{
				System.out.println("No existe");
			}



		}else if (kan1.equalsIgnoreCase(getEnvironment1().getKangaroo3().getName())){
			System.out.print("\n\tEsta en el ambiente1\n");

			if(kan2.equalsIgnoreCase(getEnvironment1().getKangaroo1().getName())){
       			System.out.println("No se puede reemplazar uno de su mismo ambiente");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo2().getName())){
				System.out.println("No se puede reemplazar uno de su mismo ambiente");
			}else if (kan2.equalsIgnoreCase(getEnvironment1().getKangaroo3().getName())){
				System.out.println("No se puede reemplazar un canguro por si mismo");



			}else if(kan2.equalsIgnoreCase(getEnvironment2().getKangaroo1().getName())){

				System.out.println("kan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName());

				Kangaroo x = new Kangaroo(environment1.getKangaroo3().getName(),environment1.getKangaroo3().getHeight(), environment1.getKangaroo3().getWeight(),environment1.getKangaroo3().getBloodType(), environment1.getKangaroo3().getGender() ,environment1.getKangaroo3().getDateBirth().getDay(), environment1.getKangaroo3().getDateBirth().getMonth(), environment1.getKangaroo3().getDateBirth().getYear());
       			environment1.getKangaroo3().setName(environment2.getKangaroo1().getName()); 
       			environment1.getKangaroo3().setHeight(environment2.getKangaroo1().getHeight()); 
       			environment1.getKangaroo3().setWeight(environment2.getKangaroo1().getWeight());
       			environment1.getKangaroo3().setBloodType(environment2.getKangaroo1().getBloodType());
       			environment1.getKangaroo3().setGender(environment2.getKangaroo1().getGender()); 
       			environment1.getKangaroo3().getDateBirth().setDay(environment2.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo3().getDateBirth().setMonth(environment2.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo3().getDateBirth().setYear(environment2.getKangaroo1().getDateBirth().getYear()); 

       			environment2.getKangaroo1().setName(x.getName()); 
       			environment2.getKangaroo1().setHeight(x.getHeight()); 
       			environment2.getKangaroo1().setWeight(x.getWeight());
       			environment2.getKangaroo1().setBloodType(x.getBloodType());
       			environment2.getKangaroo1().setGender(x.getGender()); 
       			environment2.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("\n\nkan1 "+environment1.getKangaroo1().getName());
				System.out.println("kan2 "+environment2.getKangaroo1().getName()+"\n\n");

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo3().setName(environment2.getKangaroo2().getName()); 
       			environment1.getKangaroo3().setHeight(environment2.getKangaroo2().getHeight()); 
       			environment1.getKangaroo3().setWeight(environment2.getKangaroo2().getWeight());
       			environment1.getKangaroo3().setBloodType(environment2.getKangaroo2().getBloodType());
       			environment1.getKangaroo3().setGender(environment2.getKangaroo2().getGender()); 
       			environment1.getKangaroo3().getDateBirth().setDay(environment2.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo3().getDateBirth().setMonth(environment2.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo3().getDateBirth().setYear(environment2.getKangaroo2().getDateBirth().getYear()); 

       			environment2.getKangaroo2().setName(x.getName()); 
       			environment2.getKangaroo2().setHeight(x.getHeight()); 
       			environment2.getKangaroo2().setWeight(x.getWeight());
       			environment2.getKangaroo2().setBloodType(x.getBloodType());
       			environment2.getKangaroo2().setGender(x.getGender()); 
       			environment2.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment2().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente2\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment2.getKangaroo3().getName()); 
       			environment1.getKangaroo2().setHeight(environment2.getKangaroo3().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment2.getKangaroo3().getWeight());
       			environment1.getKangaroo2().setBloodType(environment2.getKangaroo3().getBloodType());
       			environment1.getKangaroo2().setGender(environment2.getKangaroo3().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment2.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment2.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment2.getKangaroo3().getDateBirth().getYear()); 

       			environment2.getKangaroo3().setName(x.getName()); 
       			environment2.getKangaroo3().setHeight(x.getHeight()); 
       			environment2.getKangaroo3().setWeight(x.getWeight());
       			environment2.getKangaroo3().setBloodType(x.getBloodType());
       			environment2.getKangaroo3().setGender(x.getGender()); 
       			environment2.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment2.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment2.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo1().getName())){
				System.out.print("\n\tEsta en el ambiente 3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo1().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo1().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo1().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo1().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo1().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo1().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo1().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo1().getDateBirth().getYear()); 

       			environment3.getKangaroo1().setName(x.getName()); 
       			environment3.getKangaroo1().setHeight(x.getHeight()); 
       			environment3.getKangaroo1().setWeight(x.getWeight());
       			environment3.getKangaroo1().setBloodType(x.getBloodType());
       			environment3.getKangaroo1().setGender(x.getGender()); 
       			environment3.getKangaroo1().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo1().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo1().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo2().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo2().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo2().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo2().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo2().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo2().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo2().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo2().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo2().getDateBirth().getYear()); 

       			environment3.getKangaroo2().setName(x.getName()); 
       			environment3.getKangaroo2().setHeight(x.getHeight()); 
       			environment3.getKangaroo2().setWeight(x.getWeight());
       			environment3.getKangaroo2().setBloodType(x.getBloodType());
       			environment3.getKangaroo2().setGender(x.getGender()); 
       			environment3.getKangaroo2().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo2().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo2().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");


			}else if (kan2.equalsIgnoreCase(getEnvironment3().getKangaroo3().getName())){
				System.out.print("\n\tEsta en el ambiente3\n");
				Kangaroo x = new Kangaroo(environment1.getKangaroo1().getName(),environment1.getKangaroo1().getHeight(), environment1.getKangaroo1().getWeight(),environment1.getKangaroo1().getBloodType(), environment1.getKangaroo1().getGender() ,environment1.getKangaroo1().getDateBirth().getDay(), environment1.getKangaroo1().getDateBirth().getMonth(), environment1.getKangaroo1().getDateBirth().getYear());
       			environment1.getKangaroo2().setName(environment3.getKangaroo3().getName()); 
       			environment1.getKangaroo2().setHeight(environment3.getKangaroo3().getHeight()); 
       			environment1.getKangaroo2().setWeight(environment3.getKangaroo3().getWeight());
       			environment1.getKangaroo2().setBloodType(environment3.getKangaroo3().getBloodType());
       			environment1.getKangaroo2().setGender(environment3.getKangaroo3().getGender()); 
       			environment1.getKangaroo2().getDateBirth().setDay(environment3.getKangaroo3().getDateBirth().getDay());
       			environment1.getKangaroo2().getDateBirth().setMonth(environment3.getKangaroo3().getDateBirth().getMonth());
       			environment1.getKangaroo2().getDateBirth().setYear(environment3.getKangaroo3().getDateBirth().getYear()); 

       			environment3.getKangaroo3().setName(x.getName()); 
       			environment3.getKangaroo3().setHeight(x.getHeight()); 
       			environment3.getKangaroo3().setWeight(x.getWeight());
       			environment3.getKangaroo3().setBloodType(x.getBloodType());
       			environment3.getKangaroo3().setGender(x.getGender()); 
       			environment3.getKangaroo3().getDateBirth().setDay(x.getDateBirth().getDay());
       			environment3.getKangaroo3().getDateBirth().setMonth(x.getDateBirth().getMonth());
       			environment3.getKangaroo3().getDateBirth().setYear(x.getDateBirth().getYear()); 

       			System.out.println("Se pudó cambiar el canguro \n");

			}else{
				System.out.println("No existe");
			}




		}else if(kan1.equalsIgnoreCase(getEnvironment2().getKangaroo1().getName())){
			System.out.print("\n\tEsta en el ambiente 2\n");
		}else if (kan1.equalsIgnoreCase(getEnvironment2().getKangaroo2().getName())){
			System.out.print("\n\tEsta en el ambiente2\n");
		}else if (kan1.equalsIgnoreCase(getEnvironment2().getKangaroo3().getName())){
			System.out.print("\n\tEsta en el ambiente2\n");
		}else if (kan1.equalsIgnoreCase(getEnvironment3().getKangaroo1().getName())){
			System.out.print("\n\tEsta en el ambiente 3\n");
		}else if (kan1.equalsIgnoreCase(getEnvironment3().getKangaroo2().getName())){
			System.out.print("\n\tEsta en el ambiente3\n");
		}else if (kan1.equalsIgnoreCase(getEnvironment3().getKangaroo3().getName())){
			System.out.print("\n\tEsta en el ambiente3\n");
		}else{
			System.out.println("No existe");
		}
	}


}
