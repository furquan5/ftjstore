class Password{
    @java.lang.Override
    public java.lang.String toString() {
        return "Password{" +
                "number=" + number +
                ", alphabet='" + alphabet + '\'' +
                ", specialCharacter=" + specialCharacter +
                '}';
    }

    private int number;
    private String alphabet;
    private string specialCharacter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public string getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(string specialCharacter) {
        this.specialCharacter = specialCharacter;
    }


}