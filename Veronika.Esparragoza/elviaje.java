public class elviaje {
    public static void main(String[] args) {
        int dia;
        double clima;
        double velocidadMarco;
        double tiempoMarco;
        double distanciaMarco;
        double mono;
        double velocidadMadre;
        double tiempoMadre;
        double distanciaMadre;
        double distanciaTotal;
        double posibilidadConocerMadre;
        int limiteDias;

        limiteDias = 0;
        distanciaMadre = 350;
        dia = 0;
        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");
if(distanciaTotal > 0 ){


        dia = dia + 1;
            clima = Math.random();
            velocidadMarco = Math.random()*(15-10)+10;
            tiempoMarco = Math.random()*(10-8)+8;
            distanciaMarco = (velocidadMarco)*(tiempoMarco);
            mono = Math.random();
            velocidadMadre = Math.random()*(9-6)+6;
            tiempoMadre = Math.random()*(9-6)+6;

            System.out.println("DIA " + dia);
            if(clima <= 0.1 ){
                System.out.println("¡Ha llovido muchísimo!");
                velocidadMarco = velocidadMarco - (velocidadMarco * 0.25);
                velocidadMadre = velocidadMadre - (velocidadMadre * 0.5);
            } else if ( clima <= 0.4 ){
                System.out.println("Ha llovido un poco");
                velocidadMarco = velocidadMarco - (velocidadMarco * 0.25);
                velocidadMadre = velocidadMadre - (velocidadMadre * 0.25);
            } else {
                System.out.println("Ha hecho un buen día");
            }


            if( mono <= 0.15 ){
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                tiempoMarco = tiempoMarco - 2;
            } else if( mono <= 0.25 ){
                System.out.println("¡Amedio se cansó de tanto caminar!");
                velocidadMarco = velocidadMarco - (velocidadMarco * 0.1);
            } else if( mono <= 0.4 ){
                System.out.println("¡Tuve que buscar a Amedio porque se escapó, y despues mi mono estaba cansado de tanto jugar!");
                velocidadMarco = velocidadMarco - (velocidadMarco * 0.1);
                tiempoMarco = tiempoMarco - 2;
            }
            System.out.println("Avance " + ((double)Math.round(tiempoMarco * 100d) / 100d) + " horas a " + ((double)Math.round(velocidadMarco * 100d) / 100d) + " km/h recorriendo " + ((double)Math.round(distanciaMarco * 100d) / 100d) + " km");

            if(clima <= 0.1 ){
                System.out.println("¡A mamá le ha llovido muchísimo!");
                velocidadMadre = velocidadMadre - (velocidadMadre * 0.5);
            } else if ( clima <= 0.4 ){
                System.out.println("A mamá le ha llovido un poco");
                velocidadMadre = velocidadMadre - (velocidadMadre * 0.25);
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }

            System.out.println("Mama pudo avanzar " + ((double)Math.round(tiempoMadre * 100d) / 100d) + " horas a " + ((double)Math.round(velocidadMadre * 100d) / 100d) + " km/h recorriendo " + ((double)Math.round(distanciaMadre * 100d) / 100d) + " km");
            if(distanciaTotal<250){
                posibilidadConocerMadre = Math.random();
                if(posibilidadConocerMadre > 0.8){
                    System.out.println("Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                    distanciaMarco = distanciaMarco + 25;
                }
            }
            System.out.println("Al final del día " + dia + " la distancia entre Marco y su Madre es de " + ((double)Math.round(distanciaTotal * 100d) / 100d) + " Km");
            System.out.println("-------------------------------------");
        }
    }
}