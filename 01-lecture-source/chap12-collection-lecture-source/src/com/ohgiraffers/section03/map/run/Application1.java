package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*
        * Map 인터페이스의 특징
        * Collection 인터페이스와 다른 저장방식을 가진다.
        * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        * */

        /*
        * 키(key)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장순서를 유지하지 않는다.
        * 2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.
        * */

        /*
        * HashMap : 검색속도가 매우 빠르다.
        * */

        HashMap hMap = new HashMap();
        hMap.put("one", new Date());
        hMap.put(12,"red apple");
        hMap.put(33,123);

        System.out.println("hMap = " + hMap);

        hMap.put(12,"banana");
        System.out.println("hMap = " + hMap);     // 키 값이 같으면 중복 저장이 되지 않음.

        hMap.put(11,"banana");
        hMap.put(9,"banana");
        System.out.println("hMap = " + hMap);     // 키 값이 다르면 객체 중복 저장 가능.

        System.out.println("키 9의 객체 값 = " + hMap.get(9));    // 특정 키값을 가져오고 싶으면 get()으로 가져온다.

        hMap.remove(9);   // 특정 키 값을 제거하는 메소드 remove
        System.out.println("hMap = " + hMap);

        System.out.println("hMap.size() = " + hMap.size());     // 저장된 객체의 개수를 알고 싶으면 사이즈 메소드 사용.

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one","java");
        hmap2.put("two","oracle");
        hmap2.put("three","jbdc");
        hmap2.put("four","html");
        hmap2.put("five","css");


        /*반복자를 이용하여 키값을 출력*/
        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()){
            String key = (String) keyIter.next();
            String value = (String) hmap2.get(key);
            System.out.println(key+" = "+value);
        }

        /*콜렉션과 반복자를 이용하여 키값을 출력*/
        Collection<String> value = hmap2.values();
        Iterator<String> valueIter = value.iterator();
        while (valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());
        }


        /*배열을 이용하여 키값을 출력*/
        Object[] valueArr = value.toArray();
        for(int i = 0; i <valueArr.length; i++){
            System.out.println(i+" : i+valueArr[i] = " + valueArr[i]);
        }


        /*엔트리를 이용하여 키값을 출력*/
        Set<Map.Entry<String,String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String,String>> entryIter = set.iterator();
        while (entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
