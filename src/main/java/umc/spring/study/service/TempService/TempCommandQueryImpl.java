package umc.spring.study.service.TempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.apiPayload.code.status.ErrorStatus;
import umc.spring.study.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempCommandQueryImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
