package umc.spring.study.exception.handler;

import umc.spring.study.apiPayload.code.BaseErrorCode;
import umc.spring.study.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
