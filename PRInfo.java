package com.GraduationDesign.backend.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wzx
 * @date 2022/4/03
 */
@Data
@AllArgsConstructor
public class PRInfo {
    String owner;

    String repo;

    String pullNumber;
}
