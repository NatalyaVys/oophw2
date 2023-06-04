package oophw2;

public interface QueueBehaviour {

    void takeInQueue(people people);
    void takeOrders(people people);
    void giveOrders(people people);
    void releaseFromQueue(people people);
}