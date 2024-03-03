package com.example.assignment.Respository;

import com.example.assignment.Model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GioHangReposirory extends JpaRepository<GioHang, UUID> {

}
