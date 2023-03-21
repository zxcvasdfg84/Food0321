package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String orderid;

    public CookFinished(Cooking aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
