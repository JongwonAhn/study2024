package hello.coree.order;

public interface OrderService {

    Order createOrder(Long Member, String itemName, int itemPrice);
}
