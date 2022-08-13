package ru.synergy.solidexample.srp.wrong;

import ru.synergy.solidexample.dip.MailSender;
import ru.synergy.solidexample.dip.OrderRepository;
import ru.synergy.solidexample.models.Order;

public class OrderProcessor {

    public void process(Order order){
        if (order.isValid() && save(order)){
            sendConfirmationEmail(order);
        }
    }

    private boolean save(Order order){
        MySqlConnection connection = new MySqlConnection("database.url");
        //сщхраняем заказ в базу данных

        return true;
    }

    private void sendConfirmationEmail(Order order){
        String name = order.getCustumerName();
        String email = order.getCustumerEmail();
        //шлем письмл кдиенту
    }
}
