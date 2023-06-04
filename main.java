package oophw2;
//        Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди,
//        метод update – обновляет состояние магазина (принимает и отдаёт заказы)


public class main {
    public static void main(String[] args) {


        people Ivan = new people("Ivan", 32, 1L);
        people Nata = new people("Nata", 33, 2L);
        people Denis = new people("Denis", 17, 3L);

        market market = new market();
        market.acceptToMarket(Ivan);
        System.out.println(market.orderStatus(Ivan));
        market.acceptToMarket(Ivan);
        market.takeInQueue(Ivan);
        market.takeOrders(Ivan);
        System.out.println(market.orderStatus(Ivan));
        System.out.println(market.getQueueToGive());
        market.takeOrders(Nata);
        market.acceptToMarket(Nata);
        market.takeOrders(Nata);
        System.out.println(market.orderStatus(Nata));
        System.out.println(market.getQueueToGive());
        market.releaseFromMarket(Nata);
        System.out.println(market.getQueueToGive());



    }
}