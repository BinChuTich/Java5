package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "chuc_vu")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ma;
    private String ten;
}
