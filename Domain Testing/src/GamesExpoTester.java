public class GamesExpoTester {
    public static void main(String[] args){
        GamesExpo expo = new GamesExpo("girl",14);
        System.out.println(expo.showCompetitions());
        GamesExpo expo1 = new GamesExpo("girl",21);
        System.out.println(expo1.showCompetitions());

    }
}
