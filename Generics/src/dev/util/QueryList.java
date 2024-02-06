package dev.util;

import dev.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem>{
    private List<T> items;
    public QueryList(List<T> items){
        this.items = items;
    }

    //a generic method type is unrelated to the generic type declared on the generic class

    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
        List<S> matches = new ArrayList<>();
        for(var item: items){
            if(item.matchFieldValues(field,value)){
                matches.add(item);
            }
        }
        return matches;
    }
    public List<T> getMatches(String field, String value){
        List<T> matches = new ArrayList<>();
        for(var item: items){
            if(item.matchFieldValues(field,value)){
                matches.add(item);
            }
        }
        return matches;
    }
}
