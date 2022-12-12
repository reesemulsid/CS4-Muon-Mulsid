package q2sa1muonmulsidambertherese;
/*
    Create an interface called Renewable (2pts)
    Make abstract method renew() (1pt)
    Apply the interface to Novice and GatheringQuest (2pts)
        When a Novice renews, his questCount is set to 0, and his earnings are reduced by 30 (1pt)
        When a Gathering quest is renewed, the currentGathered is set to 0 (1pt)
*/
public interface Renewable {
    abstract void renew();
}
