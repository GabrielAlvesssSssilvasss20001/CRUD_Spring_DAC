package ifpb.edu.br.gabriel.crud.exception;
public class ExceptionUtil {

    private ExceptionUtil() {
    }

    public static void throwExceptionIf(boolean condition, BusinessException exception) {

        if (condition) {
            throw exception;
        }
    }
}
