package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str);
            encodedString.append("π");
        }

        return encodedString.toString();
    }

    public List<String> decode(String s) {
        // -1 parameter ensures that trailing empty strings are also included in the resulting array.
        String[] decodedString = s.split("π", -1);

        // it excludes the last element from the list because of the delimiter present at the end of the encoded string.
        return new ArrayList<>(Arrays.asList(decodedString).subList(0, decodedString.length - 1));
    }

}
