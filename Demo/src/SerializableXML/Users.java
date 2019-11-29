package SerializableXML;

import java.util.List;

public class Users 
{
    private List<UserData> userInfo;

    public List<UserData> getUserInfo() 
    {
        return userInfo;
    }

    public void setUserInfo(List<UserData> userInfo) 
    {
        this.userInfo = userInfo;
    }
}
