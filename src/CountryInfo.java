public class CountryInfo {
    String name;
    double square;
    double population;
    String capitalName;
    double capitalPopulation;

    CountryInfo (String Na, double Sq, double Po, String caNa, double caPo) {
        name = Na;
        square = Sq;
        population = Po;
        setCapitalInfo(caNa, caPo);
    }

    CountryInfo (String Na, double Sq, double Po) {
        name = Na;
        square = Sq;
        population = Po;
    }

    String getName () {
        return name;
    }

    double getSquare () {
        return square;
    }

    double getPopulation () {
        return population;
    }

    String getCapitalName () {
        return capitalName;
    }

    double getCapitalPopulation () {
        return capitalPopulation;
    }

    double getDensity () {
        return population / square;
    }

    void setName (String setName) {
        if (setName == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else name = setName;
    }

    void setSquare (double setSquare) {
        if (setSquare <= 0) throw new IllegalArgumentException ("площадь должна быть строго больше нуля;");
        else square = setSquare;
    }

    void setPopulation (double setPopulation) {
        if (setPopulation <= 0) throw new IllegalArgumentException ("население должно быть строго больше нуля;");
        else population = setPopulation;
    }

    void setCapitalName (String setCapitalName) {
        if (setCapitalName == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else capitalName = setCapitalName;
    }

    void setCapitalPopulation (double setCapitalPopulation) {
        if (setCapitalPopulation <= 0) throw new IllegalArgumentException ("население должно быть строго больше нуля;");
        else capitalPopulation = setCapitalPopulation;
    }
    void resetCapitalIngo () {
        capitalName = null;
        capitalPopulation = 0;
    }

    void setCapitalInfo (String name, double population) {
        resetCapitalIngo();
        setCapitalName(name);
        setCapitalPopulation(population);
    }

    void print () {
        if ((capitalName != null) & (capitalPopulation != 0))
            System.out.println(name + "  " + square + "  " + population + "  " + capitalName + "  " + capitalPopulation);
        else System.out.println(name + "  " + square + "  " + population);

    }

    static void printAll (CountryInfo countries[]) {
        for (int i=0; i < countries.length; i++) {
            countries[i].print();
        }
    }
}
