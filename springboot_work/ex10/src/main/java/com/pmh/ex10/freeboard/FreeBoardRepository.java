package com.pmh.ex10.freeboard;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FreeBoardRepository extends JpaRepository<FreeBoard,Long> {


    // JPQL 문법
    @Modifying
    @Transactional
    @Query(value = "delete from FreeBoard fb WHERE fb.idx = :idx")
    void cusDeleteByIdx(@Param("idx")Long idx);
    // 삭제를 할때 프리보드컨트롤러 딜리트 부분처럼 해도 되고 여기처럼 해도 된다.

    // @Test
    // void deleteJOQLTest(){
    //  freeBoardRepository.cusDeleteByIdx(4l);
    // }
}
