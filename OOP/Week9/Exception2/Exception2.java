import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {
    /**
     * nullPointer exception.
     */
    public void nullPointerEx() throws NullPointerException {
        String s = null;
        if (s.equals("NULL")) {
            throw new NullPointerException();
        }
    }

    /**
     * catch nullPointer.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException n) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * arrayIndex exception.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[1];
        if (a[10] == 10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * catch arrayIndex.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException arr) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * arithmetic exception.
     */
    public void arithmeticEx() throws ArithmeticException {
        int value = 1 / 0;
        if (value == 1) {
            throw new ArithmeticException();
        }
    }

    /**
     * catch arithmetic.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException a) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * fileNotFound exception.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("oop.png");
        FileReader fileReader = new FileReader(file);
        if (fileReader.toString().equals("oop.png")) {
            throw new FileNotFoundException();
        }
    }

    /**
     * catch fileNotFound.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException f) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * IO exception.
     */
    public void ioEx() throws IOException {
        File file = new File("oop.png");
        FileReader fileReader = new FileReader(file);
        if (fileReader.toString().equals("oop.png")) {
            throw new IOException();
        }
    }

    /**
     * catch IO.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

}