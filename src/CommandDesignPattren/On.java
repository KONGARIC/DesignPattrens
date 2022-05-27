package CommandDesignPattren;

public class On implements Command{
    Device device;
    public On(Device theDevice){
        device=theDevice;
    }
    @Override
    public void execute() {
        device.on();
    }
}
