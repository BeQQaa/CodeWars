package abbreviate.two.worlds;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    String abbrevTwoWorlds (String name){

        return String.join(".", name.split(" "))
                .replaceAll("[^A-Z-.]", "");
    }
}
