package arms.exception;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendException extends Exception {

    private String errMessage;

    private List<String> errMsgList;

    public String getErrMessage() {
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


    public void exvalid() throws FriendException{
        if (this.errMessage != null || !this.errMessage.isEmpty()){
         throw this;
        }
    }
}
