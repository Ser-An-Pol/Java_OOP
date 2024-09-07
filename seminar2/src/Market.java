import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.printf("%s посетил(а) магазин...\n", actor.getName());
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.printf("%s - покинул(а) магазин.\n", actor.getName());
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.printf("%s сделал(а) заказ...\n", actor.getName());
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue)
            if (!actor.isMakeOrder()) actor.setMakeOrder(true);
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) actor.setTakeOrder(true);
            System.out.printf("%s получил(а) заказ...\n", actor.getName());
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> readyToQuit = new ArrayList<>();
        for (Actor actor : queue)
            if (actor.isTakeOrder()) readyToQuit.add(actor);
        releaseFromMarket(readyToQuit);
    }
}
