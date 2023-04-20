package check;

import arms.exception.FriendException;
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
        Map<String,Object> requestBody = apiResultVo.getRequestMap();
        FriendException friendException = new FriendException();

        if (StringUtils.isAnyBlank(method, url)) {
            friendException.setErrMessage("參數缺失 ！");
        }

        }




    }

}
