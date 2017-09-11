# callcenter
Ejercicio tecnico almundo.com

![alt text](https://github.com/gylopezgiles/callcenter/blob/master/callcenter.png)

La solucion posee una clase dispatcher la cual encola todas las llamadas entrantes en onHoldCalls (Solucion a mas de 10 llamadas y empleados no disponibles para atenderlas). Dispatcher posee un hilo el cual corre mientras haya llamadas encoladas, y las asigna a los empleados disponibles, respetando la prioridad de las llamadas y el orden de los empleados que deben atenderlas (operadores primero, en caso de no haber operadores disponibles las tomaran los supervisores y en caso de no haber supervisores disponibles las toman los directores).
Los empleados que estan atendiendo una llamada pasan al mapa employeersOnCall, momentaneamente. Cuando la llamada finaliza los empleados vuelven a la cola de empleados disponibles "employeers".

Los tests lanzan las llamadas correspondientes pero no encontre una forma de realizar un assert para poder verificar el funcionamiento. Sin embargo realice las pruebas de forma manual utilizando el main y la solucion cumple con todos los requerimientos.
