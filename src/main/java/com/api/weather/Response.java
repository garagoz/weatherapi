package com.api.weather;

import java.util.Date;

public class Response {
    public Response(String message) {
        this.message = message;
        this.time = (new Date()).toString();
    }
    private String message;
    private String time;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
