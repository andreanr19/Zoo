package model;
public class Exhibition{
//Atributos
	private String name; 
	private double area;

// Relaciones
	private ZoneK zoneKangaroos;
	private ZoneD zoneDragons;

//constructor
	public Exhibition(String name, double area, ZoneK zoneKangaroos, ZoneD zoneDragons){
		this.name=name;
		this.area=area;
		this.zoneKangaroos=zoneKangaroos;
		this.zoneDragons=zoneDragons;
	}
//métodos gets y sets
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;

	}
	public double getArea(){
		return area;
	}
	public void setArea(double area){
		this.area=area;
	}
	public ZoneK getZoneKangaroos(){
		return zoneKangaroos;
	}
	public void setZoneKangaroos(ZoneK zoneKangaroos){
		this.zoneKangaroos=zoneKangaroos;
	}
	public ZoneD getZoneDragons(){
		return zoneDragons;
	}
	public void setZoneDragons(ZoneD zoneDragons){
		this.zoneDragons=zoneDragons;
	}



	//METODO PARA MOSTRAR LA INFORMACION DE LOS DRAGONES
	public String showDragonesInformation(){
		String msj = "";

		msj += "Los dragones de la zona son: \n";
		msj += zoneDragons.showDragons() + "\n";
		return msj;
	}

	//METODO PARA AGREGAR KANGAROO
	public String addKangaroo(Kangaroo createdByTheUser, int numAmbiente){

		String msj = "";

		msj += zoneKangaroos.addKangaroo(createdByTheUser, numAmbiente);


		return msj;
	}
	public void change(String nombre,String nombre2){
		zoneKangaroos.changeKangaroo(nombre,nombre2);
	}

}
