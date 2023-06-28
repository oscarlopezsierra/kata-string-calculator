# Kata String Calculator TDD

## Objetivo

Implementar una clase que nos permita realizar la suma de los números que se reciben como parámetro dentro de 
una cadena de caracteres.

## Requisitos

1. En el caso de recibir *null* o una cadena vacía, el resultado de la suma debe ser 0.
2. Cuando la cadena contiene un solo número, el resultado de la suma debe ser el mismo número.
3. Cuando la cadena contiene varios números separados por coma, el resultado de la suma debe ser la suma de todos.
4. Si alguno de los elementos separados por coma contiene uno o varios caracteres no numéricos (por ejemplo, letras), 
ese elemento equivaldrá a 0.
5. Si alguno de los elementos separados por coma está vacío, ese elemento también equivaldrá a 0.
6. La cadena puede contener un delimitador diferente al de la coma. Este delimitador se indica al principio de la
cadena de texto, precedido por dos barras inclinadas, luego el separador escogido por el usuario y finalmente otra barra
inclinada para indicar el final de la expresión (por ejemplo, para usar el punto y coma ';' como delimitador: 
"//;/1;2" -> 3). Si no se indica un delimitador, se usará por defecto la coma.

## Ejemplos

* *null* -> 0
* "" -> 0
* "1" -> 1
* "1,2" -> 3
* "1,2,3" -> 6
* "a" -> 0
* "1,a" -> 1
* "1,a,2" -> 3
* "1, 2a, 3" -> 4
* "1,,2" -> 3
* "1,a,2,,b,3a,4" -> 7
* "//;/1;2" -> 3
* "//#/1#2#5" -> 8
* "//#1,2,3" -> 5
* "//#/1#2,3#8" -> 9