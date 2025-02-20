package Apoyoexamen;

	import java.util.Arrays;

	public class BoletoRandomSinRepetir {

		public static void main(String[] args) {
			int[]ArrayBoleto=new int[5];
			int numin=0, nummax=49;
			for(int i=0  ;i<ArrayBoleto.length;i++) {
				int numerorandom=(int)(Math.random()*(numin-nummax+1)+nummax);
				for(int j=0;j<ArrayBoleto.length;j++) {
					if(numerorandom==ArrayBoleto[j]) {
						numerorandom=(int)(Math.random()*(numin-nummax+1)+nummax);
					}
				}
				ArrayBoleto[i]=numerorandom;
				
			}
			System.out.println(Arrays.toString(ArrayBoleto));
		}
		}