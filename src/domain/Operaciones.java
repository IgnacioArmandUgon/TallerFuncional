package domain;

import java.util.function.BiFunction;

public class Operaciones {

    /** Función que devuelve la suma de dos numeros */
    BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a+b;

    /** Función que devuelve la resta de dos numeros */
    BiFunction<Integer, Integer, Integer> restar = (a, b) -> a-b;

    /** Función que devuelve el producto de dos numeros */
    BiFunction<Integer, Integer, Integer> multiplicar = (a,b) -> {
            if( a == 1 ) return  a;
            if( b == 0 ) return 0;
            if( b < 0 ) return this.multiplicar.apply(a, b) * -1;
            return a + this.multiplicar.apply( a, restar.apply( b, 1 ) );
        };
    /** Función que devuelve la división de dos numeros */
    BiFunction<Integer, Integer, Integer> dividir = ( a, b ) -> {
            if( restar.apply( a, b ) < 0 ) return 0;
            return 1 + this.dividir.apply( restar.apply(a, b ), b );
        };

}
