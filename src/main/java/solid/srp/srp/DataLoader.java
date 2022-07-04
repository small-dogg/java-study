package solid.srp.srp;

import solid.srp.somepackage.SocketClient;

public class DataLoader {
    private static final String SERVER = "192.168.0.1";
    private static final int PORT = 8086;

    public Data loadHtml(){
        SocketClient client = new SocketClient();
        client.connect(SERVER, PORT);
        return new ByteData(client.read());
    }

}
