// Initializing variables using constructor insted of setter methods
// Overridding toString Method

class Country{
    private String name;
    private String capital;
    private int gdpPosition;
    private String pm;
    private String religion;
    private String nickName;

    Country(String name, String capital, int gdpPosition, String pm, String religion, String nickName){
        this.name = name;
        this.capital = capital;
        this.gdpPosition = gdpPosition;
        this.pm = pm;
        this.religion = religion;
        this.nickName = nickName;
    }


    public String toString(){
        return "Country[ Name:"+ name+", Capital:"+capital+", GDP Position:"+gdpPosition+", Prime Minister:"+ pm +", Main Religion:"+ religion+", Nick Name:"+ nickName+"]";
    }

}


public class Encapsuation2 {
    public static void main (String[] args){
        Country c = new Country("India", "New Delhi", 4, "Narendra Modi", "Hindu", "Bharat");
        System.out.println(c);
    }
}
