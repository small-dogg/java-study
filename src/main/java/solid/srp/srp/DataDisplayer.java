package solid.srp.srp;

import solid.srp.nonsrp.GuiData;
import solid.srp.somepackage.TableUI;

public class DataDisplayer {

    private TableUI tableUI;

    public void display(){
        DataLoader dataLoader = new DataLoader();
        Data data = dataLoader.loadHtml();
        updateGui(data);
    }

    private void updateGui(Data data){
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(Data data){
        // data를 파싱하여 GuiData타입으로 변환
        return new GuiData(data);
    }
}
