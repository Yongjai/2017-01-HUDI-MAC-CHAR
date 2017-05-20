package com.zimincom.mafiaonline.item;

import java.io.Serializable;

/**
 * Created by Zimincom on 2017. 4. 3..
 */

public class User implements Serializable {

    private long id;
    private String email;
    private String password;
    private String nickname;
    private Status status;
    private boolean isReady = false;
    private long enteredRoomId;
    private long LOBBY_ID = 0;

    public User(String nickname) {
       this.nickname = nickname;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getNickName() {
        return nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", enteredRoomId=" + enteredRoomId +
                ", LOBBY_ID=" + LOBBY_ID +
                '}';
    }

    public enum Status {
        LOBBY, READY, NOT_READY, IN_GAME;

        public boolean isReady() { return this == Status.READY; }
    }

    public boolean isReady() {
        return status.isReady();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
