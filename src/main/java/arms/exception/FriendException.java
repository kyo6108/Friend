package arms.exception;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 業務邏輯Exception
 */
@Component
public class FriendException extends Exception {

    private static String errMessage;

    private static List<String> errMsgList;

    public FriendException() {
    }

    public  String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public List<String> getErrMsgList() {
        return errMsgList;
    }

    public void setErrMsgList(List<String> errMsgList) {
        this.errMsgList = errMsgList;
    }

    public FriendException(String errMessage) {
        this.errMessage = errMessage;
    }

    public FriendException(List<String> errMsgList) {
        this.errMsgList = errMsgList;
    }

    public FriendException(List<String> errMsgList , String errMessage) {
        this.errMsgList = errMsgList;
        this.errMessage = errMessage;
    }

    public void exvalid() throws FriendException {
        if (StringUtils.isNotBlank(this.errMessage) || CollectionUtils.isNotEmpty(errMsgList)) {
            throw this;
        }
    }
}
