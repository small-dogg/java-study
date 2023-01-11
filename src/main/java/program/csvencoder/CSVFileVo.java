package program.csvencoder;


import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.File;
import java.util.List;

@SuperBuilder
@ToString
public class CSVFileVo {
    private File file;
    private int maxRow;
    private int maxCol;
    private String[] header;
    private List<Object> data;
}
