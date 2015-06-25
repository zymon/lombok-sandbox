package com.esolutions.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.Set;

/**
 * Created by slubieni on 6/25/15.
 */
@Builder @Getter
public class BuilderExample {
    private String name;
    private int age;
    @Singular("occupation") private Set<String> occupations;
}
