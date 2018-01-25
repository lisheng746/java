package com.lisheng.designpattern.filter.intf;

import com.lisheng.designpattern.filter.main.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
