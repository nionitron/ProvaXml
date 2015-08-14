import java.io.IOException;

public class Xml2 {

	public static void main(String[] args) throws IOException {
		XMLCreator xmlCreator = new XMLCreator();
		xmlCreator.setRoot("Art");
		xmlCreator.addChildField("name", "Mona Lisa");
		xmlCreator.addChildField("artist", "Leonardo Da Vinci");
		xmlCreator.addChildField("adsa");
		xmlCreator.buildXMLPreview();
		xmlCreator.buildXMLToFile();
	}
}
