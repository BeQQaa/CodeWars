package duplicate.encoder;

import java.util.HashMap;

public class DuplicateEncoder {

    public String encode(String word){
        StringBuilder builder = new StringBuilder();
        Integer number = 1;
        HashMap<String, Integer> symbolMap = new HashMap<>();
        String[] arraySymbols = word.split("");

        for (String symbol:arraySymbols) {
            symbol = symbol.toLowerCase();
            if (!symbolMap.containsKey(symbol)){
                symbolMap.put(symbol,number);
            }else {
                symbolMap.merge(symbol, number, Integer::sum);
            }
        }

        for (String symbol:arraySymbols){
            symbol = symbol.toLowerCase();
            if (symbolMap.get(symbol) > number){
                builder.append(")");
            }else {
                builder.append("(");
            }
        }

        return builder.toString();
    }
}
