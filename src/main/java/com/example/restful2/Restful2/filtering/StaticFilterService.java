package com.example.restful2.Restful2.filtering;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaticFilterService
{
    private static int count = 4;
    private static List<StaticFilter> det = new ArrayList<>();

    static
    {
        det.add(new StaticFilter(6,"Pragyesh","prag12"));
        det.add(new StaticFilter(7,"Pawan","paw12"));
        det.add(new StaticFilter(8,"Divyanshu","div12"));
        det.add(new StaticFilter(9,"Anukriti","anu12"));
    }


    public List<StaticFilter> findAll()
    {
        return det;
    }
}