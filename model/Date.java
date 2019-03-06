package model;
public class Date{
	private int day;

	private int month;

	private int year; 

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	public void setDay(int day){
		this.day=day;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setYear(int year){
		this.year=year;
	}


	//METODO PARA PASAR LA CANTIDAD DE AÑOS DESDE EL INICIO DE LA HUMANIDAD HASTA EL DIA DE NACIMIENTO DEL CANGURO A DIAS
	public int toDays(){

	return (year-1)*360 + (month-1)*30 + day;
	}
}
