package utils;

import java.util.Random;

public class MatematicaUtils {
    public static Integer numeroRandomico(Integer limite) {
        return new Random().nextInt(limite) + 1;
    }

    public static Double raizQuadrada(Double valor) {
        return Math.sqrt(valor);
    }
}
