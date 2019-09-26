package com.example.demo.repository;

import com.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author dengqh
 * @Since 2019/9/19
 */
@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

    @Query(value = "select * from test t where t.t_id=:t_id",nativeQuery = true)
    Test getDataById(@Param("t_id") Integer t_id);

}
