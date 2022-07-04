package solid.srp.nonsrp;

import solid.srp.srp.Data;

public class GuiData {
    private String data;
    public GuiData(Data data) {
        this.data = data.toString();
    }

    public GuiData(byte[] data) {

    }
}
