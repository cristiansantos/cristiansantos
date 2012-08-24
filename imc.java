  class IMC{
        public static void main(String[] argument){
		    System.out.println("Porfavor responda las siguientes preguntas");
			system.out.println("Cual es su Nombre?");
			    String nombre = System.console().readLine();
			System.out.println("Cual es su peso?");
            double peso = Double.parseDoble(System.console().readLine());
			system.out.println("cual es su altura?");
			double altura = Double.parseDouble(System.console().readLine());
			double imc = peso/(altura * altura);
			if (imc < 15.50){
			   System.out.println("se encuentra en infrapeso");
			}
			if (imc<16.00){
			   System.out.println("se esncuentra en delgadez severa"); 
			}   
			if (imc >= 16.00 && imc<16.99);{
			   System.out.println("se encuentra en delgadez moderada");
			}   
			if (imc >=17.00 && imc<18.49);{
			   System.out.println("se encuentra delgado");
			}   
			if (imc >=18.5 && imc<24.99);{
			   System.out.println("esta normal");
			} 
			if (imc >= 25.00);{
			   System.out.println("tiene sobrepeso"); 
			}   
			if (imc >=25.00 && imc<=29.99);{
			   System.out.println("sufre de preobeso");
			}   
			if (imc >=30.00);{
			   System.out.println("sufre de obesidad");
            }			   
			if (imc >=30.00 && imc<=34.99);{
			   System.out.println("es obeso tipo 1");
            } 			   
			if (imc >=35.00 && imc<=39.99);{
			   System.out.println("es obeso tipo 2");
			}
			if (imc>=40.00);{
			   System.out.println("es obeso tipo 3");
			}   
		}
	}	