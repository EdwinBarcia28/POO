/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;

/**
 *
 * @author Usuario
 */
public class Main {

   
    public static void main(String[] args) {
                crear();
		read();
		update();
		delete();
               
	}
	
	public static void crear() {
                DaoHotel d1 = new DaoHotel();
		Hotel hotel = new Hotel(1,"Hotel Guayaquil","Boyaca 1615 y Clemente Bayen","Guayaquil",
                        "0997009843","30 plazas","HotelGuayaquil@outlook.com","12/10/1998");		
		d1.setup();
		d1.crear(hotel);
                DaoSucursal ds = new  DaoSucursal();
		Sucursal sucu = new Sucursal(1,"9 de Octubre y Boyaca ","0994861729",
                        "VentaDeVoletos@gmail.com","30/09/1998");		
		ds.setup();
		ds.crear(sucu);
                DaoTuristas dt = new  DaoTuristas();
		Turista t1 = new Turista(1,"0951610146","Edwin","Barcia","Colinas de la Florida","0997765356",
                        "edhum28@outlook.com");		
		dt.setup();
		dt.crear(t1);

                DaoVuelos dv= new  DaoVuelos();
		Vuelos v1 = new Vuelos(1,"18/11/2019","15:00","Guayaquil","Miami",300,250);
                dv.setup();
		dv.crear(v1);
	}
	
	public static void read() {
		DaoHotel d1 = new DaoHotel();
		d1.setup();
		Hotel hotel = d1.read(1);
                DaoSucursal ds = new  DaoSucursal();
		ds.setup();
		Sucursal sucursal = ds.read(1);
                DaoVuelos dv= new  DaoVuelos();
                dv.setup();
                Vuelos v1 = dv.read(1);
                DaoTuristas dt = new  DaoTuristas();
                dt.setup();
                Turista turis = dt.read(1);
                
	}

	public static void update() {

		DaoHotel d1 = new DaoHotel();
		d1.setup();
		Hotel hotel = d1.read(1);
		hotel.setEmail("HOGuaya@Hotmail.com");
		d1.update(hotel);
                DaoSucursal ds = new  DaoSucursal();
		ds.setup();
		Sucursal sucursal = ds.read(1);
		sucursal.setFechaApertura("25/06/1990");
		ds.update(sucursal);
                DaoVuelos dv= new  DaoVuelos();
                dv.setup();
                Vuelos v1 = dv.read(1);
                v1.setHoraVuelo("17:00");
                dv.update(v1);
                DaoTuristas dt = new  DaoTuristas();
                dt.setup();
                Turista turis = dt.read(1);
                turis.setIdentificacion("094777444165");
                dt.update(turis);
	}
	
	public static void delete() {
		DaoHotel d1 = new DaoHotel();
		d1.setup();
		d1.delete(1);
                DaoSucursal ds = new  DaoSucursal();
		ds.setup();
		ds.delete(1);
                DaoTuristas dt = new  DaoTuristas();
                dt.setup();
                dt.delete(1);
                DaoVuelos dv= new  DaoVuelos();
                dv.setup();
                d1.delete(1);
	}
        
    
}
