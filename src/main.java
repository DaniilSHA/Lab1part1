public class main {
    public static void main(String[] args) {
        CountryInfo [] countries = new CountryInfo [] {
                new CountryInfo("Russia", 17.1, 146.7, "Moscow", 12.6),
                new CountryInfo("Finland", 338, 5.5, "Helsinki", 655),
                new CountryInfo("France", 643.8, 67.8, "Paris", 2.1),
                new CountryInfo("Andorra", 467, 85.4, "Andorra la Vella", 22.6),
                new CountryInfo("Singapore", 725, 5.7)
        };

        CountryInfo.printAll(countries);


    }

}
