import java.util.Scanner;

class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Create stations
        Station SG = new Station();
        Station KC = new Station();
        Station GP = new Station();
        Station OC = new Station();

        //Stepney Green
        setName(SG,"Stepney Green");
        setToilet(SG,false);

        //King's Cross
        setName(KC, "King's Cross");
        setToilet(KC,true);
        setCost(KC,10);

        //Green Park
        setName(GP,"Green Park");
        setToilet(GP, true);
        setCost(GP,30);

        //Oxford Circus
        setName(OC,"Oxford Circus");
        setToilet(OC,false);

        System.out.print("What station do you need to know about? ");
        String station = scanner.nextLine();
        getInfo(station,SG,KC,GP,OC);
    }



    public static void getInfo(String stationName, Station SG, Station KC, Station GP, Station OC) {
        String toilet;
        if(stationName.equals("Stepney Green")) {
            if(!hasToilet(SG)) {
                toilet = " does not have a toilet";
            } else {
                toilet = " has toilet costing " + getCost(SG) + "p";
            }

            System.out.println(stationName + toilet);
        } else if(stationName.equals("King's Cross")) {
            if(!hasToilet(KC)) {
                toilet = " does not have a toilet";
            } else {
                toilet = " has toilet costing " + getCost(KC) + "p";
            }

            System.out.println(stationName + toilet);

        } else if(stationName.equals("Green Park")) {
            if (!hasToilet(GP)) {
                toilet = " does not have a toilet";
            } else {
                toilet = " has toilet costing " + getCost(GP) + "p";
            }

            System.out.println(stationName + toilet);
        } else if(stationName.equals("Oxford Circus")) {
            if (!hasToilet(OC)) {
                toilet = " does not have a toilet";
            } else {
                toilet = " has toilet costing " + getCost(OC) + "p";
            }

            System.out.println(stationName + toilet);
        } else {
            System.out.println("Is " + stationName + " a London Underground Station? Check your spelling.");
        }
    }

    //setter methods
    public static void setName(Station station, String name) {
        station.name = name;
    }

    public static void setToilet(Station station, boolean toilet) {
        station.toilet = toilet;
    }

    public static void setCost(Station station, int toilet) {
        station.cost = toilet;
    }


    // getter methods
    public static String getName(Station station) {
        return station.name;
    }

    public static boolean hasToilet(Station station) {
        return station.toilet;
    }
    public static int getCost(Station station) {
        return station.cost;
    }
}

class Station {
    String name;
    boolean toilet;
    int cost;
}
