public class CountryInfo {
    private String name;
    private double square;
    private double population;
    private String capitalName;
    private double capitalPopulation;

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

    public String getName () {
        return name;
    }

    public double getSquare () {
        return square;
    }

    public double getPopulation () {
        return population;
    }

    public String getCapitalName () {
        return capitalName;
    }

    public double getCapitalPopulation () {
        return capitalPopulation;
    }

    public double getDensity () {
        return population / square;
    }

    public void setName (String setName) {
        if (setName == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else name = setName;
    }

    public void setSquare (double setSquare) {
        if (setSquare <= 0) throw new IllegalArgumentException ("площадь должна быть строго больше нуля;");
        else square = setSquare;
    }

    public void setPopulation (double setPopulation) {
        if (setPopulation <= 0) throw new IllegalArgumentException ("население должно быть строго больше нуля;");
        else population = setPopulation;
    }

    public void setCapitalName (String setCapitalName) {
        if (setCapitalName == "") throw new IllegalArgumentException ("название не должно быть пустой ссылкой");
        else capitalName = setCapitalName;
    }

    public void setCapitalPopulation (double setCapitalPopulation) {
        if (setCapitalPopulation <= 0) throw new IllegalArgumentException ("население должно быть строго больше нуля;");
        else capitalPopulation = setCapitalPopulation;
    }
    public void resetCapitalIngo () {
        capitalName = null;
        capitalPopulation = 0;
    }

    public void setCapitalInfo (String name, double population) {
        resetCapitalIngo();
        setCapitalName(name);
        setCapitalPopulation(population);
    }

    public void print () {
        if ((capitalName != null) & (capitalPopulation != 0))
            System.out.println(name + ", " + square + "кв. км., " + population + "чел., " + capitalName + ", " + capitalPopulation + "чел.");
        else System.out.println(name + ", " + square + "кв. км., " + population + "чел.");

    }

    public static void printAll (CountryInfo countries[]) {
        for (int i=0; i < countries.length; i++) {
            countries[i].print();
        }
    }
}
