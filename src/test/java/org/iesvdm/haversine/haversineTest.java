package org.iesvdm.haversine;

public class haversineTest {
    Posicion Igualada = new Posicion(41.57879F,  1.617221F);
   Posicion Granada = new Posicion(37.176487F, -3.597929F);
    float distancia =
            Igualada.DistanciaKm(Granada);
  Assert.AreEqual(664.0D, System.Math.Round(distancia);
}
