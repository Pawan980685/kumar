package com.example.demo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByPhoneCode(String pnoneCode);

    @Query("Select p from Country p where p.phoneCode = :phoneCode and p.isoCountryCode =:isoCode")
    Country findByPhoneCodeAndIsoCountryCode(@Param("phoneCode") String phoneCode, @Param("isoCode") String isoCode);

    Country findByIsoCountryCode(String isoCountryCode);

    Page<Country> findAll(Pageable pageable);


}
