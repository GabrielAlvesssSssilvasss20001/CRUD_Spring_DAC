package ifpb.edu.br.gabriel.crud.exception;

import org.springframework.http.HttpStatus;

public class GameNotFoundException extends BusinessException {

    private static final String MESSAGE = "Imovel não encontrado";

    public GameNotFoundException() {
        super.setHttpStatusCode(HttpStatus.BAD_REQUEST);
        super.setDescription(MESSAGE);
        super.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
        super.setMessage(MESSAGE);
    }
}