package oophw2;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(people people);
    void releaseFromMarket(people people);
    void update();
}