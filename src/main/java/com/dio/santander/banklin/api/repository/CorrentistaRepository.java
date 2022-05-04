package com.dio.santander.banklin.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.santander.banklin.api.model.Correntista;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {

}
