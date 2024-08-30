import java.util.ArrayList;
import java.util.List;

class RealInternet implements Internet {
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Conectando a " + serverhost + " ... OK");
    }
}