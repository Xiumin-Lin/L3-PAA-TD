package up.mi.td04.ex2and3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class GrepReader extends BufferedReader {
	public GrepReader(Reader in) {
		super(in);
	}

	@Override
	public String readLine() throws IOException{
		return "";
	}
}
