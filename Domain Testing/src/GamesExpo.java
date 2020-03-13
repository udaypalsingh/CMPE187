/**
 * Class for Games Expo
 */
public class GamesExpo {
    //gender of the contestant
    private String gender;
    //age of contestant
    private int age;

    /**
     * Ctor of games expo
     * @param gender gender of contestant
     * @param age age of contestant
     */
    public GamesExpo(String gender, int age){
        this.gender = gender;
        this.age = age;
    }

    /**
     * Shows suitable competitions for a contestant
     * @return suitable competition for a contestant
     */
    public String showCompetitions(){
        if(gender.toLowerCase().equals("boy") &&
                (age > 7 && age <10)){
            return "Storytelling";
        }
        if(gender.toLowerCase().equals("girl") &&
                (age > 7 && age <10)){
            return "Drawing";
        }
        if(gender.toLowerCase().equals("boy") &&
                (age > 11 && age <15)){
            return "Quiz";
        }
        if(gender.toLowerCase().equals("girl") &&
                (age > 10 && age <15)){
            return "Essay Writing";
        }
        if(age < 6){
            return "Rhyming";
        }
        if(age > 20){
            return "Poetry";
        }
        return "No Competition Available";
    }
}
