package Jerarquía;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestHerencia {

	public static void main(String[] args) throws ParseException {
		/*
		 * con el método main donde se creen 2 productos frescos, 3
productos refrigerados y 5 productos congelados (2 de ellos congelados por agua, otros 2
por aire y 1 por nitrógeno) y después muestre la información de cada producto por
pantalla.
		 */
		
		
		Productos[] product=new Productos[10];
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        
		product[0]=new Frescos((formato.parse("14/02/2025")), 2, formato.parse("20/02/2000"), "Polonia");
		product[1]=new Frescos((formato.parse("01/01/2024")),1,formato.parse("20/02/2002"),"Portugal");
		
		product[2]=new Refrigerados((formato.parse("00/00/0000")),3,000232422,(formato.parse("00/00/0000")),43.3,"Rumania");
		product[3]=new Refrigerados((formato.parse("00/00/0000")),4,545434355,(formato.parse("00/00/0000")),43.3,"Alemania");
		product[4]=new Refrigerados((formato.parse("00/00/0000")),5,000254342,(formato.parse("00/00/0000")),43.3,"Rusia");
		
		product[5]=new CongeladosPorAgua((formato.parse("00/00/0000")), 6, (formato.parse("00/00/0000")), "España", -32, 80);
		product[8]=new CongeladosPorAgua((formato.parse("00/00/0000")), 7, (formato.parse("00/00/0000")), "Turkia", -43, 30);
		
		product[6]=new CongeladosPorAire((formato.parse("00/00/0000")), 8, (formato.parse("00/00/0000")), "Afganistan", -04, 03, 20, 10, 5210);
		product[9]=new CongeladosPorAire((formato.parse("00/00/0000")), 9, (formato.parse("00/00/0000")), "Marruecos", -5, 50, 520, 530, 540);
		
		product[7]=new CongeladosPorNitrogeno((formato.parse("00/00/0000")), 10, (formato.parse("00/00/0000")), "Francia", -43, "Pistola", 5);
		
		/*for(int i=0;i<product.length;i++) {
			System.out.println(product[i].toString());
		}*/
		Congelados[]vectorCongelados=new Congelados[5];
		vectorCongelados[0]=new CongeladosPorAgua((formato.parse("00/00/0000")), 6, (formato.parse("00/00/0000")), "España", -32, 80);
		vectorCongelados[1]=new CongeladosPorAgua((formato.parse("00/00/0000")), 6, (formato.parse("00/00/0000")), "España", -32, 80);
		vectorCongelados[2]=new CongeladosPorAire((formato.parse("00/00/0000")), 8, (formato.parse("00/00/0000")), "Afganistan", -04, 03, 20, 10, 5210);
		vectorCongelados[3]=new CongeladosPorAire((formato.parse("00/00/0000")), 8, (formato.parse("00/00/0000")), "Afganistan", -04, 03, 20, 10, 5210);
		vectorCongelados[4]=new CongeladosPorNitrogeno((formato.parse("00/00/0000")), 10, (formato.parse("00/00/0000")), "Francia", -43, "Pistola", 5);

		for(Congelados vecCongelados:vectorCongelados) {
			if(vecCongelados instanceof Congelados) //Comprobamos si la persona es una instancia de socio
				
				System.out.println(vectorCongelados.toString());
			}
			}
	

}
