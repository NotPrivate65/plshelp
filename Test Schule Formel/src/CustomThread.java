public class CustomThread extends Thread{

    double max = 5;
    double min = 0;

    double x;
    double y;


    public void run() {

        for(long i = 0; i >= 0; i++){

            double v = Math.random()*(max-min+1)+min;

            double l = Math.random()*(max-min+1)+min;

            x = v;
            y = l;

            double erg = x * Math.pow(y,2) - x;

            if(Math.abs(erg - 2) < 0.00000001){ //die Differenz ist kleiener als 0.0000000001

                System.out.println(erg + " " + x + " " + y);

            }
            if(Math.abs(erg - 2) < 0.0000000000001){

                System.out.println(erg + " " + x + " " + y + "    small");

            }

            if( i == 10000){

                i = 0;

            }
        }

    }
}

