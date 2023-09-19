package converters;

import domain.Arco;
import domain.ElementoDefensor;
import domain.Escudo;
import domain.Espada;

import javax.persistence.AttributeConverter;
import java.util.ArrayList;
import java.util.List;

public class ListElementoDefensorAttributeConverter implements AttributeConverter<List<ElementoDefensor>,String> {


    public String convertToDatabaseColumn(List<ElementoDefensor> elementoDefensors) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ElementoDefensor e: elementoDefensors) {
            stringBuilder.append(e.getClass().toString());
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    public List<ElementoDefensor> convertToEntityAttribute(String s) {
        List<ElementoDefensor> elementos = new ArrayList<ElementoDefensor>();
        String[] nombresElementos = s.split(",");
        for (String x: nombresElementos) {
            if(x == "Escudo"){
                Escudo escudo = new Escudo();
                elementos.add(escudo);
            }
            if(x == "Espada"){
                Espada espada = new Espada();
                elementos.add(espada);
            }
            if(x == "Arco"){
                Arco arco = new Arco();
                elementos.add(arco);
            }
        }
        return elementos;
    }
}
