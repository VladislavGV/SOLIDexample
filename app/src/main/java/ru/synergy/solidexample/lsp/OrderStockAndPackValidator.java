package ru.synergy.solidexample.lsp;

import ru.synergy.solidexample.models.Item;
import ru.synergy.solidexample.models.Order;

public class OrderStockAndPackValidator extends OrderStockValidator{

    @Override
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock() || !item.isPacked()) {
                throw new IllegalStateException(
                        String.format("Order %d is not valid!", order.getId())
                );
            }

        }
        return true;
    }
}
