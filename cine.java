class cine {
   public static void maiin(String [] argument){
      System.out.println("A que tipo de funcion desea ingresar? EN (2D o 3D)");
	  String funcion = System.console().readLine();
	  
	  System.out.println("Cual ubicacion desea?");
	  String ubicacion = System.console().readLine();
	  
	  System.out.println("que cantidad de boletas desea?");
	  int boletas = interger.parseint(System.console().readLine());
	  
	  int gafas = 0;
	  if (funcion.equals("3d")){
	  
	        do{
			  String.ount.println("Que cantidad de gafas desea?");
			  gafas = interger.paseint(System.console().readLine());
			} while(gafas>boletas);
	    }
	  
	  
	  int cotoBoletas = 0;
       if (funcion.equals("2D")){
	       if (ubicacion.equals("preferencial")){
	              costoBoleta = 11000;
			}else{  
		           costoBoleta = 8000;
			    }   
	    }else{
              if (ubicacion.equals("preferencial")){
                   costoBoleta = 15000; 
                }else{
                    costoBoleta = 12000;
                }
        }
        
		int costoTotalBoletas = bolteas * costoBoletas;
		int costoGafas = gafas * 3000;
		int costoTotal = costoTotalBoletas + costoGafas;
		
		System.out.print("Cosoto total del cine a cancelar");
		String outprintln; costoTotal;
    }
 }	
