package com.lisheng.dp.filter.intf;

import com.lisheng.dp.filter.main.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
