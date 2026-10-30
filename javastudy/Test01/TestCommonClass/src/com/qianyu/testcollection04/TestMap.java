package com.qianyu.testcollection04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 16:28
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class TestMap {
    static void main(String[] args) {
        /*
        增加：put(Object Key, Object Value);
        删除：clear();  remove(Object Key);
        修改：
        查看：get(Object Key);  entryKey();  keySet(); size();  values();
        判断：containsKey(Object Key);    containsValue(Object Value);
              isEmpty();   equals(Object o);
         */
        Map<String,Integer> m = new HashMap();
        m.put("lili",4399);
        m.put("nana",4897);
        m.put("feifei",7813);
        m.put("lili",4488);
        m.put("mm",4869);
        System.out.println(m.size());
        System.out.println(m);
        //remove
        m.remove("feifei");
        System.out.println(m);
        //containsKey/Value,查看
        m.containsKey("lili");
        m.containsKey("feifei");
        Map m2 = new HashMap();
        m2.put("lili",4399);
        m2.put("nana",4897);
        m2.put("lili",4488);
        m2.put("mm",4869);
        System.out.println(m2);
        //equals,比较
        System.out.println(m == m2);
        System.out.println(m2.equals(m));
        //isEmpty
        System.out.println("判断是否为空："+m2.isEmpty());
        //get(Object Key),返还对应的value
        System.out.println(m.get("nana"));
        //keySet,查看所有key（遍历）,返回值为set集合
        System.out.println(m.keySet());
        Set<String> s = m.keySet();
        for (String str:s){
            System.out.print(str+"  ");
        }
        System.out.println();
        //values,查看所有value（遍历），返回值为collection集合
        Collection<Integer> col = m.values();
        System.out.println(m.values());
        for (Integer i:col){
            System.out.print(i+"  ");
        }
        System.out.println();
        //get,keyset结合遍历
        Set<String> strings = m.keySet();
        for (String str:strings){
            System.out.print(m.get(str)+"  ");
        }
        System.out.println();
        //entryset,返回的是Map中entry接口的实现类
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        for (Map.Entry e:entries){
            System.out.println(e.getKey()+"----"+e.getValue());
        }
    }
}
