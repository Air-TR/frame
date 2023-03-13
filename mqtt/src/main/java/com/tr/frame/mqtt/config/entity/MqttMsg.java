package com.tr.frame.mqtt.config.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MqttMsg {

    @NotBlank(message = "message can not be blank")
    private String message;

    @NotBlank(message = "topic can not be blank")
    private String topic;

    private Integer qos = 0;

    private Boolean retained = false;

    public MqttMsg(String message, String topic) {
        this.message = message;
        this.topic = topic;
    }

    public MqttMsg(String message, String topic, Integer qos) {
        this.message = message;
        this.topic = topic;
        this.qos = qos;
    }

}
