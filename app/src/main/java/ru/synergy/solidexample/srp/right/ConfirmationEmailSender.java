package ru.synergy.solidexample.srp.right;

import ru.synergy.solidexample.models.Order;

public class ConfirmationEmailSender {

    public void sendConfirmationEmail(Order order){
        String name = order.getCustumerName();
        String email = order.getCustumerEmail();

        // шлём письмо клиенту
    }
}
