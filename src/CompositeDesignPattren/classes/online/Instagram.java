package CompositeDesignPattren.classes.online;

import CompositeDesignPattren.interfaces.BusinessModel;

public class Instagram implements BusinessModel {
    @Override
    public void revenue() {
        System.out.println("Revenue from Instagram Page : $150k");
    }
}
