public abstract class Actor implements ActorBehaviour{
    /**
     * Имя актора
     */
    protected String name;
    /**
     * Состояние готовности сделать заказ
     */
    protected boolean isMakeOrder;
    /**
     * Факт получения заказа
     */
    protected boolean isTakeOrder;

    protected Actor(String name) {
        this.name = name;
    }

    /**
     * @return name: имя актора
     */
    public abstract String getName();

    public abstract void setName(String name);

    public abstract void setMakeOrder(boolean makeOrder);

    public abstract void setTakeOrder(boolean takeOrder);
}
