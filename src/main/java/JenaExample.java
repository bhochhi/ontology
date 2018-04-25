
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

import java.io.InputStream;

public class JenaExample {
    // create an empty model
    Model model = ModelFactory.createDefaultModel();

    // use the FileManager to find the input file
    InputStream in = FileManager.get().open("vc-db-1.rdf");
    if (in == null) {
        throw new IllegalArgumentException("File: vc-db-1.rdf not found");
    }
    // read the RDF/XML file
    model.
    model.read(in, null);

// write it to standard out
model.write(System.out);
}
