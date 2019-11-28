package homework_4_Generics;

public class Main {
    public static void main(String[] args) {
        //Leagues init
        League<BaseballTeam> baseballLeague = new League<>();
        League<FootballTeam> footballLeague = new League<>();
        League<BasketballTeam> basketballLeague = new League<>();

        //Baseball teams init
        BaseballTeam baseballTeam_1 = new BaseballTeam("baseballTeam_1");
        BaseballTeam baseballTeam_2 = new BaseballTeam("baseballTeam_2");
        BaseballTeam baseballTeam_3 = new BaseballTeam("baseballTeam_3");
        BaseballTeam baseballTeam_4 = new BaseballTeam("baseballTeam_4");

        //BasketBall teams init
        BasketballTeam basketballTeam_1 = new BasketballTeam("basketballTeam_1");
        BasketballTeam basketballTeam_2 = new BasketballTeam("basketballTeam_2");
        BasketballTeam basketballTeam_3 = new BasketballTeam("basketballTeam_3");
        BasketballTeam basketballTeam_4 = new BasketballTeam("basketballTeam_4");

        //Football teams init
        FootballTeam footballTeam_1 = new FootballTeam("footballTeam_1");
        FootballTeam footballTeam_3 = new FootballTeam("footballTeam_3");
        FootballTeam footballTeam_2 = new FootballTeam("footballTeam_2");
        FootballTeam footballTeam_4 = new FootballTeam("footballTeam_4");

        footballLeague.add(footballTeam_1);
        footballLeague.add(footballTeam_2);
        footballLeague.add(footballTeam_3);
        footballLeague.add(footballTeam_4);

        footballLeague.printLeague();

        baseballLeague.add(baseballTeam_1);
        baseballLeague.add(baseballTeam_2);
        baseballLeague.add(baseballTeam_3);
        baseballLeague.add(baseballTeam_4);
        baseballLeague.add(baseballTeam_4); //Don't permites dublicate
        baseballLeague.add(baseballTeam_3);

        baseballLeague.printLeague();

        basketballLeague.add(basketballTeam_1);
        basketballLeague.add(basketballTeam_2);
        basketballLeague.add(basketballTeam_3);
    //    basketballLeague.add(baseballTeam_1); //Not accept foreign type

        basketballLeague.printLeague();

    }
}
