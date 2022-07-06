package designpattern.templatemethod;

import java.util.StringJoiner;

public abstract class CommandBuilder {
    public String build(){
        StringJoiner sj = new StringJoiner(" ");

        sj.add("application -t");
        sj.add("300");

        sj.add("-s");
        sj.add("8080");

        sj.add(getDOption());
        sj.add(getVersion());

        return sj.toString();
    }

    protected abstract String getVersion();

    protected abstract String getDOption();
}
