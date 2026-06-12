package io.openim.android.sdk.models;

import java.io.Serializable;

/**
 * at消息 userID跟nickname映射关系
 */
public class AtUserInfo implements Serializable {
    /**
     * 被at的用户的id
     */
    private String atUserID;
    /**
     * 被at的用户的昵称
     */
    private String groupNickname;

    public String getAtUserID() {
        return atUserID;
    }

    public void setAtUserID(String atUserID) {
        this.atUserID = atUserID;
    }

    public String getGroupNickname() {
        return groupNickname;
    }

    public void setGroupNickname(String groupNickname) {
        this.groupNickname = groupNickname;
    }
}
