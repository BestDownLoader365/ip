public class ExceptionsHandle extends Exception {
    protected final int STRING_IS_NOT_INTEGER = -35019;

    public int checkIfStringIsInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return STRING_IS_NOT_INTEGER;
        }
    }

    public int getStringIsNotInteger() {
        return STRING_IS_NOT_INTEGER;
    }
}
