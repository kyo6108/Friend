package check;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vo.ApiResultVo;

import java.util.Map;

@Service
public class ApiCheckMod {
    public void checkInitParameter(ApiResultVo apiResultVo) {
        String method = apiResultVo.getRequestMethod();
        String url = apiResultVo.getRequestUrl();
        Map<String,Object> requestBody = apiResultVo.getRequestMap();





    }

}
