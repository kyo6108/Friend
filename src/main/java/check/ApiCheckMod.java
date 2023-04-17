package check;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import vo.ApiResultVo;

import java.util.List;
import java.util.Map;

@Service
public class ApiCheckMod {
    public void checkInitParameter(ApiResultVo apiResultVo) {
        String method = apiResultVo.getRequestMethod();
        String url = apiResultVo.getRequestUrl();
        List<String> errMsgList;
        Map<String,Object> requestBody = apiResultVo.getRequestMap();
        if (StringUtils.isBlank(method)){
            
        }





    }

}
