package ghk;

public class nota {
	public static void main(String[]args) {
		double nota = 5;
		double nota2 =5;
		double nota3 =5;
		double nota4 =5;
		double media;
		double recupera = 10;
		double media2;
		{
         media = (nota + nota2 + nota3 + nota4)/4;	
         media2 = (nota + nota2 + nota3 + nota4 + recupera)/4;
         if (media >=7){
        	 System.out.println("aprovado");
         }else
         System.out.println("recuperação");
         }
         
         if(media < 7 && media2 >=7) {
        	 System.out.println("aprovado na recuperação");
         }
		}
	}
