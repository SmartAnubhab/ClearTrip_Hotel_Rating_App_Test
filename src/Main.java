import java.util.*;

/**
 * This folowing java code using jdk 18
 */

public class Main {
    public static void main(String[] args){
        System.out.print("hello, Welcome to clear trip: ");
        /**
         * Following is a hotel rating app with command line interface
         * list of premium hotels
         * THE OMNIA: Zermatt, Switzerland.
         * Kayakapi Premium Caves: Cappadocia; Urgup, Turkey.
         * Six Senses Laamu: Olhuveli Island, Maldives.
         * Hamanasi Adventure and Dive Resort: Hopkins, Belize.
         * Padma Resort Ubud: Payangan, Indonesia.
         * BLESS Hotel Madrid: Madrid, Spain.
         */

        //list of hotels.
        Set<Hotels> premiumHotels=new HashSet<>();
        premiumHotels.add(new Hotels("Premium","THE OMNIA",4));
        premiumHotels.add(new Hotels("Premium","Kayakapi Premium Caves",3));
        premiumHotels.add(new Hotels("Premium","Hamanasi Adventure and Dive Resort",5));
        premiumHotels.add(new Hotels("Premium","Taj Hotel",5));

        List<Hotels> localHotels=new ArrayList<>();
        localHotels.add(new Hotels("Local","Padma Resort Ubud",2));
        localHotels.add(new Hotels("Local","BLESS Hotel Madrid",1));



        System.out.println("Plese enter your name");
        MySession s1=new MySession((HashSet<Hotels>) premiumHotels, (ArrayList<Hotels>) localHotels);
        s1.mySession();


        //under testing -->


    }
}

