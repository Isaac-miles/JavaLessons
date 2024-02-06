package dev.challenge2;

import dev.model.Student;
import dev.util.QueryItem;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & dev.util.QueryItem> extends ArrayList<T>{
//    private List<T> items;

    public QueryList(){}
    public QueryList(List<T> items){
        super(items);
//        this.items = items;
    }
    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
        List<S> matches = new ArrayList<>();
        for(var item: items){
            if(item.matchFieldValues(field,value)){
                matches.add(item);
            }
        }
        return matches;
    }
    public QueryList<T> getMatches(String field, String value){
        QueryList<T> matches = new QueryList<>();
        for(var item: this){
            if(item.matchFieldValues(field,value)){
                matches.add(item);
            }
        }
        return matches;
    }
}
