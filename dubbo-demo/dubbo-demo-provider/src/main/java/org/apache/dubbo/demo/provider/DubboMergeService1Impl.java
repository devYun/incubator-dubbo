package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.IDubboMergeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luozhiyun on 2018-12-15.
 */
public class DubboMergeService1Impl implements IDubboMergeService {

    public List<String> groupList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        return arrayList;
    }

    public Map<String, Object> groupMap() {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("user1", "张三");
        map.put("user2", "李四");
        return map;
    }

    @Override
    public String[] groupArray() {
        return new String[]{"A","B","C","D"};
    }
}
