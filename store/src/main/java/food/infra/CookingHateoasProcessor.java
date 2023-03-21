package food.infra;

import food.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cooking>> {

    @Override
    public EntityModel<Cooking> process(EntityModel<Cooking> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/orderaccept")
                .withRel("orderaccept")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/orderreject")
                .withRel("orderreject")
        );

        return model;
    }
}
