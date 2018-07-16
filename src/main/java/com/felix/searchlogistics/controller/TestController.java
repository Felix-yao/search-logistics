package com.felix.searchlogistics.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.felix.searchlogistics.Util.https.HttpRespons;
import com.felix.searchlogistics.Util.https.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Vector;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){

        HttpUtils ht = new HttpUtils();
//        try {
//            HttpRespons rs      = ht.sendGet("http://www.kuaidi100.com/query?type=yuantong&postid=800581757027631694&temp=0.39188948193410833");
//            Vector<String> contentCollections = rs.getContentCollection();
//
//            for (int i = 0; i < contentCollections.size(); i++) {
//
//                JSONObject contentCollection_jb =  JSONObject.parseObject(contentCollections.get(i));
//
//                JSONArray contentCollection_ja = JSONArray.parseArray(String.valueOf(contentCollection_jb.get("data")));
//
//                String context = JSONObject.parseObject(String.valueOf(contentCollection_ja.get(0))).get("context").toString();
//
//                System.out.println(context);
//
////                for (int j = 0; j < contentCollection_ja.size(); j++) {
////
////                    String context = JSONObject.parseObject(String.valueOf(contentCollection_ja.get(j))).get("context").toString();
////
////                    System.out.println(context);
////
////                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        log.debug("");
        return "test";
    }

}
