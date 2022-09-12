package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Embeddable
public  class Audit {

    private LocalDateTime createdAt;

}