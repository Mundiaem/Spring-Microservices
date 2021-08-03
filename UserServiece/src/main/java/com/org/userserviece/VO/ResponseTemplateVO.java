package com.org.userserviece.VO;

import com.org.userserviece.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created with love by mundiaem
 * created on 28/07/2021
 * Time: 13:23
 * ⚡  - UserServiece
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;

}
