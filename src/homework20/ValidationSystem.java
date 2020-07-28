package homework20;

public class ValidationSystem {
    public String chooseValidator(Object massage) {
        if (massage instanceof Integer) {
            return new IntValidator((Integer) massage).validate();
        } else if (massage instanceof String) {
            return new StringValidator((String) massage).validate();
        }
        return "Not int or String value";
    }

}


