package dev.lpa.util;

import dev.lpa.model.Student;

import java.util.ArrayList;

// Not sure if I need the methods
public class QueryList <T extends Student & QueryItem> extends ArrayList<T>{

//    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
//        List<S> matches = new ArrayList<>();
//
//        for(var item : items){
//            if(item.matchFieldValue(field, value)){
//                matches.add(item);
//            }
//        }
//        return matches;
//    }


//    public List<T> getMatches(String field, String value){
//        List<T> matches = new ArrayList<>();
//
//        for(var item : items){
//            if(item.matchFieldValue(field, value)){
//                matches.add(item);
//            }
//        }
//        return matches;
//    }
}
