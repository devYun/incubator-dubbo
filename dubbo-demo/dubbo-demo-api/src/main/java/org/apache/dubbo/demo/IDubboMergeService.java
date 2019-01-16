package org.apache.dubbo.demo;

import java.util.List;
import java.util.Map;

/**
 * @author luozhiyun on 2018-12-15.
 */
public interface IDubboMergeService {
    /**
     * 测试分组聚合
     * @return
     */
    public String[] groupArray();

    /**
     * 测试分组聚合
     * @return
     */
    public List<String> groupList();

    /**
     * 测试分组聚合
     * @return
     */
    public Map<String,Object> groupMap();
}
