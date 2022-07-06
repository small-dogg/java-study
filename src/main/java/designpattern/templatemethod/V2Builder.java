package designpattern.templatemethod;

public class V2Builder extends CommandBuilder{
    @Override
    public String getVersion() {
        return "-v v2";
    }

    @Override
    protected String getDOption() {
        return "-d upgrade";
    }
}
