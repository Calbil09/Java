package s2java.src.TP5;

public class MessageCoder {
    String sentence;

    String encodeString(){
        String newPara = sentence.replaceAll("\\\\n", "\\(new_line\\)");
        newPara = sentence.replaceAll("\\\\n", "\\(new_line\\)");
        newPara = sentence.replaceAll("\\\\n", "\\(new_line\\)");
        newPara = sentence.replaceAll("\\\\n", "\\(new_line\\)");
        newPara = sentence.replaceAll("\\\\n", "\\(new_line\\)");
        return newPara;
    }

    String decodeString(String decodedString){

        String e1 = decodedString.replaceAll("\\(new_line\\)", "\\\\n");
        e1 = e1.replaceAll("\\(tab\\)", "\\\\t");
        e1 = e1.replaceAll("\\(slash\\)", "\\\\\\\\");
        e1 = e1.replaceAll("\\(smile\\)", "\\:\\)");
        e1 = e1.replaceAll("\\(comment_line\\)", "//");

        return e1;
    }
}
