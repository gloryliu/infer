package java.io;

import com.facebook.infer.models.InferBuiltins;
import com.facebook.infer.models.InferUndefined;

public abstract class PipedWriter extends Writer {

    private PipedReader destination;
    private boolean isClosed;

    private void init() throws IOException {
        InferUndefined.can_throw_ioexception_void();
        this.destination = new PipedReader();
        InferBuiltins.__set_file_attribute(this.destination);
    }

    public PipedWriter() {
    }

    public PipedWriter(PipedReader snk) throws IOException {
        init();
    }

    public void connect(PipedReader snk) throws IOException {
        init();
    }

    public Writer append(char c) throws IOException {
        InferUndefined.can_throw_ioexception_void();
        return this;
    }

    public Writer append(CharSequence csq) throws IOException {
        InferUndefined.can_throw_ioexception_void();
        return this;
    }

    public Writer append(CharSequence csq, int start, int end)
            throws IOException {
        InferUndefined.can_throw_ioexception_void();
        return this;
    }

    public void flush() throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(char cbuf[]) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(char cbuf[], int off, int len) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(int c) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(String str) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(String str, int off, int len) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void close() throws IOException {
        InferBuiltins.__set_mem_attribute(this.destination);
        InferUndefined.can_throw_ioexception_void();
    }

}
