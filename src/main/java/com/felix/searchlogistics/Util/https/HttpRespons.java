package com.felix.searchlogistics.Util.https;

import lombok.Getter;
import lombok.Setter;
import java.util.Vector;


@Getter
@Setter
public class HttpRespons {

    public Vector<String>  contentCollection;
    public String urlString ;
    public int defaultPort ;
    public String file;
    public String host ;
    public String path ;
    public int port ;
    public String protocol ;
    public String query ;
    public String ref;
    public String userInfo;
    public String content ;
    public String contentEncoding;
    public int code;
    public String message;
    public String contentType;
    public String method;
    public int connectTimeout;
    public int readTimeout;
}
