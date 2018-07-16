package com.felix.searchlogistics.scheduled;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.felix.searchlogistics.Util.https.HttpRespons;
import com.felix.searchlogistics.Util.https.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Vector;

@Slf4j
@Component
public class TestScheduled {

    private String context = "";

    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){

        HttpUtils ht = new HttpUtils();
        try {
            HttpRespons rs      = ht.sendGet("http://www.kuaidi100.com/query?type=yuantong&postid=800581757027631694&temp=0.39188948193410833");
            Vector<String> contentCollections = rs.getContentCollection();

            for (int i = 0; i < contentCollections.size(); i++) {

                JSONObject contentCollection_jb =  JSONObject.parseObject(contentCollections.get(i));

                JSONArray contentCollection_ja = JSONArray.parseArray(String.valueOf(contentCollection_jb.get("data")));

                String contextTemp = JSONObject.parseObject(String.valueOf(contentCollection_ja.get(0))).get("context").toString();

                if(!context.equals(contextTemp)){

                    context = contextTemp;

                    System.out.println("信息更新:---------"+context);
                }else{
                    System.out.println("信息未更新:---------"+context);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
