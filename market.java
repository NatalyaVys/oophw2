package oophw2;

import java.util.ArrayList;
import java.util.List;

import oophw2.people;

public class market implements MarketBehaviour, QueueBehaviour {

    private final List<people> QueueToTake;
    private final List<people> QueueToGive;

    public List<people> getQueueToTake() {
        return QueueToTake;
    }

    public List<people> getQueueToGive() {
        return QueueToGive;
    }

    public market() {
        QueueToTake = new ArrayList<>();
        QueueToGive = new ArrayList<>();
    }


    @Override
    public void acceptToMarket(people people) { // Войти в магазин, добавляет в очередь
        if (!QueueToTake.contains(people)){
            QueueToTake.add(people);}
        else System.out.println(people.getName() + " уже находится в очереди");

    }

    @Override
    public void releaseFromMarket(people people) { // Выйти из магазина, автоматически закрыть заказ, выйти из очереди
        if (QueueToTake.contains(people)){
            QueueToTake.remove(people);}
        if (QueueToGive.contains(people)){
            QueueToGive.remove(people);}
        else System.out.println("Вас нет в очереди");
    }

    @Override
    public void update() {// обновляет статус

    }

    @Override
    public void takeInQueue(people people) { // Добавляем актора в очередь
        acceptToMarket(people);
    }

    @Override
    public void takeOrders(people people) { // актор сделал заказ

        if (!QueueToTake.contains(people)){
            System.out.println("Вы не можете сделать заказ. Сначала необходимо зайти в магазин");
        }
        else {
        System.out.println(String.format("Actor %s, %s, %s take order", people.getName(), people.getAge(), people.getId()));
        QueueToGive.add(people);
        QueueToTake.remove(people);}

    }

    @Override
    public void giveOrders(people people) { // актор забрал заказ и вышел из очереди

        if (!QueueToGive.contains(people)) {
            System.out.println("Вы не можете забрать заказ. Необходимо сначала сделать заказ.");
        } else {
            System.out.println(String.format("Actor %s, %s, %s make order", people.getName(), people.getAge(), people.getId()));
            QueueToGive.remove(people);
        }
    }



    @Override
    public void releaseFromQueue(people people) {// убирает актора из очереди и из магазина
        releaseFromMarket(people);
    }

    public String orderStatus(people people) {
        if (QueueToTake.contains(people)) {
            return people.getName() + " находится в очереди сделать заказ";
        }
        if (QueueToGive.contains(people)) {
            return people.getName() + " находится в очереди на получение заказа";
        }
        return people.getName() + " не присоединился к очереди или уже получил заказ";
    }
}



