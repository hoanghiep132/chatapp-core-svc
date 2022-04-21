package com.hiepnh.chatapp.coresvc.common;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static class Message{

        public static class Type{
            public static final int TEXT = 1;
            public static final int IMAGE = 2;
            public static final int ATTACHMENT = 3;
        }

        public static class Status{
            public static final int SENT = 1;
            public static final int DELETED = 0;
        }
    }

    public static class StatusCode {
        private StatusCode() {
        }

        public static final int SUCCESS = 200;
        public static final int CREATED = 201;
        public static final int ACCEPTED = 202;
        public static final int REDIRECT = 301;
        public static final int FOUND = 302;
        public static final int BAD_REQUEST = 400;
        public static final int UNAUTHORIZED = 401;
        public static final int FORBIDDEN = 403;
        public static final int NOT_FOUND = 404;
        public static final int CONFLICT = 409;
        public static final int INTERNAL_SERVER_ERROR = 500;
    }

}
