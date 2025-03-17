// Crea una función a la cual le pase un array de numeros y un numero que será el resultado de la suma
// de dos de los valores

// Ejemplos:
// sumarDos([3, 7, 8, 2], 10) // [3, 7]
// sumarDos([4, 5, 9, 1], 10) // [9, 1]
// sumarDos([1, 2, 3, 4], 5) // [2, 3]

// Mi solucion
sumarDos([4, 5, 9, 1], 10)

function sumarDos(args, arg) {
    var result = [];
    for (var i = 0; i < args.length - 1; i++) {
        for (var j = i+1; j < args.length; j++) {
            // Sumamos el numero evaluado con el inmediato siguiente
            result[i] = args[i] + args[j];
            // Resultados de cada suma
            console.log(result[i]);
            // Si el resultado de alguna suma, es igual, al numero que pasamos como argumento
            // el cual es el resultado que se esta buscando, mmostramos los posibles pares de numeros
            // que resulven la suma
            if (result[i] === arg) {
                console.log(args[i],  args[j]);
                break;
            }
             
        }
    }
}

// Solución del curso
function sumarDos1(numeros, resultado) {
    // Recorrer el array de números
    for (let i = 0; i < numeros.length; i++) {
        console.log(numeros[i]);
        let primerNumero = numeros[i]
        // Calculo, para sacar el segundo numero para devolver
        let segundoNumero = resultado - primerNumero;

        console.log(segundoNumero);

        // Comprueba si dentro de un array, existe un elemento
        console.log(numeros.includes(segundoNumero))

        // Comprobar si existe un segundo numero en el array que sumado al actual sea igual al resultado
        // esperado y comprobar también que la variable segundoNumero el valor es distinto al numero
        // actual que estoy recorriendo
        if (numeros.includes(segundoNumero) && segundoNumero != primerNumero) {
            // Si se cumple la condición, devolver un array con el numero actual y el segundoNumero que he 
            // calculado
            return([primerNumero, segundoNumero])
        }
    }
}

console.log(sumarDos1([4, 5, 9, 1], 10));