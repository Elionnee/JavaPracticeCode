package appfuncs.simplefunc;

public class SimpleMathFuncs {
	   // Determina si a es divisor de b.
    public static boolean esDivisor(int a, int b){
          if ((b%a)==0) return true;
          return false;
    }

    // Devuelve el divisor positivo más pequeño que a y b tienen en común.
    public static int divPeq(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);

        int min=a < b ? a : b;

        for (int i=2; i<=min/2;i++){
            if (esDivisor(i,a) && esDivisor(i,b))
                return i;
        }

        return 1;
    }

    // Devuelve el mayor factor positivo que a y b tienen en común.
    public static int divGra(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);

        int min=a < b ? a : b;

        for (int i=min/2;i>=2;i--){
            if (esDivisor(i,a) && esDivisor(i,b))
                return i;
        }

        return 1;
    }
}
