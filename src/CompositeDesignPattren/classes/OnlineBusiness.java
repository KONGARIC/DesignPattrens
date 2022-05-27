package CompositeDesignPattren.classes;

import CompositeDesignPattren.classes.online.Amazon;
import CompositeDesignPattren.classes.online.Instagram;
import CompositeDesignPattren.interfaces.BusinessModel;

import java.util.ArrayList;
import java.util.List;

public class OnlineBusiness implements BusinessModel {




    List<BusinessModel> models=new ArrayList<>();

    public void addBusinessModel(BusinessModel businessModel)
    {
        models.add(businessModel);
    }
    public void removeBusinessModel(BusinessModel businessModel)
    {
        models.remove(businessModel);
    }


    @Override
    public void revenue() {
        for(BusinessModel model:models)
        {
            model.revenue();
        }

    }
}
