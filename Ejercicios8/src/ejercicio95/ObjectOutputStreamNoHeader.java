package ejercicio95;
import java.io.*;

public class ObjectOutputStreamNoHeader extends ObjectOutputStream   {
	public ObjectOutputStreamNoHeader(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// No escribe el encabezado
		reset();
	}
}
