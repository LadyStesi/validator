package homework20;

import java.util.regex.Pattern;

public class StringValidator implements FabrikaValidator {
    String str;
    @Override
    public String validate (){
        if(Pattern.matches("[A-Z][a-z]*",str)){
            return "Valid value.";
        } else return new ValidationFailedException("Invalid value").getMessage();
    }


    public StringValidator(String massage) {
        this.str =massage;
    }


}
