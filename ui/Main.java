package ui;
import model.*;
import java.util.Scanner;

public class Main{



	private Exhibition exhibition;
	private Scanner reader;

	public Main(){

		init();
		reader = new Scanner(System.in);
	}
	public static void main(String[] args) {

		Main m = new Main();
		m.showMenu();
	}
	

	public void showMenu(){

		int userInput = 0;

		while(userInput!=18){

			showOptions();

			userInput = reader.nextInt();
			reader.nextLine();

			if (userInput==1){
				System.out.println(exhibition.getZoneKangaroos().showKangaroosInformation());
			}else if(userInput==2){
				System.out.println(exhibition.showDragonesInformation());
			}else if(userInput==3){
				System.out.println(exhibition.getZoneKangaroos().showTotalFoodPrint());
			}else if(userInput==4){
				System.out.println(exhibition.getZoneKangaroos().showFoodKEnvironment());
			}else if(userInput==5){
				System.out.println(exhibition.getZoneKangaroos().showAreaEnvironmentK());
			}else if(userInput==6){
				System.out.println(exhibition.getZoneKangaroos().showAreaTotalEnvironmentK());
			}else if(userInput==7){
				System.out.println(exhibition.getZoneKangaroos().showBmiKEnvironment());
			}else if(userInput==8){
				System.out.println("Introduce el nombre del canguro a eliminar");
				String nombre = reader.nextLine();

				if(exhibition.getZoneKangaroos().deleteKangaroo(nombre)){
					System.out.println("El canguro ha sido eliminado exitosamente");
				}else{
					System.out.println("El nombre del canguro que ingresaste es invalido");
				} 

			}else if(userInput==9){
				System.out.println("Introduzca la fecha actual siguiendo el formato 'dd mm aaaa'");
				int day = reader.nextInt();
				int month = reader.nextInt();
				int year = reader.nextInt();
				reader.nextLine();
				int presentDay= (year-1)*360 + (month-1)*30 + day;
				System.out.println(exhibition.getZoneKangaroos().showVaccinateInformation(presentDay));

			}else if(userInput==10){
				System.out.println("Por favor digite el nombre del canguro");
				String name = reader.nextLine();

				System.out.println("Por favor digite la altura del canguro");
				double height = reader.nextDouble();
				reader.nextLine();

				System.out.println("Por favor digite el peso del canguro");
				double weight = reader.nextDouble();
				reader.nextLine();

				System.out.println("Por favor digite tipo de sangre del canguro");
				String bloodType = reader.nextLine();

				System.out.println("Por favor digite el sexo del canguro \n 1.Masculino \n 2.Femenino");
				int selection = reader.nextInt();
				reader.nextLine();

				String gender = selection ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;
				/*char gender = selection ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;*/

				System.out.println("Por favor digite el dia de nacimiento");
				int day = reader.nextInt();
				reader.nextLine();

				System.out.println("Por favor digite el mes de nacimiento");
				int month = reader.nextInt();
				reader.nextLine();

				System.out.println("Por favor digite el año de nacimiento");
				int year = reader.nextInt();
				reader.nextLine();

				Kangaroo createdByTheUser = new Kangaroo(name, height, weight, bloodType, gender, day, month, year);

				System.out.println("En que ambiente quiere agregar el canguro: ");
				System.out.println("1. Para el ambiente 1");
				System.out.println("2. Para el ambiente 2");
				System.out.println("3. Para el ambiente 3");

				int numAmbiente = reader.nextInt();
				reader.nextLine();

				System.out.println(exhibition.addKangaroo(createdByTheUser, numAmbiente));



			}else if(userInput==11){
				System.out.println(exhibition.getZoneKangaroos().showHeartDiseaseKangaroos());
			}else if (userInput==12){
				System.out.println(exhibition.getZoneDragons().alertFoodKangaroo());
				
			}else if(userInput==13){
				System.out.println(exhibition.getZoneKangaroos().showKangarooWithVocalInTheName());
			}else if(userInput==14){
				System.out.println(exhibition.getZoneKangaroos().showAmountOfWaterKangaroos());
			}else if(userInput==15){
				System.out.println(exhibition.getZoneDragons().getAmountOfWater());
			}else if(userInput==16){
				System.out.println("Digite el nombre del canguro que desea cambiar de ambiente");
				String kan1=reader.nextLine();
				System.out.println("Digite el nombre del canguro por el que sera cambiado");
				String kan2=reader.nextLine();
				exhibition.change(kan1,kan2);
			}else if(userInput==17)
				System.exit(0);
		}
	}

	public void showOptions(){

	System.out.println("Bienvenido al Zoologico de Cali");
	System.out.println("Por favor seleccione la opcion que desea");
	System.out.println("1.Para ver la informacion de los canguros");
	System.out.println("2.Para ver la informacion de los Drangones Barbados");
	System.out.println("3.Para calcular la cantidad total de alimento de los canguros en la zona");
	System.out.println("4.Para calcular la cantidad de comida que hay en cada ambiente de canguros");
	System.out.println("5.Para calcular el area de cada ambiente de canguros");
	System.out.println("6.Para calcular el area total de los ambientes de los canguros");
	System.out.println("7.Para calcular el bmi de los canguros en los ambientes");
	System.out.println("8.Para eliminar un canguro");
	System.out.println("9.Para ver el registro sobre la vacuna de los canguros");
	System.out.println("10.Para agregar un canguro nuevo");
	System.out.println("11.Para ver el informe sobre las enfermedades cardiacas de los canguros");
	System.out.println("12.Para notificar a los biologos");
	System.out.println("13.Para mostrar el area de los ambientes");
	System.out.println("14.Para calcular la cantidad de agua de los canguros");
	System.out.println("15.Para calcular la cantidad de agua de los dragones barbados");
	System.out.println("\t16. cambiar un canguro de ambiente");
	System.out.println("17.Para salir");



	}

	public void init(){

		exhibition = new Exhibition("Australia, donde el agua es oro", 1500.0, new ZoneK( 164.8, new EnvironmentK(1, new Kangaroo("Tony", 2.5, 20.0, /*2.5*/ "A", "M", 19, 12, 2000), new Kangaroo("Larry", 2.3, 20.0, /*2.3*/ "A", "F", 20, 2, 1997), new Kangaroo("Jesse", 2.3, 20.0, /*3.31*/ "A", "F", 3, 1, 1972)), new EnvironmentK(1, new Kangaroo("Walter", 2.3, 30.0, /*4.8,*/ "A", "M", 25, 5, 2005), new Kangaroo("Skyler", 2.3, 30.0, /*5.67,*/ "A", "F", 2, 2, 2002), new Kangaroo("Marie", 2.1, 30.0, /*6.8,*/ "A", "F", 12, 12, 2012)), new EnvironmentK( 1, new Kangaroo("Hank", 2.3, 50.0, /*9.45,*/ "A", "M", 4, 4, 2004), new Kangaroo("Gus", 2.5, 50.0, /*8.0,*/ "A", "M", 3, 3, 2003), new Kangaroo("Jane", 2.4, 50.0, /*8.68,*/ "A", "F", 1, 1, 2001))), new ZoneD(4.0, 36.0, new BeardedDragon("Flynn", 'M', "A", 30.0, 1.2, /*20.83,*/ 19, 1, 2000), new BeardedDragon("Saul", 'M', "A", 20.0, /*1.1,*/ 16.53, 16, 7, 1996)));
	}


}