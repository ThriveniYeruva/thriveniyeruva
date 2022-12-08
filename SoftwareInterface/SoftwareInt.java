package com.example.software.SoftwareInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.software.Model.Software;

public interface SoftwareInt extends JpaRepository<Software, Integer> {

}
