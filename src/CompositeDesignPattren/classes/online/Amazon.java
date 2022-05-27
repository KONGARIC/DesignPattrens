package CompositeDesignPattren.classes.online;

import CompositeDesignPattren.interfaces.BusinessModel;

public class Amazon implements BusinessModel {
    @Override
    public void revenue() {
        System.out.println("Revenue from Amazon : $250k");
    }
}