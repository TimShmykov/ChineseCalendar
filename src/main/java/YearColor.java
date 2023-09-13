import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class YearColor {
    public Map<Integer, String> colors (){
        Map<Integer, String> listOfColors = new HashMap<>();
        listOfColors.put(1, "зелёной");
        listOfColors.put(2, "красной");
        listOfColors.put(3, "желтой");
        listOfColors.put(4, "белой");
        listOfColors.put(5, "черной");
        return listOfColors;
    }
}
