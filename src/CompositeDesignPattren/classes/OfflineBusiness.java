package CompositeDesignPattren.classes;

import CompositeDesignPattren.interfaces.BusinessModel;

public class OfflineBusiness implements BusinessModel {
    @Override
    public void revenue() {
        System.out.println("Revenue from Offline stores : $200k");
    }
}
