package designpattern.decorator.fileout;

public class EncryptionOut extends Decorator{

    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptedData = encrypt(data);
        super.doDelegate(encryptedData);
    }

    private byte[] encrypt(byte[] data) {
        //암호어쩌구
        return data;
    }
}
