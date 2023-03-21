package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String orderid;

    public OrderRejected(Cooking aggregate) {
        super(aggregate);
    }

    public OrderRejected() {
        super();
    }
}
