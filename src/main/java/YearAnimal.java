import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class YearAnimal {
    public Map<Integer, String> animals (){
        Map<Integer, String> listOfAnimals = new HashMap<>();
        listOfAnimals.put(1, "крысы");
        listOfAnimals.put(2, "коровы");
        listOfAnimals.put(3, "тигра");
        listOfAnimals.put(4, "заяца");
        listOfAnimals.put(5, "дракона");
        listOfAnimals.put(6, "змея");
        listOfAnimals.put(7, "лошади");
        listOfAnimals.put(8, "овцы");
        listOfAnimals.put(9, "обезъяны");
        listOfAnimals.put(10, "курицы");
        listOfAnimals.put(11, "собаки");
        listOfAnimals.put(12, "свиньи");
        return listOfAnimals;
    }
}
