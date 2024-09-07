public interface ActorBehaviour {
    /**
     * Сделать заказ
     * @param makeOrder - создан ли заказ
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Получить заказ
     */
    void setTakeOrder(boolean takeOrder);

    /**
     *
     * @return true - если заказ создан
     */
    boolean isMakeOrder();

    /**
     * @return true - если заказ получен
     */
    boolean isTakeOrder();
}
