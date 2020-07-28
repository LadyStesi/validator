package homework20;


public class IntValidator implements FabrikaValidator {

    int number;



    @Override
    public String validate() {
        if (number > 1 & number <= 10) {
            return "Valid value.";
        } else return new ValidationFailedException("Invalid value").getMessage();
    }



    public IntValidator(int massage) {
        this.number=massage;
    }
}
