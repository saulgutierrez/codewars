// Dada una cadena de texto, comprobar si es un palindromo o no. No usar funciones de Javascript,
// solo estructuras de control

// Mi solucion
esPalindromo("otto")

function esPalindromo(arg) {
    console.log(typeof(arg))
    console.log(arg)
    let reverseWord = [];
    let j = 0;
    for (i = arg.length; i >= 0; i--) {
        reverseWord[j] = arg.charAt(i);
        j++;
    }

    console.log(reverseWord);
    let word = reverseWord;

    word.toString();
    console.log(word)
    console.log(typeof(word))

    const stringWord = word.toString();
    console.log(stringWord)
    stringWordStreched = stringWord.replaceAll(",", "");
    console.log(stringWordStreched);

    let band;
    if (arg === stringWordStreched) {
        band = "true";
    } else {
        band = "false";
    }

    console.log(band)
}

// Solución del curso
esPalindromaConFunciones("ana")

function esPalindromaConFunciones (palabra) {
    let invertida = palabra.split("").reverse().join("");
    console.log(invertida);
    console.log(palabra);
    if (invertida === palabra) {
        band = "true";
    } else {
        band = "false";
    }
    console.log(band);
}

esPalindromaConEstructurasDeControl("test");

// Solucion del curso con estructuras de control
function esPalindromaConEstructurasDeControl (palabra) {
    // Dividir la cadena de texto en un array de letras
    let letras = [];
    for (let i = 0; i < palabra.length; i++) {
        letras.push(palabra[i]);
    }
    // Invertir el array con un bucle
    let letrasInvertidas = [];
    for (let i = letras.length - 1; i >= 0; i--) {
        letrasInvertidas.push(letras[i]);
    }
    // Unir todas las letras del aray con un bucle y guardando el resultado con una variable
    let palabraInvertida = "";

    for (let i = 0; i < letrasInvertidas.length; i++) {
        palabraInvertida += letrasInvertidas[i];
    }
    // Devolver el resultado
    if (palabra === palabraInvertida) {
        band = "true";
    } else {
        band = "false";
    }
    console.log(band);
}