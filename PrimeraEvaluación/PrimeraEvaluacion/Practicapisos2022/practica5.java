package Practicapisos2022;
public class practica5 {
  public static void main(String[] args) {
    int[][] consumos = {
    		{10,4,3,8,5}, // 1ª Planta
    		{15, 23 },
    		{90},
    		{9,34,15,1},
    		{6,45,12,3},
    		{1,34,1,4},
    		{4,4,124},
    		{9,14,10,4},
    		{9,4,10,6},
    		{9,34,10,4,7,4,2} // 10ª Planta
    };

    // a) Número total de oficinas en el edificio
    int numOficinas = 0;
    for (int i = 0; i < consumos.length; i++) {
      numOficinas += consumos[i].length;
    }
    System.out.println("Número total de oficinas en el edificio: " + numOficinas);

    // b) Consumo total del edificio y de cada una de las plantas
    int consumoTotalEdificio = 0;
    int[] consumoTotalPlantas = new int[consumos.length];
    for (int i = 0; i < consumos.length; i++) {
      for (int j = 0; j < consumos[i].length; j++) {
        consumoTotalEdificio += consumos[i][j];
        consumoTotalPlantas[i] += consumos[i][j];
      }
    }
    System.out.println("Consumo total del edificio: " + consumoTotalEdificio);
    for (int i = 0; i < consumos.length; i++) {
      System.out.println("Consumo total de la planta " + (i + 1) + ": " + consumoTotalPlantas[i]);
    }

    // c) Oficina que más consume y la que menos
    int plantaOficinaMaxConsumo = 0;
    int oficinaMaxConsumo = 0;
    int maxConsumo = 0;
    int plantaOficinaMinConsumo = 0;
    int oficinaMinConsumo = 0;
    int minConsumo = Integer.MAX_VALUE;
    for (int i = 0; i < consumos.length; i++) {
      for (int j = 0; j < consumos[i].length; j++) {
        if (consumos[i][j] > maxConsumo) {
          plantaOficinaMaxConsumo = i;
          oficinaMaxConsumo = j;
          maxConsumo = consumos[i][j];
        }
        if (consumos[i][j] < minConsumo) {
          plantaOficinaMinConsumo = i;
          oficinaMinConsumo = j;
          minConsumo = consumos[i][j];
        }
      }
    }
    System.out.println("La oficina que más consume se encuentra en la planta " + (plantaOficinaMaxConsumo + 1) + " y es la oficina " + (oficinaMaxConsumo + 1));
    System.out.println("La oficina que menos consume se encuentra en la planta " + (plantaOficinaMinConsumo + 1) + " y es la oficina " + (oficinaMinConsumo + 1));
  }
}
