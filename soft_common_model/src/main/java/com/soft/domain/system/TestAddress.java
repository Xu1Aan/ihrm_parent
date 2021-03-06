package com.soft.domain.system;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @BelongsProject: ihrm_parent
 * @BelongsPackage: com.ihrm.domain.system.response
 * @Author: XuAn
 * @CreateTime: 2020-03-06 15:01
 * @Version: 1.0
 */
@Entity
@Table(name = "bs_address")
@Getter
@Setter
@NoArgsConstructor
public class TestAddress {
    @Id
    private String id;

    private String address;

    private String testId;

    private String number;

    private Integer remain;


}
