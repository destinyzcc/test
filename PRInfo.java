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

    public static void main(String[] args) {
        String owner = "";
        if (owner == null){
            System.out.println("111");
            System.out.println("222");
        }

        Assert.state(defaultValue != null, "Default value must not be null");
    }
}
