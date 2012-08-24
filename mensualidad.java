 class mensualidad{
        public static void main(String[]arguments){
		    double mensualidad1=8.0;
			double mensualidad2=9.5;
			double horasTrabajadas;
			System.out.println("porfavor digite la sifra de la cantidad horas trabajadas");
			horasTrabajadas = Double.prseDauble(System.console().readline());
			if (horasTrabajadas>39);{
			    System.out.println("total horas trabajadas ha pagar"+(mensualidad2 * horasTrabajadas));
			} else if
			      (horasTrabajadas<39);{
				    System.out.println("total horas trabajadas a pagar"+(mensualidad1 * horasTrabajadas));  
			    }
			if (horasTrabajadas>60);{
			    System.out.println("las horas trabajadas q han sido dijitadas no corresponde, porfavor digite menos horas");
			}
		}	
	}	