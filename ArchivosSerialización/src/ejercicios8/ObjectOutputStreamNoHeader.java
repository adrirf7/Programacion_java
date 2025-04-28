package ejercicios8;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

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
