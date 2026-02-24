/******************************************************************************

                          edad=int(input("¿Cúal es tu edad? : "))
                            if edad>=18:
                               print("Usted es mayor de edad")
                            else:
                              print("Usted es menor de edad")
 
*******************************************************************************/
import java.util.*;// es para que se agregen las liberias que se encuntre util
public class Main
{
	public static void main(String[] args) {
		System.out.println("¿Cual es tu edad?");//impresion
		Scanner edad = new Scanner(System.in);//creando un input
		int age = edad.nextInt();  // nextline sirve para leer strin, nextInt sirve para leer enteros, nextfloat para (decimales)
		
		if (age>=18){
		    System.out.println("Eres mayor de edad");
		}else{
		    System.out.println("Eres menor de edad");
		  
		}
		
		if (age < 10){
		    System.out.println("Aún eres un niño");
		}else{
		    if (age>=10 && age<14){
		       System.out.println("else if () res un preadolecente");
		    }else{
		        if (age>=14 && age<18){
		          System.out.println("Eres un adulto joven ");
                }else{
                   if (age>=18 && age<30){
                      System.out.println("Eres un adulto");
                       
                   } 
		    }
		    } 
		}
		
		if (age<10){System.out.println("Aún eres un niño");}
		else if (age>=14 && age<14){System.out.println("Eres un preadolecnete");}
		else if (age>=14 && age<18){ System.out.println("Eres un adolecente");}
		else if  (age>=18 && age<30){ System.out.println("Eres un adulto joven");}
		else{System.out.println("Eres un adulto");}
	    }   
        }
