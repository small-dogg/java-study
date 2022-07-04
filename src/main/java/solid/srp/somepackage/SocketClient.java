package solid.srp.somepackage;

import java.nio.charset.StandardCharsets;

public class SocketClient {
    public SocketClient() {
    }

    public void connect(String server, int port) {
        System.out.println(server+":"+port +" 에 연결되었습니다.");
    }

    public byte[] read() {
        return "Hello I'm Socket Server".getBytes(StandardCharsets.UTF_8);
    };
}
