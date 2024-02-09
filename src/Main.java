
public class Main {
    public static void main(String[] args) {
        String polinomio = "15x^2+8x^3-3";
        String s = "";
        int j = 0;  //Contador para el vector de Strings
        char VC[] = polinomio.toCharArray();
        String VS[]= new String[VC.length];

        for (int i = 0; i < VC.length; i++) {
            if (VC[i] == '-'){
                if (VC[i + 1] == 'x') {
                    s = "-1";
                    i += 1;
                }else {
                s = s + VC[i];
                i += 1;
            }}if (Character.isDigit(VC[i])) {

                s = s + VC[i];
                //System.out.print(VC[i]);
                //Si es un digito concatenar en otro vector con el siguiente hasta que sea un signo o letra

            }
            if (VC[i] == '+'){
                if (VC[i + 1] == 'x') {
                    s = "1";
                }else {
                    s = s + VC[i + 1];
                    i += 1;
                }
            }

            if (VC[i] == '^'){
                s = s + VC[i + 1];
                VS[j] = s;
                s= "";
                i += 1;
                j += 1;

            }
            if (VC[i] == 'x') {
                VS[j] = s;
                s= "";
                j += 1;
            }if (i == VC.length - 1){
                VS[j] = s;
                j += 1;
                VS[j] = "0";
            }if (VC[i] == 'x' && i == 0){
                VS[j] = "1";
                j += 1;
            }

        }for (int i = 0; i < VS.length; i++) {
            System.out.println(VS[i]);
        }//organizar como polinomio
        int grado = 0;
        for (int i = 1;  VS[i]!= null; i += 2) {
            if (Integer.parseInt(VS[i]) > grado){
                grado = Integer.parseInt(VS[i]);



            }
        }System.out.println("El grado es: " + grado);
        int DU = grado + 1;
    }
}
