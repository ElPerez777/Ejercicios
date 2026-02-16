## 15 Tipos de datos primitivos en Java
En Java hay datos basicos, se usan para guardar valores simples, como numeros, letras, y verdadero o falso

- byte, numero entero pequeno  
- short, numero entero corto  
- int, numero entero comun  
- long, numero entero grande  
- float, numero con decimales, con menos precision  
- double, numero con decimales, con mas precision  
- char, una letra o simbolo, por ejemplo A  
- boolean, verdadero o falso

Idea sencilla, primitivo significa que es un tipo basico, no es un objeto

## 16 Control de flujo, if, else, switch, y bucles
Control de flujo significa decidir que linea se ejecuta, segun una condicion, o repetir algo varias veces

### if y else
Sirve para tomar decisiones  
Si la condicion es verdadera, entra al if, si no, entra al else

Ejemplo mental, si hay internet, descargo, si no hay, muestro mensaje

### switch
Sirve cuando comparas un valor con varias opciones  
Es como decir, si el valor es 1 haz esto, si es 2 haz esto, si no es ninguno, usa una opcion final

### Bucles, repetir
- for, repetir un numero de veces, por ejemplo de 1 a 10  
- while, repetir mientras una condicion siga siendo verdadera  
- do while, parecido a while, pero primero ejecuta una vez, y luego revisa la condicion

Regla facil, if decide, bucles repiten, switch organiza varias opciones

## 17 Por que usar nombres significativos en variables y metodos
Porque te ayuda a entender el codigo rapido, y ayuda a otras personas, y a tu yo del futuro  
Un nombre claro evita errores, y reduce la necesidad de explicar todo con comentarios

Ejemplo simple  
- mejor, totalFactura  
- peor, x

Con metodos pasa igual  
- mejor, calcularTotal  
- peor, hacerCosa

## 18 Que es POO
POO es una forma de programar, donde organizas el codigo usando objetos  
Un objeto es como una cosa del mundo real, tiene datos y acciones

Ejemplo simple, un objeto Persona puede tener nombre y edad, y puede saludar  
Asi el codigo queda mas ordenado, mas facil de mantener, y mas facil de ampliar

## 19 Los cuatro pilares de POO
Son ideas que ayudan a construir programas con objetos, de manera ordenada

- encapsulacion, proteger datos, y acceder con metodos, para evitar cambios sin control  
- abstraccion, mostrar solo lo importante, y esconder detalles que no necesitas ver  
- herencia, reutilizar codigo, una clase nueva puede partir de otra  
- polimorfismo, misma accion con resultados distintos, segun el objeto que la haga

## 20 Herencia en POO y como se usa en Java
Herencia es cuando una clase nueva toma cosas de otra, para no repetir codigo  
La clase que hereda puede usar lo que ya existe, y tambien puede agregar o cambiar partes

En Java se usa con la palabra extends  
Ejemplo mental, Animal, y luego Perro extends Animal, Perro hereda cosas basicas, y agrega ladrar

Idea facil, herencia es reutilizar, y especializar

## 21 Modificadores de acceso, y los mas comunes en Java
Los modificadores de acceso controlan quien puede usar una clase, un metodo, o una variable

Los mas comunes  
- public, se puede usar desde cualquier parte  
- private, solo se usa dentro de la misma clase  
- protected, se usa dentro del mismo paquete, y tambien en clases hijas  
- sin palabra, a veces se le dice default, se usa solo dentro del mismo paquete

Regla simple, mientras mas cerrado, mas proteges tus cosas

## 22 Variable de entorno, y por que es importante
Una variable de entorno es un valor guardado en el sistema, fuera del programa  
El programa puede leer ese valor, por ejemplo una ruta, una clave, o una configuracion

Por que es importante  
- evita escribir datos sensibles dentro del codigo  
- permite cambiar configuracion sin editar el programa  
- facilita que el mismo programa funcione en distintos computadores
