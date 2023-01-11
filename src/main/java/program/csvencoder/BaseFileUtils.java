package program.csvencoder;

import org.mozilla.universalchardet.UniversalDetector;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseFileUtils {

    static final String path = "C:\\Users\\sy920\\Documents\\";
    static final String[] filenames = {"test1.csv", "test2.csv", "test3.csv"};


    public static Charset findFileEncoding(File file) throws FileNotFoundException {
        Charset charset = null;
        byte[] buf = new byte[4096];

        UniversalDetector detector;
        try (
                FileInputStream fis = new FileInputStream(file);
        ) {
            detector = new UniversalDetector(null);

            int nread;
            while (((nread = fis.read(buf)) > 0 && !detector.isDone())) {
                detector.handleData(buf, 0, nread);
            }
            detector.dataEnd();

            String encoding = detector.getDetectedCharset();

            if (encoding != null) {
                charset = Charset.forName(encoding);
            } else {
                throw new IllegalArgumentException("식별할 수 없는 문자셋 입니다.");
            }
            detector.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charset;
    }

    public static void main(String[] args) throws IOException {
        for (String filename : filenames) {
            boolean isHeader = true;
            int maxRow = 0, maxCol = 0;

            File file = new File(path + filename);
            Charset charset = findFileEncoding(file);

            List<Object> list = new ArrayList<>();

            String[] header = null;
            try {
                BufferedReader br = new BufferedReader(new FileReader(file, charset));
                String line = "";
                int length = 0;
                while ((line = br.readLine()) != null) {
                    String[] split = line.split(",");
                    length = split.length;

                    if (length > maxCol) {
                        maxCol = length;
                    }

                    if (isHeader && maxRow == 0) {
                        header = (split);
                    }else{
                        list.add(Arrays.asList(split));
                    }

                    maxRow++;
                }

                System.out.println(CSVFileVo.builder()
                        .file(file)
                        .header(header)
                        .data(list)
                        .maxCol(maxCol)
                        .maxRow(maxRow));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


        }
    }
}
