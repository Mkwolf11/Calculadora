# Calculadora Marcos Cabezas Frometa
Bueno para empezar he de decir de que el proyecto ya lo habia comenzado hace bastante tiempo, lo estuve intentando hacer con gridbaglayout pero por la escasa
informacion que encontre me parecio demasiado dificil seguir desarrollando la calculadora de tal manera, por lo que finalmente me decidi por empezarla con un
borderLayout que me parece mas facil y menos estresante puesto que de este layout si que pude encontrar bastante informacion y muy diversa.

Empece el proyecto creando paneles independientes cada uno con su propio contenido menos en el textfield el cual no tiene panel, uno de los problemas que me 
dio fue que el textfied se veia muy pequeño por lo que intente buscar formas de hacer mas grande la parte norte del borderlayout pero se me dio imposible porque 
a parte de que creo que no hay forma de hacerlo, tampoco encontre informacion. Seguidamente cree los paneles con sus propios gridlayouts, empece creando los
botones uno a uno pero despues de buscar informacion me tope con muchos usuarios en foros que iban añadiendo sus botones al panel con un array y un bucle por
lo que al final me decidi a hacerlo de esa manera y ahorrarme unas cuantas lineas de codigo. Una vez los paneles creados y rellenos con sus respectivos botones
fui añadiendo los paneles y el textfield al panel principal. 
Una vez hecho lo anterios anduve toqueteando para que en el textfield no pudiera haber enytrada de datos por teclado, pero esto me quitaba el color que yo le 
habia establecido.

Luego de esto me anduve organizando para ver como empeza a hacer funcionar la calculadora, cada panel contiene un actionlistener el cual lleva a un actionevent 
con el que consigo las etiquetas de los botones, despues de esto paso al metodo ComprovadorValores el cual llama a otro metodo para comprobar si el botton pulsado
es un numero o una operacion. Si el valor introducido es un numero puedo seguir introduciendo mas y construir un numero mas grande hasta el momento en el que
el valor que yo introduzca una operacion y esto me lleva a un metodo que segun la operacion que yo haya metido me hace una cosa u otra, pero al final funciona de
la misma manera. Los valores numericos que yo introduje antes son vistos en el textfield y acontinuacion en el momento que yo introduzco un caracter no numerico
estos se guardan en una variable integer num1 creada en la clase, luego se establece un valorp que seria el valor principal el cual al final te termina mostrando el
resultado segun la operacion que hayas pulsado. A continuacion despues de meter un valor de operacion puedes volver a seguir escribiendo numeros los cuales al pulsar
el igual(=) el numero que aparece en el textfield es guardado en la variable integer num2. Finalmente en una variable integer calculo el resultado de la operacion
segun el valorp que se haya pasado y esta la paso a String mostrandola en el textfield.

Estuve intentando hacer que la calculadora tuviese operaciones mas complejas a lo intercalar operaciones ejemplo= 1+1x2 = 3
pero lo unico que conseguir que me diese 4, tuve bastantes problemas tambien a la hora de hacer la misma operacion seguida puesto q si por ejemplo sumana 1+1+1 = 3
a la hora de hacer el resto de aplicaciones no me funcionaba puesto que la manera de la que estaba haciendo el bucle para que funcionase solo me funcionaba en la 
suma y en la resta pero no en el resto de aplicaciones. Por lo que al final me decidi por presentar una calculadora que hace operaciones simples y si quieres
por ejemplo sumar mas de tres numeros o hacer mas operaciones del estilo despues de introducir el segundo numero debes pulsar el igual y al resultado hacerle
la siguiente operacion. 
