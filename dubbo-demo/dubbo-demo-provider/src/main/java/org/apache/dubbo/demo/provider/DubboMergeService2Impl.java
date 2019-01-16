package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.IDubboMergeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luozhiyun on 2018-12-15.
 */
public class DubboMergeService2Impl implements IDubboMergeService {

    public String[] groupArray() {
        return new String[]{"A","B","C","D","E","F"};
    }

    public List<String> groupList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("王五");
        arrayList.add("鲁智深");
        return arrayList;
    }

    public Map<String, Object> groupMap() {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("user3", "王五");
        map.put("user4", "鲁智深");
        return map;
    }
}
