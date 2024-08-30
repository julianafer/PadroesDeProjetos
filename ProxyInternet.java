import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet {
    private Internet realInternet = new RealInternet();
    private static List<String> blockedSites;

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("www.youtube.com");
        blockedSites.add("www.facebook.com");
        blockedSites.add("www.instagram.com");
    }

    public void connectTo(String serverhost) throws Exception {
        if (blockedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}