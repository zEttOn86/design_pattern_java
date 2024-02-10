public enum Hand {

    ROCK("goo", 0),
    SCISSORS("choki", 1),
    PAPER("paa", 2);

    private String name;
    private int handvalue;

    private static Hand[] hands = {
        ROCK, SCISSORS,PAPER
    };

    private Hand(String name, int handvalue){
        this.name = name;
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue){
        return hands[handvalue];
    }

    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }

    private int fight(Hand h){
        if(this==h){
            return 0;
        }
        else if ((this.handvalue+1)%3 == h.handvalue){
            return 1;
        }
        else {
            return -1;
        }

    }
    public String toString(){
        return name;
    }

}
