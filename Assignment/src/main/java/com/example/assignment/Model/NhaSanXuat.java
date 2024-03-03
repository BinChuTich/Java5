package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "nxs")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class NhaSanXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
}
