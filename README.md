# Cajero-hashMap
Repositorio para crear un cajero automatico con HashMap

## Avances:
- Interfaz grafica con pantalla, botones(limpiar, retroceso y retirar) y tabla de billetes funcionando
- HashMap con 100 billetes por cada denominacion
- tabla llena desde el mapa
- validacion del monto (minimo 10.000 a maximo 1.000.000 y multiplos de 10)
- Distribucion de billetes con las reglas especiales
- verificacion de saldo
- actualizacion de la tabla tras cada retiro

## Pendiente(Opcional):
- rearmar el monto cuando se acaba una denominacion.

## Decisiones e interpretacion
- los montos deben ser multiplos de 10
- montos como 15.000 pasan la validacion, pero no se pueden armar con billetes, por lo que el cajero avisa que no se puede.
- para retiros desde 100.000 se arma con los billetes base (1 de 10.000, 2 de 20.000 y 1 de 50.000) y lo demás se reparte en cantidades pequeñas de billetes.
- los montos menores a 100.000 se reparten en la menor cantidad de billetes posible.
- el retiro es todo o nada, si no alcanzan los billetes no se descuenta nada.
- cuando se acaba la cantidad de una denominación, el cajero manda un mensaje de cajero con fondos insuficientes aunque hay dinero en otras denominaciones.

## Ejecucion
Copiarlo o descargarlo para abrirlo en NetBeans y ejecutar el main "Laboratorio_hashmap" para que se visualice la interfaz.
