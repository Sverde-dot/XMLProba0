package xmlproba0;

import java.io.*;
import java.util.*;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;

public class XMLproba0 {

    public static void main(String[] args) throws IOException, XMLStreamException {
        File archivo= new File("autores.xml");
	FileWriter lectorarchivo = new FileWriter(archivo);
        
        XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(lectorarchivo); 
        
        //LISTA LARGA PARA EL EJERCICIO QUE HA DE ESTAR MAL POR COPIA Y PEGA
        //REVISAR
        writer.writeStartDocument("1.0");
        writer.writeStartElement("autores");
        writer.writeStartElement("autor");
        writer.writeAttribute("codigo", "a1");
        writer.writeStartElement("nome");
        writer.writeCharacters("Alexandre Dumas");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("El conde de montecristo");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("Los miserables");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeStartElement("autor");
        writer.writeAttribute("codigo", "a2");
        writer.writeStartElement("nome");
        writer.writeCharacters("Fiodor Dostoyevski");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("El idiota");
        writer.writeEndElement();
        writer.writeStartElement("titulo");
        writer.writeCharacters("Noches blancas");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument(); 
        writer.close();
    }
    
}
