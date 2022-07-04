package solid.srp.nonsrp;

import solid.srp.somepackage.SocketClient;
import solid.srp.somepackage.TableUI;

public class DataViewer {
    private static final String SERVER = "192.168.0.1";
    private static final int PORT = 8086;
    private TableUI tableUI;
    public void display() {
        byte[] data = loadHtml();
        updateGui(data);
    }

    public byte[] loadHtml(){
        SocketClient client = new SocketClient();
        client.connect(SERVER, PORT);
        return client.read();
    }


    private void updateGui(byte[] data){
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(byte[] data){
        // data를 파싱하여 GuiData타입으로 변환
        return new GuiData(data);
    }
}
