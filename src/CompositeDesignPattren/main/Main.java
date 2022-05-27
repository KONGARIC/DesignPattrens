package CompositeDesignPattren.main;

import CompositeDesignPattren.classes.Business;
import CompositeDesignPattren.classes.OfflineBusiness;
import CompositeDesignPattren.classes.OnlineBusiness;
import CompositeDesignPattren.classes.online.Amazon;
import CompositeDesignPattren.classes.online.Instagram;
import CompositeDesignPattren.interfaces.BusinessModel;

public class Main {
    public static void main(String[] arg)
    {





        BusinessModel amazon=new Amazon();
        BusinessModel instagram=new Instagram();

        OnlineBusiness onlineBusiness=new OnlineBusiness();
        onlineBusiness.addBusinessModel(amazon);
        onlineBusiness.addBusinessModel(instagram);


        BusinessModel offlineBusiness=new OfflineBusiness();


        Business business=new Business();
        business.addBusinessModel(onlineBusiness);
        business.addBusinessModel(offlineBusiness);
        business.revenue();


    }
}
