# PatronesProblema
Se necesita un objeto de tipo array, al que llamaremos para propósitos de explicacíon array A, que permita almacenar un conjunto de datos numéricos, así por cada posición del array se necesita almacenar un array de números enteros, que llamaremos B, en otras palabras, el array A contendrá varios arrays B de números enteros.
Habrán otros objetos que estarán observando al array A, el cual dentro de su estructura tendrá un número y una operación (suma, resta, etc).
Cada vez que se agruege un array B  al array A deberá hacer lo siguiente:
El array A deberá de tener algún mecanismo para obtener la suma o resta (pueden haber mas operaciones) de los elementos del array B agregado, supongamos que la suma da 4 y la resta1
Cada objeto observador que tenga el número y sea de la operación asignada, deberá escribir en consola que se ha ingresado un array con la operación y con el resultado que éste tiene. Así por ejmplo si tenemos un solo observador que tiene guardado el número 4 y tiene registrado que solo funciona para las sumas, entonces será el único que deberá escribir a consola.
Por el momento solo es necesario que quede implementado dos operaciones, pero debe quedar listo para agregar mas operaciones.

Solucion
Para la solucion del preblema hicimos una clase llamada ArrayA que va a contener un array de la clase ArrayB
para las diferentes operaciones, como vimos que se cambian lo separamos y aplicamos el patron Strategy para 
que asi mas adelante se pudieran agregar mas operaciones, para esto se  tiene que implementar la interfaz operacion,
 para los observadores aplicamos el patron Observer, que este actua al momento que cuando se agregue un array de B este 
notifique a los diferentes observadores con sus diferentes operaciones y asi pueda mostrar la solucion que cada observador
 tiene por defecto.
