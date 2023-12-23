package com.tutorat.tutorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tutorat.tutorat.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
