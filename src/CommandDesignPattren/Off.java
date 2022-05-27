package CommandDesignPattren;

public class Off implements Command{
    Device device;
    public Off(Device theDevice){
        device=theDevice;
    }
    @Override
    public void execute() {
        device.off();
    }
}
