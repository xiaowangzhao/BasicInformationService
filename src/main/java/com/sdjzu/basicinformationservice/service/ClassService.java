package com.sdjzu.basicinformationservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface ClassService {
    com.sdjzu.basicinformationservice.entity.Class selectbycalssname(String classname);
}
