package com.org.userserviece.service;

import com.org.userserviece.VO.Department;
import com.org.userserviece.VO.ResponseTemplateVO;
import com.org.userserviece.entity.User;
import com.org.userserviece.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * created with love by mundiaem
 * created on 28/07/2021
 * Time: 13:08
 * ⚡  - UserServiece
 */
@Service
@Slf4j
public class UserService {
    private final static String TAG = UserService.class.getName();
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        System.out.println(user.toString());
        log.info(String.format("******** Save User @ %s", TAG));
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(long userId) {
        log.info(String.format(" getUserWithDepartment in  @ %s", TAG));
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
