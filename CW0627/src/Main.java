import Classes.Fraction;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //1
        /*Person person = new Person("name1", "date1", "0123948576", "city1", "country1", "address1");
        Person person2 = new Person("name2", "date2", "0932671283", "city2", "country2", "address2");
        person.Show();
        System.out.println("----------------");
        person2.Show();
        System.out.println("----------------");
        person.setName("newName1");
        person.Show();*/
        //2
        /*City city = new City();
        city.setName("city1");
        city.setCountry("country1");
        city.setInhabitants(17);
        city.setRegion("region1");
        city.setZipCode(78002);
        city.setPhoneCode(54033);
        city.show();*/
        //3
        /*String[] arr = new String[] { "city1", "city2", "city3" };
        Country country = new Country("country", "continent", 300, 46504, "capital", arr);
        country.show();*/
        //4
        Fraction fraction = new Fraction();
        fraction.numerator = 7;
        fraction.denominator = 25;
        fraction.show();
        Fraction fraction1 = new Fraction(5, 12);
        Fraction result = fraction.multiply(fraction1);
        Fraction result2 = fraction.plus(fraction1);
        Fraction result3 = fraction.minus(fraction1);
        Fraction result4 = fraction.divide(fraction1);
        result.show();
        result2.show();
        result3.show();
        result4.show();
    }

    public static class Person {
        String name;
        String date;
        String number;
        String city;
        String country;
        String address;

        public Person() {
        }

        public Person(String name, String date, String number, String city, String country, String address) {
            this.name = name;
            this.date = date;
            this.number = number;
            this.city = city;
            this.country = country;
            this.address = address;
        }

        public void Show() {
            System.out.println("Name: " + this.name);
            System.out.println("Date: " + this.date);
            System.out.println("Number: " + this.number);
            System.out.println("City: " + this.city);
            System.out.println("Country: " + this.country);
            System.out.println("Address: " + this.address);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
    }
    public static class City {
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRegion() {
            return region;
        }
        public void setRegion(String region) {
            this.region = region;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public int getInhabitants() {
            return inhabitants;
        }
        public void setInhabitants(int inhabitants) {
            this.inhabitants = inhabitants;
        }
        public int getZipCode() {
            return zipCode;
        }
        public void setZipCode(int zipCode) {
            this.zipCode = zipCode;
        }
        public int getPhoneCode() {
            return phoneCode;
        }
        public void setPhoneCode(int phoneCode) {
            this.phoneCode = phoneCode;
        }

        String name;
        String region;
        String country;
        int inhabitants;
        int zipCode;
        int phoneCode;

        public City() {
        }

        public City(String name, String region, String country, int inhabitants, int zipCode, int phoneCode) {
            this.name = name;
            this.region = region;
            this.country = country;
            this.inhabitants = inhabitants;
            this.zipCode = zipCode;
            this.phoneCode = phoneCode;
        }

        public void show() {
            System.out.println("Name: " + this.name);
            System.out.println("Region: " + this.region);
            System.out.println("country: " + this.country);
            System.out.println("Amount of inhabitants: " + this.inhabitants);
            System.out.println("Zip Code: " + this.zipCode);
            System.out.println("Phone code: " + this.phoneCode);
        }
    }
    public static class Country {
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getContinent() {
            return continent;
        }
        public void setContinent(String continent) {
            this.continent = continent;
        }
        public int getInhabitants() {
            return inhabitants;
        }
        public void setInhabitants(int inhabitants) {
            this.inhabitants = inhabitants;
        }
        public int getAreaCode() {
            return areaCode;
        }
        public void setAreaCode(int areaCode) {
            this.areaCode = areaCode;
        }
        public String getCapital() {
            return capital;
        }
        public void setCapital(String capital) {
            this.capital = capital;
        }
        public String[] getCities() {
            return cities;
        }
        public void setCities(String[] cities) {
            this.cities = cities;
        }

        String name;
        String continent;
        int inhabitants;
        int areaCode;
        String capital;
        String[] cities;

        public Country(String name, String cont, int inhab, int areaCode, String cap, String[] cities){
            this.name = name;
            this.continent = cont;
            inhabitants = inhab;
            this.areaCode = areaCode;
            capital = cap;
            this.cities = cities;
        }
        public void show() {
            System.out.println("Name: " + this.name);
            System.out.println("Continent: " + this.continent);
            System.out.println("Amount of inhabitants: " + this.inhabitants);
            System.out.println("Area Code: " + this.areaCode);
            System.out.println("Capital: " + this.capital);
            System.out.println("Cities:");
            for (String city: cities) {
                System.out.println(city);
            }
            System.out.println("------------------");
        }
    }
}