package food.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class OrderRejectCommand {

    private Boolean reject;
}
