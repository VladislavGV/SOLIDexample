package ru.synergy.solidexample.ocp;

import ru.synergy.solidexample.dip.MailSender;
import ru.synergy.solidexample.dip.OrderProcessor;
import ru.synergy.solidexample.dip.OrderRepository;
import ru.synergy.solidexample.models.Order;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    public OrderProcessorWithPreAndPostProcessing(MailSender mailSender, OrderRepository repository) {
        super(mailSender, repository);
    }

    @Override
    public void process(Order order){
        beforeProcessing();
        super.process(order);
        afterProcessing();
    }

    private void afterProcessing() {
    }

    private void beforeProcessing() {
    }


}
