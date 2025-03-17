// Crea una funcion que convierta un numero entero a decimal

// Ejemplos

// romanoAEntero("XVIII") // 18
// romanoAEntero("CXX") // 120

romanoAEntero("LVIII")

// Mi solucion (funciona hasta el numero 58)
function romanoAEntero (arg) {
    let units = 0
    let fives = 0
    let dec = 0
    let fifth = 0
    let cents = 0;
    for (let i = 0; i < arg.length; i++) {

        if (arg[i] == 'I') {
            let j = i + 1;
            if (arg[j] == 'V') {
                units = 4;
                fives = 0;
                break;
            } else {
                units++;
            }
        }

        if (arg[i] == 'V') {
            let j = i + 1
            let k = i + 2
            if (arg[j] == 'I') {
                if (arg[k] == 'I') {
                    units = 5;
                    fives = 0;
                } else {
                    fives += 6;
                    units--;
                }
            } else {
                fives = 5;
            }
        }

        if (arg[i] == 'X') {
            let j = i - 1;
            let k = i + 2;
            if (arg[j] == 'I') {
                if (arg[k] == 'I') {
                    units = 0;
                } else {
                    dec += 9;
                    units--;
                }
            } else {
                dec += 10;
            }
        }

        if (arg[i] == 'L') {
            let j = i - 1;
            let k = i + 2;
            if (arg[j] == 'X') {
                if (arg[k] == 'I') {
                    units = 0;
                }
                dec = 40;
            } else {
                fifth += 50;
            }
        }

        if (arg[i] == 'C') {
            cents += 100;
        }
    }

    // let value = units + "" + fives + "" + dec + "" +  fifth + "" + cents;
    let value = cents + "" + fifth + "" + "" + dec + "" + fives + "" + units;
    console.log(units)
    console.log(fives)
    console.log(dec)
    console.log(fifth)
    if (arg.includes("X") && arg[0] == 0) {
        value = value.toString();
    } else if (arg.includes("X")) {
        if (arg.length > 1) {
            if (dec != 0 && dec != 1 && units == 0 && fives == 0) {
                value = value.toString();
                value = value.replaceAll("00", "");
            } else {
                value = value.toString();
                value = value.replaceAll("0", "");
            }
        } else {
            value = value.toString();
            value = value.replaceAll("00", "");
        }
    } else if (arg.includes("L")) {
        if (arg.length >= 1) {
            if (fifth != 0 && dec == 0 && fives == 0 && units == 0) {
                value = value.toString();
                value = value.replaceAll("0", "");
                value = value.concat("0");
            } else {
                value = value.toString();
                value = value.replaceAll("0", "");
            }
        }
    } else {
        value = value.toString();
        value = value.replaceAll("0", "");
    }

    console.log(value);
}

// Solución del curso
function romanoAEnteroSolucion (romano) {
    // Crear objetos con numeros romanos y sus correspondientes valores numericos
    const tablaRomanos = {
        M: 1000,
        CM: 900,
        D: 500,
        CD: 400,
        C: 100,
        XC: 90,
        L: 50,
        XL: 40,
        X: 10,
        IX: 9,
        V: 5,
        IV: 4,
        I: 1
    };

    // Crear variable para almacenar resultado
    let resultado = 0;
    // Recorrer numero romano letra a letra
    for (let i = 0; i < romano.length; i++) {
        console.log(romano[i], tablaRomanos[romano[i]]);
        // Si la letra actual es la ultima o si el valor del siguiente caracter
        // es menor o igual al del actual, entonces añadimos el valor al resultado
        if (i === romano.length - 1 || tablaRomanos[romano[i + 1]] <= tablaRomanos[romano[i]]) {
            resultado += tablaRomanos[romano[i]];
        } else {
            // Si no, restar el valor de la letra actual al resultado
            resultado -= tablaRomanos[romano[i]];
        }
    }

    // Devolver resultado
    return resultado;
}

console.log(romanoAEnteroSolucion("MMM"));