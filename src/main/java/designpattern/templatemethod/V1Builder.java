package designpattern.templatemethod;

public class V1Builder extends CommandBuilder{
    @Override
    public String getVersion() {
        return "-v v1";
    }

    @Override
    protected String getDOption() {
        return "-d simple";
    }
}
